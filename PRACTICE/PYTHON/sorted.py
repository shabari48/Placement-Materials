# Defining the 2D list
list_2d = [[1, 2, 0], [0, 5, 2], [3, 4, 1]]

# Sorting the list based on the second element of the inner lists (the end value)
sorted_list_2d = sorted(list_2d, key=lambda x: x[1])

# Output the sorted list
print(sorted_list_2d)