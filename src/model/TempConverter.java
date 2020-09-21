//Kasey Marron
package model;

public class TempConverter {
	private double temp;
	private double fahrenheit;
	private double celsius;
	
	public TempConverter() {
		super();
	}
	
	public TempConverter(double temp) {
		super();
		this.temp = temp;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public double getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}

	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}

	public void c_to_f(double temp) {
		double f;		//Fahrenheit
		setCelsius(temp);
		f = temp * 9;
		f = f/5;
		f = f+32;
		setFahrenheit(f);
	}
	
	public void f_to_c(double temp) {
		double c;		//Celsius
		setFahrenheit(temp);
		c = temp - 32;
		c = c * 5;
		c = c / 9;
		setCelsius(c);
	}
	
	@Override
	public String toString() {
		return "Temp Converter: \nTemp in Fahrenheit: " + fahrenheit + "\nTemp in Celsius: "
				+ celsius;
	}
}
