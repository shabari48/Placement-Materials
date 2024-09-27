
class Solution:
    def repeatedRows(self, arr, m ,n):
        #code here
        s=set()
        res=[]
        for i in range(m):
            no=0
            for j in range(n):
                no+=(arr[i][j]<<j)
                
            if no in s:
                res.append(i)
            else:
                s.add(no)
                
                
        return res
    
#     << left shift operator is same as multiplying by power of 2

    
# Example 1:
# a = 5 = 0000 0101 (Binary)
# a << 1 = 0000 1010 = 10  5*(2^1)
# a << 2 = 0001 0100 = 20    5*(2^2)

# Example 2:
# b = -10 = 1111 0110 (Binary)
# b << 1 = 1110 1100 = -20
# b << 2 = 1101 1000 = -40 

#    >>right shift operator is same as dividing by power of 2

# Example 1:
# a = 10 = 0000 1010 (Binary)
# a >> 1 = 0000 0101 = 5

# Example 2:
# a = -10 = 1111 0110 (Binary)
# a >> 1 = 1111 1011 = -5 