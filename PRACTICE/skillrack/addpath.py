row=int(input("Enter the number of rows:"))
col=int(input("Enter the number of columns:"))
matrix=[]
for i in range(row):
    a=[]
    for j in range(col):
        a.append(int(input()))
    matrix.append(a)


direction=input("Enter the direction:")

list1=[]
list1.append(matrix[0][0])

i=0
j=0
for ch in direction:
    if ch=='E':
        j+=1
        list1.append(matrix[i][j])
    elif ch=='W':
        j-=1
        list1.append(matrix[i][j])
    elif ch=='N':
        i-=1
        list1.append(matrix[i][j])
    elif ch=='S':
        i+=1
        list1.append(matrix[i][j])
        

list1 = list(set(list1))
print(sum(list1))
