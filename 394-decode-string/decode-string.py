class Solution:
    def decodeString(self, s: str) -> str:
        stack = []
        for i in range(len(s)):
            if s[i] != "]":
                stack.append(s[i])
            else:
                # We have found a closing bracket ']', start decoding
                substr = ""
                while stack and stack[-1] != "[":
                    substr = stack.pop() + substr
                
                # Pop the opening bracket '['
                stack.pop()
                
                # Get the number (which could have more than one digit)
                k = ""
                while stack and stack[-1].isdigit():
                    k = stack.pop() + k
                
                # Repeat the substring k times and push back to stack
                stack.append(int(k) * substr)
        
        return "".join(stack)
