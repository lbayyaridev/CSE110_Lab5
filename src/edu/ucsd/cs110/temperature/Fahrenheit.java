package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float value = this.getValue();
        float converted = ((value - 32) * 5) / 9;
        return new Celsius(converted);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        // TODO: Cmplete this method
        return getValue() + " F";
    }
}
