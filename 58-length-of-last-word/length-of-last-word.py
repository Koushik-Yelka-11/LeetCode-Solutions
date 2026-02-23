class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        lst=s.split()
        lastIndex=len(lst)-1
        return len(lst[lastIndex])