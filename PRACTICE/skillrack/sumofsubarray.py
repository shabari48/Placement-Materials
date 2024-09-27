r=int(input())
c=int(input())

mat=[]
for i in range(r):
    mat.append(list(map(int,input().split())))

x1,y1,x2,y2=map(int,input().split())

if x1>=r or x2>=r or y1>=c or y2>=c:
    print(-1)
    
else:
    sum=0
    for  i in range(x1,x2+1):
        for j in range(y1,y2+1):
            print(mat[i][j],end=" ")
            sum+=mat[i][j]
        print()
    print(sum)


    
