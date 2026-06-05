import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreditCardTest {

    @Test
    public void testThatAValidVisaCardNumberReturnsTrue() {
        assertTrue(CreditCard.isValid("4388576018410707"));
    }

    @Test
    public void testThatAnInvalidCardNumberReturnsFalse() {
        assertFalse(CreditCard.isValid("4388576018402626"));
    }

    @Test
    public void testThatACardNumberLessThan13DigitsReturnsFalse() {
        assertFalse(CreditCard.isValid("123456789012"));
    }

    @Test
    public void testThatACardNumberGreaterThan16DigitsReturnsFalse() {
        assertFalse(CreditCard.isValid("12345678901234567"));
    }

    @Test
    public void testThatAValid16DigitCardReturnsTrue() {
        assertTrue(CreditCard.isValid("4388576018410707"));
    }


    @Test
    public void testThatACardStartingWith4ReturnsVisa() {
        assertEquals("Visa Card", CreditCard.getCardType("4388576018410707"));
    }

    @Test
    public void testThatACardStartingWith5ReturnsMasterCard() {
        assertEquals("MasterCard", CreditCard.getCardType("5412345678901234"));
    }

    @Test
    public void testThatACardStartingWith37ReturnsAmericanExpress() {
        assertEquals("American Express", CreditCard.getCardType("371449635398431"));
    }

    @Test
    public void testThatACardStartingWith6ReturnsDiscover() {
        assertEquals("Discover", CreditCard.getCardType("6011000990139424"));
    }

    @Test
    public void testThatAnUnknownCardReturnsInvalidCard() {
        assertEquals("Invalid Card", CreditCard.getCardType("9999999999999999"));
    }
}
