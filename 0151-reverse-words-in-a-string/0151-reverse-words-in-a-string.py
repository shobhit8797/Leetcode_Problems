class Solution:
    def reverseWords(self, s: str) -> str:
        # print(list(map(str.strip, s.strip().split())))
        return " ".join(list(map(str.strip, s.strip().split()))[::-1])