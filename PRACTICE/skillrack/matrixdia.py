def find_number(matrix, num):
    for i in range(len(matrix)):
        for j in range(len(matrix[i])):
            if matrix[i][j] == num:
                return (i, j)
    return None

def print_diagonal(matrix, num):
    position = find_number(matrix, num)
    if position is None:
        print(f"Number {num} not found in the matrix.")
        return

    row, col = position
    while row > 0 and col < len(matrix[0]) - 1:
        row -= 1
        col += 1

    while row < len(matrix) and col >= 0:
        print(matrix[row][col], end=' ')
        row += 1
        col -= 1

# Example 4x4 matrix
matrix = [
    [1, 2, 3, 4],
    [5, 6, 7, 8],
    [9, 10, 11, 12],
    [13, 14, 15, 16]
]

# Given number
num = 6
print_diagonal(matrix, num)