r = int(input("Enter the number of rows: "))
c = int(input("Enter the number of columns: "))
m = []

for i in range(r):
    row_input = input(f"Enter {c} numbers separated by space for row {i + 1}: ")
    a = list(map(int, row_input.split()))
    m.append(a)

print(m)
