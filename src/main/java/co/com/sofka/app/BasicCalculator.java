package co.com.sofka.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.lang.Double.NaN;

public class BasicCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public BasicCalculator() {

    }
    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2);
        return number1 + number2;
    }
    public Long substract(Long number1, Long number2) {
        logger.info("Substracting {} - {}", number1, number2);
        return  number1 - number2;
    }
    public Long multiply(Long number1, Long number2) {
        logger.info("Multpling {} * {}", number1, number2);
        return number1 * number2;
    }
    public Double divide(Long number1,Long number2) {

        if (number2 == 0) {
            logger.info("Can't divide by 0");
            return NaN;
        }
        logger.info("Dividing {} / {}", number1, number2);
        return (double) number1 / (double)number2;
    }
}


