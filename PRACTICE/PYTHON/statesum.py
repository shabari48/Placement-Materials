from fractions import Fraction
from itertools import product
from sympy import Matrix

def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def lcm(a, b):
    return a * b // gcd(a, b)

def common_denominator(fractions):
    denom = 1
    for frac in fractions:
        denom = lcm(denom, frac.denominator)
    return denom

def predict_stable_state(m, num_terminal_states):
    # Helper function to identify absorbing states
    def is_absorbing_state(i, matrix):
        return matrix[i][i] == 0 and all(matrix[i][j] == 0 for j in range(len(matrix)) if i != j)
    
    # Identify absorbing and transient states
    num_states = len(m)
    absorbing_states = [i for i in range(num_states) if is_absorbing_state(i, m)]
    transient_states = [i for i in range(num_states) if not is_absorbing_state(i, m)]
    
    if not transient_states:
        return [1] + [0] * (len(absorbing_states) - 1) + [1]
    
    # Rearrange the transition matrix Q for transient states and R for absorbing states
    Q = [[m[i][j] for j in transient_states] for i in transient_states]
    R = [[m[i][j] for j in absorbing_states] for i in transient_states]
    
    # Convert Q and R to probability matrices
    for i in range(len(Q)):
        row_sum = sum(Q[i]) + sum(R[i])
        if row_sum > 0:
            Q[i] = [Fraction(Q[i][j], row_sum) for j in range(len(Q[i]))]
            R[i] = [Fraction(R[i][j], row_sum) for j in range(len(R[i]))]
        else:
            Q[i] = [Fraction(0, 1) for j in range(len(Q[i]))]
            R[i] = [Fraction(0, 1) for j in range(len(R[i]))]

    # Calculate the Fundamental matrix F = (I - Q)^-1
    n = len(Q)
    I = [[Fraction(1 if i == j else 0, 1) for j in range(n)] for i in range(n)]
    I_minus_Q = [[I[i][j] - Q[i][j] for j in range(n)] for i in range(n)]
    
    # Inverse of I_minus_Q
    F = Matrix(I_minus_Q).inv()

    # Calculate the absorption probabilities FR
    FR = F * Matrix(R)
    
    # Extract the first row (initial state probabilities)
    probabilities = FR.row(0)
    
    # Convert probabilities to list of Fractions
    fractions = [probabilities[i].limit_denominator() for i in range(len(probabilities))]
    
    # Get common denominator
    common_denom = common_denominator(fractions)
    
    # Convert fractions to have common denominator
    numerators = [frac.numerator * (common_denom // frac.denominator) for frac in fractions]
    
    return numerators + [common_denom]

# Example usage
m = [
    [0, 1, 0, 0, 0, 1],
    [4, 0, 0, 3, 2, 0],
    [0, 0, 0, 0, 0, 0],
    [0, 0, 0, 0, 0, 0],
    [0, 0, 0, 0, 0, 0],
    [0, 0, 0, 0, 0, 0]
]
num_terminal_states = 4
print(predict_stable_state(m, num_terminal_states))  # Example output: [0, 3, 2, 1, 9]