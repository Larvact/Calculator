package toby.calculator.config;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CalculatorType
{
    BASIC("Basic"),
    SCIENTIFIC("Scientific");

    private final String displayName;
}
