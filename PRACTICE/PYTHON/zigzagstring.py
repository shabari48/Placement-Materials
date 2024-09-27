s="PAYPALISHIRING"
n=3
curr=0
forward,backward=True,False
arr = [[] for _ in range(n)]
print(arr)


for i in s:  #every element in string
    if curr==n:
        curr-=2
        forward=False
        backward=True
    
    if curr==-1:
        curr+=2
        forward=True
        backward=False
    
    if forward and curr<n:
        arr[curr].append(i)
        curr+=1
        continue
    
    if backward and curr>=0:
        arr[curr].append(i)
        curr-=1

zigzag_string = ''.join([''.join(inner_list) for inner_list in arr])
print(zigzag_string)
     