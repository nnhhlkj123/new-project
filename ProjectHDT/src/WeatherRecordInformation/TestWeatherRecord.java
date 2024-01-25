package WeatherRecordInformation;

import junit.framework.TestCase;

public class TestWeatherRecord extends TestCase {
	public void testConstructor() {
	Date D1=new Date(2,6,2010);
	Date D2=new Date(5, 7, 2011);
	Date D3=new Date(4, 6, 2011);
	
	TemperatureRange Tt1=new TemperatureRange(31, 28);
	TemperatureRange Tt2=new TemperatureRange(30, 27);
	TemperatureRange Tt3=new TemperatureRange(29, 25);
	
	TemperatureRange Tn1=new TemperatureRange(30, 26);
	TemperatureRange Tn2=new TemperatureRange(31, 29);
	TemperatureRange Tn3=new TemperatureRange(30, 27);
	
	TemperatureRange Tr1=new TemperatureRange(29, 27);
	TemperatureRange Tr2=new TemperatureRange(30, 26);
	TemperatureRange Tr3=new TemperatureRange(30, 25);
	
	WeatherRecord W1=new WeatherRecord(D1, Tt1, Tn1, Tr1, 13.2);
	WeatherRecord W2=new WeatherRecord(D2, Tt2, Tn2, Tr2, 10.5);
	WeatherRecord W3=new WeatherRecord(D3, Tt3, Tn3, Tr3, 11.13);
	}
	
}
