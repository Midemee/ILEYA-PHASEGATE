function isValid(cardNumber) {
    const length = cardNumber.length;
    if (length < 13 || length > 16) {
        return false;
    }

    let sumOne = 0;
    for (let index = length - 2; index >= 0; index -= 2) {
        let digit = parseInt(cardNumber[index]);
        let doubled = digit * 2;

        if (doubled > 9) {
            doubled = Math.floor(doubled / 10) + (doubled % 10);
        }
        sumOne += doubled;
    }

    let sumTwo = 0;
    for (let index = length - 1; index >= 0; index -= 2) {
        let digit = Number(cardNumber[index]);
        sumTwo += digit;
    }

    return (sumOne + sumTwo) % 10 === 0;
}

function getCardType(cardNumber) {
    if (cardNumber.startsWith("37")) {
        return "American Express";
    } else if (cardNumber.startsWith("4")) {
        return "Visa Card";
    } else if (cardNumber.startsWith("5")) {
        return "MasterCard";
    } else if (cardNumber.startsWith("6")) {
        return "Discover";
    } else {
        return "Invalid Card";
    }
}

const cardNumber = prompt("Enter your credit card number: ");

if (isValid(cardNumber)) {
    console.log("Credit Card Status: Valid");
} else {
    console.log("Credit Card Status: Invalid");
}

console.log("Card Type: " + getCardType(cardNumber));
