package toby.calculator.config;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ResourceBundle;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CalculatorProperties
{
    public static final String APPLICATION_CSS_PATH_KEY = "applicationCssPath";
    public static final String CALCULATOR_XML_PATH_KEY = "calculatorXmlPath";
    public static final String MAXIMUM_DECIMAL_PLACES_KEY = "maximumDecimalPlaces";
    private static final String CALCULATOR_PROPERTIES_BASE_NAME = "calculator";
    public static final ResourceBundle CALCULATOR_PROPERTIES;

    static
    {
        CALCULATOR_PROPERTIES = ResourceBundle.getBundle(CALCULATOR_PROPERTIES_BASE_NAME);
    }

    public static String getCalculatorProperty(final String propertyKey)
    {
        return CALCULATOR_PROPERTIES.getString(propertyKey);
    }
}
