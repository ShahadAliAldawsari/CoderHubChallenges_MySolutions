from typing import List
def addStrNums(num1: str, num2: str) -> str:
    # write your code here ^_^
    result:str
    if(num1.isnumeric() and num2.isnumeric()):
        return (int(num1) + int(num2))
        
    else:
        return "-1"

print(addStrNums('5', 'hi'))