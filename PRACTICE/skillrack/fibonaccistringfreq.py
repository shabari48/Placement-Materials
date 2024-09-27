def is_fibo(lst):
    if len(lst)==1 and lst[0]==1: return True  #if list has only one element and its 1 then its fibonacci so true
    if len(lst) < 2 or lst[0] != 1 or lst[1] != 1: #if less than two elements irundhu or first element and second element not 1 naa
        return False    #then fibonacci illa
    for i in range(2, len(lst)):   #ipo length 2 la irundhu  n vara porom 
        if lst[i-2] + lst[i-1] != lst[i]:   # first element and second add panni third varalena 
            return False                     #odane return false
    return True   #ipo edhuna satisfy aagalena false return aagirukum . After all gets over incase no issue naa last statement varuvom and return true
                  #because no issue , so all crct and its fibonacci so true

freqtable={}
s=input()

for i in s:
    if i not in freqtable.keys():
        freqtable[i]=1
    else:
        freqtable[i]+=1

x=list(freqtable.values())
x.sort()
print(x)


if is_fibo(x):
    print("YES")
else:
    print("NO")
