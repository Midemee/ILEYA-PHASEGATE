def is_valid(card_number):
    length = len(card_number)
    if length < 13 or length > 16:
        return False

    sum_one = 0
    for index in range(length - 2, -1, -2):
        digit = int(card_number[index])
        doubled = digit * 2

        if doubled > 9:
            doubled = doubled // 10 + doubled % 10
        sum_one += doubled

    sum_two = 0
    for index in range(length - 1, -1, -2):
        digit = int(card_number[index])
        sum_two += digit

    return (sum_one + sum_two) % 10 == 0


def get_card_type(card_number):
    if card_number.startswith("37"):
        return "American Express"
    elif card_number.startswith("4"):
        return "Visa Card"
    elif card_number.startswith("5"):
        return "MasterCard"
    elif card_number.startswith("6"):
        return "Discover"
    else:
        return "Invalid Card"


card_number = input("Enter your credit card number: ")

if is_valid(card_number):
    print("Credit Card Status: Valid")
else:
    print("Credit Card Status: Invalid")

print("Card Type: " + get_card_type(card_number))
