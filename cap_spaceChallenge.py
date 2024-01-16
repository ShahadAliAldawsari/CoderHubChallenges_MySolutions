
# Challenge Link: https://coderhub.sa/challenges/e35bb082-6cc1-4aa9-89f5-03077f5ab9f3/view?language=Python

from typing import List
def cap_space(txt: str) -> str:
    # write your code here ^_^
    for char in txt:
        if char.isupper():
            txt = txt.replace(char, " "+char.lower())
    return txt

print(cap_space("shahadAliAldawsari"))