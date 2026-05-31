import unittest
from credit_card import is_valid, get_card_type

class CreditCardTest(unittest.TestCase):

    def test_that_a_valid_visa_card_number_returns_true(self):
        self.assertTrue(is_valid("4388576018410707"))

    def test_that_an_invalid_card_number_returns_false(self):
        self.assertFalse(is_valid("4388576018402626"))

    def test_that_a_card_number_less_than_13_digits_returns_false(self):
        self.assertFalse(is_valid("123456789012"))

    def test_that_a_card_number_greater_than_16_digits_returns_false(self):
        self.assertFalse(is_valid("12345678901234567"))

    def test_that_a_valid_16_digit_card_returns_true(self):
        self.assertTrue(is_valid("4388576018410707"))

    def test_that_a_card_starting_with_4_returns_visa(self):
        self.assertEqual("Visa Card", get_card_type("4388576018410707"))

    def test_that_a_card_starting_with_5_returns_mastercard(self):
        self.assertEqual("MasterCard", get_card_type("5412345678901234"))

    def test_that_a_card_starting_with_37_returns_american_express(self):
        self.assertEqual("American Express", get_card_type("371449635398431"))

    def test_that_a_card_starting_with_6_returns_discover(self):
        self.assertEqual("Discover", get_card_type("6011000990139424"))

    def test_that_an_unknown_card_returns_invalid_card(self):
        self.assertEqual("Invalid Card", get_card_type("9999999999999999"))

