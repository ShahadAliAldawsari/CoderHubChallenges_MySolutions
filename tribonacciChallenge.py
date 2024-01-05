
# Challenge Link: https://coderhub.sa/challenges/fefdfb08-8157-4dfb-b467-3f924b11e42b/view?language=Python

from typing import List
def tribonacci(num: int) -> List[int]:
    # write your code here ^_^
    result = []
    for i in range(num) :
        if (i < 3):
            result.append(1)
        elif (i >= 3):
            result.append(result[i - 1] + result[i - 2] + result[i - 3])
        
    return result

print(tribonacci(9))