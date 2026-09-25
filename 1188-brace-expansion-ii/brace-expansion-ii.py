from itertools import product

class Solution:
    def braceExpansionII(self, expression: str) -> list[str]:
        stack, union, prod = [], [], [""]
        for c in expression:
            if c.isalpha():
                prod = [v + c for v in prod]
            elif c == '{':
                stack.append(union)
                stack.append(prod)
                union, prod = [], [""]
         
         


