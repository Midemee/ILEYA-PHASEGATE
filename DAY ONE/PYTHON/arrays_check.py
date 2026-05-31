import math

def even_odd(lst):
    even = []
    odd = []

    for num in lst:
        if num % 2 == 0:
            even.append(num)
        else:
            odd.append(num)

    return [odd, even]


def is_palindrome(lst):
    left = 0
    right = len(lst) - 1

    while left < right:
        if lst[left] != lst[right]:
            return False

        left += 1
        right -= 1

    return True


def perfect_square(lst):
    result = []

    for num in lst:
        square_root = int(math.sqrt(num))

        if square_root * square_root == num:
            result.append(num)

    return result


def non_perfect_square(lst):
    for index in range(len(lst)):
        square_root = int(math.sqrt(lst[index]))

        if square_root * square_root != lst[index]:
            lst[index] = -1

    return lst
