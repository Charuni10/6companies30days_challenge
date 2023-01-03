# Question number: 2344

# Question name: Minimum Deletions to Make Array Divisible


import math
class Solution:
    def minOperations(self, nums: List[int], numsDivide: List[int]) -> int:
        a=math.gcd(*numsDivide)
        count=0
        nums.sort()
        for i in nums:
            if(a%i!=0):
                count+=1
            else:
                return count
        return -1