function evenOdd(list) {
    let even = [];
    let odd = [];

    for (let index = 0; index < list.length; index++) {
        if (list[index] % 2 === 0) {
            even.push(list[index]);
        } else {
            odd.push(list[index]);
        }
    }

    return [odd, even];
}


function isPalindrome(list) {
    let left = 0;
    let right = list.length - 1;

    while (left < right) {
        if (list[left] !== list[right]) {
            return false;
        }

        left++;
        right--;
    }

    return true;
}


function perfectSquare(list) {
    let result = [];

    for (let index = 0; index < list.length; index++) {
        let squareRoot = Math.floor(Math.sqrt(list[index]));

        if (squareRoot * squareRoot === list[index]) {
            result.push(list[index]);
        }
    }

    return result;
}


function nonPerfectSquare(list) {
    for (let index = 0; index < list.length; index++) {
        let squareRoot = Math.floor(Math.sqrt(list[index]));

        if (squareRoot * squareRoot !== list[index]) {
            list[index] = -1;
        }
    }

    return list;
}
