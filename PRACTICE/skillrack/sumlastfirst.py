n,nums=int(input()),map(int,input().split())
pow10=lambda n: pow10(n//10)*10 if n>9 else 1

prev=next(nums)
tot=prev