def is_complete_fibonacci_sequence(lst):
    if len(lst) < 2 or lst[0] != 1 or lst[1] != 1:
        return False
    for i in range(2, len(lst)):
        if lst[i-2] + lst[i-1] != lst[i]:
            return False
    return True

numbers = [ 2, 3, 5, 8, 13, 21]

if is_complete_fibonacci_sequence(numbers):
    print("YES")
else:
    print("NO")