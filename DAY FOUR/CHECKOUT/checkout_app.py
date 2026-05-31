def get_customer_details():
    customer_name = input("Enter customer's name:")
    cashier_name = input("Enter cashier's name:")
    discount_rate = float(input("Enter discount rate: "))

    return customer_name, cashier_name, discount_rate


def add_items():
    products = []
    quantities = []
    prices = []
    totals = []
    
    shopping = True
    while shopping:
        product = input("\nEnter product's name: ")
        quantity = int(input("Enter the quantity: "))
        price = float(input("Enter the price: "))
        total = quantity * price

        products.append(product)
        quantities.append(quantity)
        prices.append(price)
        totals.append(total)

        user_choice = input("Add another item? (yes/no): ").lower()

        if user_choice == "no":
            shopping = False

    return products, quantities, prices, totals

  
def print_receipt(cashier_name, customer_name, discount_rate, products, quantities, prices, totals):
    
    print()
    print("SEMICOLON STORES")
    print("MAIN BRANCH")
    print("Location: 312, Herbert Macaulay way, sabo Yaba, Lagos")
    print("Tel: 03293828343")
    print(f"Cashier: {cashier_name}")
    print(f"Customer Name: {customer_name}")
    
    print("-------------------------------")
    print("Item\tQty\tPrice\tTotal")
    print("-------------------------------")

    for index in range(len(products)):
        print(f"{products[index]}\t{quantities[index]}\t{prices[index]}\t{totals[index]}")

    print("-------------------------------")

    subtotal = sum(totals)

    discount = subtotal * (discount_rate / 100)

    vat = subtotal * 0.075

    bill_total = subtotal + vat - discount

    print(f"Subtotal: {subtotal:.2f}")
    print(f"Discount: {discount:.2f}")
    print(f"VAT (7.5%): {vat:.2f}")
    print(f"Total Bill: {bill_total:.2f}")
    amount_paid = float(input("Amount Paid: "))
    balance = amount_paid - bill_total
    print("Balance: ", balance)

    print("-------------------------------")
    print("THANK YOU FOR YOUR PATRONAGE")


def main():
    customer_name, cashier_name, discount_rate = get_customer_details()
    products, quantities, prices, totals = add_items()
    print_receipt(cashier_name, customer_name, discount_rate, products, quantities, prices, totals)

main()

