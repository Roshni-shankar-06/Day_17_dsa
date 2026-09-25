from itertools import product

class Solution:
    def braceExpansionII(self, expression: str) -> list[str]:
        stack, union, prod = [], [], [""]
        for c in expression:
            if c.isalpha():
       
         


