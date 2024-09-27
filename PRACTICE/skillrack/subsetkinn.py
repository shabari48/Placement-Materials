n = 900456
k = 3
x=9

# Convert n to a string
n_str = str(n)

# Generate all pairs of size k from the digits of n
subsets = [int(n_str[i:i+k]) for i in range(len(n_str)-k+1)]

# Filter out numbers of size k from subsets list
filtered_subsets = [num for num in subsets if len(str(num)) == k]

result=[num for num in filtered_subsets if num%x==0]

print(len(result))
