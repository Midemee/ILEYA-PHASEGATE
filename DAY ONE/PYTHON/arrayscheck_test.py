import unittest
from arrays_check import even_odd, is_palindrome, perfect_square, non_perfect_square


class TestArraysCheck(unittest.TestCase):

    def test_that_an_array_returns_separated_list_of_even_and_odd(self):
        numbers = [45, 60, 3, 10, 9, 22]

        actual = even_odd(numbers)
        expected = [[45, 3, 9], [60, 10, 22]]

        self.assertEqual(actual, expected)

    def test_that_an_array_is_palindrome(self):
        numbers = [45, 0, 8, 0, 45]

        actual = is_palindrome(numbers)

        self.assertTrue(actual)

    def test_that_an_array_returns_perfect_square(self):
        numbers = [4, 7, 9, 10, 16, 18]

        actual = perfect_square(numbers)
        expected = [4, 9, 16]

        self.assertEqual(actual, expected)

    def test_that_an_array_returns_non_perfect_square(self):
        numbers = [4, 7, 9, 10, 49, 6]

        actual = non_perfect_square(numbers)
        expected = [4, -1, 9, -1, 49, -1]

        self.assertEqual(actual, expected)


