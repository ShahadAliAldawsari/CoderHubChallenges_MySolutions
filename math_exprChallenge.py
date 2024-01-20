
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
