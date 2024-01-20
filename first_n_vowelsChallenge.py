
# Challenge Link: https://coderhub.sa/challenges/a25be439-0887-4775-9498-ec36eb413888/view?language=Python

from typing import List
def first_n_vowels(phrase: str, n: int) -> str:
    # write your code here ^_^
    vols_let = ''
    for char in phrase:
        if str.__contains__("aeiou",char.lower()):
            vols_let+=char
            n-=1
    if n>0:
        print("invalid")
        return ""
    return vols_let
print(first_n_vowels("Riyadh",2))