# schedule = [[[1,3],[6,7]],[[2,4]],[[2,5],[9,12]]]
schedule = [[[1,2],[5,6]],[[1,3]],[[4,10]]]
arr=[]

for i in  schedule:
    for j in i:
        arr.append(j)

arr.sort(key= lambda x: x[0])

i,j=0,1

merged=[]

while j<len(arr):
    if arr[j][0]<=arr[i][1]:
        arr[i][1]=max(arr[i][1],arr[j][1])
    else:
        merged.append(arr[i])
        i=j
    
    j+=1
    
merged.append(arr[i])

print(merged)

i,j=0,1
ans=[]
print(merged[i][1],merged[j][0])


    