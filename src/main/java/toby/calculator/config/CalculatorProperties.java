package toby.calculator.config;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CalculatorProperties
{
    public static final String MAXIMUM_DECIMAL_PLACES_KEY = "maximumDecimalPlaces";
    private static final String CALCULATOR_PROPERTIES_FILE_PATH = "src/main/resources/calculator.properties";
    private static final Properties CALCULATOR_PROPERTIES = new Properties();

    static
    {
        try
        {
            CALCULATOR_PROPERTIES.load(new FileInputStream(CALCULATOR_PROPERTIES_FILE_PATH));
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static String getCalculatorProperty(final String propertyKey)
    {
        return CALCULATOR_PROPERTIES.getProperty(propertyKey);
    }
}
