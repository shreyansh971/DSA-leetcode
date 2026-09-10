class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums)
        exsum = (n*(n+1))//2
        return (exsum-sum(nums))