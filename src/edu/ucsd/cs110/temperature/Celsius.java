package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float value = this.getValue();
        float converted = ((value * 9) / 5) + 32;
        return new Fahrenheit(converted);
    }

    public String toString()
    {
        // TODO: Complete this method
        return getValue() + " C";
    }
}
