import numpy as np
arr=[2,3,1]

list1=list(set(arr))
a1=np.array(arr)
a2=np.array(list1)
ans=list(np.subtract(a1,a2))
print(ans)