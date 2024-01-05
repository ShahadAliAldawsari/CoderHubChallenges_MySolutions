
# Challenge link: https://coderhub.sa/challenges/3e97adbc-137b-46c2-9ec4-2532cebacbdf/view?language=Python


def oddsVsEvens(num: int) -> str:
    digit=0
    oddSum = 0
    evSum = 0
    result = ""
    while (num > 0):
        digit =(num - int(num / 10) * 10)
        # print("digit " + digit);
        if (digit % 2.0 == 0.0):
            evSum += digit
            # print("evSum " + evSum);
        else:
            oddSum += digit
            # print("oddSum " + oddSum)
        
        num /= 10
        num = int(num)
    
    if (evSum > oddSum):
        result = "even"

    elif (evSum < oddSum):
        result = "odd"

    else:
        result = "equal"

    return result


print(oddsVsEvens(26341))