const {evenOdd, isPalindrome, perfectSquare, nonPerfectSquare} = require('./arraysCheck');

test('that an array returns separated list of even and odd', () => {
    const numbers = [45, 60, 3, 10, 9, 22];

    const actual = evenOdd(numbers);
    const expected = [[45, 3, 9], [60, 10, 22]];

    expect(actual).toEqual(expected);
});


test('that an array is palindrome', () => {
    const numbers = [45, 0, 8, 0, 45];

    const actual = isPalindrome(numbers);

    expect(actual).toBe(true);
});


test('that an array returns perfect square', () => {
    const numbers = [4, 7, 9, 10, 16, 18];

    const actual = perfectSquare(numbers);
    const expected = [4, 9, 16];

    expect(actual).toEqual(expected);
});


test('that an array returns non perfect square', () => {
    const numbers = [4, 7, 9, 10, 49, 6];

    const actual = nonPerfectSquare(numbers);
    const expected = [4, -1, 9, -1, 49, -1];

    expect(actual).toEqual(expected);
});
