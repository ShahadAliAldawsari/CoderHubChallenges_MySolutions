![image](https://github.com/ShahadAliAldawsari/CoderHubChallenges_MySolutions/assets/129079179/bcb7606c-a5b1-462d-97b0-12555e559efc)
from typing import List
import re
def math_expr(expr: str) -> bool:
    # write your code here ^_^
    splited_values = re.split(r'[*+/-]', expr)
    for char in splited_values:
        if not char.isdigit():
            return False
    return True

print(math_expr("6/1"))
