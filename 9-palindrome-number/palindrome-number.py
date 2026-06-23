class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0 or (x % 10 == 0 and x != 0):
            return False

        r = 0
        while x > r:
            r = (x % 10) + (r * 10)
            x //= 10

        return x == r or x == r // 10