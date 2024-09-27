def generate_combinations(n):
    numbers = ['3', '4']
    combinations = numbers.copy()

    while len(combinations) < n:
        combinations += [num + combo for num in numbers for combo in combinations]
        combinations = list(dict.fromkeys(combinations))  # remove duplicates

    return combinations[:n]

# Example for n=5
n=int(input())
list1=generate_combinations(n)
print(list1.pop())