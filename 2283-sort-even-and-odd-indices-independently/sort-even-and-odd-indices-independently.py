class Solution:
    def sortEvenOdd(self, nums: List[int]) -> List[int]:
        even = nums[0::2]
        odd = nums[1::2]
        even.sort()
        odd.sort(reverse = True)
        nums[0::2] = even
        nums[1::2] = odd
        return nums
   
