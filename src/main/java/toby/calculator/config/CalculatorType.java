package toby.calculator.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum CalculatorType
{
    BASIC("Basic"),
    SCIENTIFIC("Scientific");

    private final String displayName;
}
