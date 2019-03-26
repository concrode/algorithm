class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        if (len(s) == 0):
            return

        i = 0
        while i < len(s):
            temp = s[i]
            s[i] = s[len(s) - 1 - i]
            s[len(s) - 1 - i] = temp

            if (len(s) / 2 <= i + 1):
                break
            else:
                i = i + 1
        