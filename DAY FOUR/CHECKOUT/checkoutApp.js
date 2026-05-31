const prompt = require('prompt-sync')();

let userItems = [];
let itemQuantity = [];
let itemPrice = [];
let total = [];

console.log();

let customer = prompt("Enter customer's name: ");
let cashier = prompt("Enter cashier's name: ");

let shopping = true;

while (shopping) {
    userItems.push(prompt("Enter product name: "));

    itemPrice.push(parseFloat(prompt("Enter Item Price: ")));

    itemQuantity.push(parseInt(prompt("Enter quantity: ")));

    total.push(itemPrice[itemPrice.length - 1] *
               itemQuantity[itemQuantity.length - 1]);

    let choice = prompt("Add more items? (yes/no): ");

    if (choice.toLowerCase() === "no") {
        shopping = false;
    }
}

let subtotal = 0;

for (let index = 0; index < total.length; index++) {
    subtotal += total[index];
}

let discount = subtotal * 0.10;
let vat = subtotal * 0.075;
let billTotal = subtotal - discount + vat;

console.log("\nSEMICOLON STORES");
console.log("MAIN BRANCH");
console.log("Location: 312, Herbert Macaulay Way, Sabo Yaba, Lagos");
console.log("Tel: 03293828343");
console.log("Cashier: " + cashier);
console.log("Customer name: " + customer);
console.log("-------------------------------");

console.log("Item\tQty\tPrice\tTotal");
console.log("-------------------------------");

for (let index = 0; index < userItems.length; index++) {
    console.log(
        `${userItems[index]}\t${itemQuantity[index]}\t${itemPrice[index].toFixed(2)}\t${total[index].toFixed(2)}`
    );
}

console.log("-------------------------------");
console.log("Subtotal: " + subtotal.toFixed(2));
console.log("Discount: " + discount.toFixed(2));
console.log("VAT (7.5%): " + vat.toFixed(2));
console.log("Bill Total: " + billTotal.toFixed(2));

let paid = parseFloat(prompt("Amount Paid: "));
let balance = paid - billTotal;

console.log("Balance: " + balance.toFixed(2));
console.log("-------------------------------");
console.log("          THANK YOU");
