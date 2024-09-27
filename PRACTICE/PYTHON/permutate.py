def permutate(nums,l,r,ans):
    
    if l==r:
        ans.append(nums)
    else:
        for i in range(l,r):
            nums[l],nums[i]=nums[i],nums[l]
            permutate(nums,l+1,r,ans)
            nums[l],nums[i]=nums[i],nums[l]
            
    
nums=[1,2,3]
ans=[]
permutate(nums,0,3,ans)
print(ans)
