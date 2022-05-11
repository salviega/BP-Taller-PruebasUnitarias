package co.com.sofka.app;

import junit.framework.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Locale;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {

    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    void sum() {
        //Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long result;
        //Act
        result = basicCalculator.sum(number1, number2);
        //Assert
        assertEquals(2L, result);
    }

    @Test
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0, 1,  1",
            "1, 2,  3",
            "49, 51, 100",
            "1, 100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + "+" + second + " should equal" + expectedResult);
    }
    @Test
    void substract() {
        //Arrange
        Long number1 = 1L;
        Long number2 = 20L;
        Long result;
        //Act
        result = basicCalculator.substract(number1,number2);
        //Assert
        assertEquals(-19L,result);
    }
    @Test
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "2, 4, -2",
            "8, 4, 4",
            "21, 3, 18",
            "100, 50, 50"
    })
    public void severalSubstracts(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.substract(first, second),
                () -> first + "-" + second + " should equal" + expectedResult);
    }
    @Test
    void multiply() {
        //Arrange
        Long number1 = 123L;
        Long number2 = 22L;
        Long result;
        //Act
        result = basicCalculator.multiply(number1,number2);
        //Assert
        assertEquals(2706L, result);
    }
    @Test
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "2, 2, 4",
            "5, 5, 25",
            "7, 3, 21",
            "2, 10, 20"
    })
    public void severalMultiplies(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.multiply(first, second),
                () -> first + "*" + second + " should equal" + expectedResult);
    }
    @Test
    void divide() {
        //Arrange
        Long number1 = 12L;
        Long number2 = 2L;
        Double result;
        //Act
        result = basicCalculator.divide(number1, number2);
        //Assert
        assertEquals(6L,result);
    }
    @Test
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "100, 2, 50",
            "21, 7, 3",
            "55, 5, 11",
            "9, 3, 3"
    })
    public void severalDivides(Long first, Long second, Double expectedResult) {
        assertEquals(expectedResult, basicCalculator.divide(first, second),
                () -> first + "/" + second + " should equals" + expectedResult);
    }
}