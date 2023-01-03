# Question number: 150
# Question name: Evaluate Reverse Polish Notation

class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack=[]
        for i in tokens:
            if(i.isnumeric()):
                stack.append(i)

            elif(len(i)>1):
                if(i.startswith("-") and i[1:].isdigit()):
                    stack.append(i)
            else:
                a=int(stack.pop())
                b=int(stack.pop())
                # sol=(ops[i](b,a))
                if(i=="+"):
                    print(b+a)
                    stack.append(b+a)
                elif(i=="-"):
                    print(b-a)
                    stack.append(b-a)
                elif(i=="/"):
                    print(b/a)
                    stack.append(b/a)
                elif(i=="*"):
                    print(b*a)
                    stack.append(b*a)
                
                
            

        return int(stack.pop())