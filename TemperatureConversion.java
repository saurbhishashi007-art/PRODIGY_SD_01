package tasks;
import java.util.Scanner;
public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("***Temperature Convertor***");
		System.out.println("1.Celcuis");
		System.out.println("2. Fahrenheit");
		System.out.println("3. Kelvin");
		
		System.out.println("Enter choice from1 to 3");
		int ch= sc.nextInt();
		
		System.out.println("Enter Temperature:");
		double temp=sc.nextDouble();
		
		
		 double celsius, fahrenheit, kelvin;

	        switch (ch) {

	            case 1: 
	            	// Celsius
	                fahrenheit = (temp * 9 / 5) + 32;
	                kelvin = temp + 273.15;

	                System.out.println("\nConverted Temperatures:");
	                System.out.printf("Fahrenheit: %.2f °F%n", fahrenheit);
	                System.out.printf("Kelvin: %.2f K%n", kelvin);
	                break;
	                
	            case 2: 
	            	// Fahrenheit
	                celsius = (temp - 32) * 5 / 9;
	                kelvin = celsius + 273.15;

	                System.out.println("\nConverted Temperatures:");
	                System.out.printf("Celsius: %.2f °C%n", celsius);
	                System.out.printf("Kelvin: %.2f K%n", kelvin);
	                break;
	                
	            case 3:
	            	// Kelvin
	                if (temp < 0) {
	                    System.out.println("Invalid Kelvin temperature!");
	                    break;
	                }

	                celsius = temp - 273.15;
	                fahrenheit = (celsius * 9 / 5) + 32;

	                System.out.println("\nConverted Temperatures:");
	                System.out.printf("Celsius: %.2f °C%n", celsius);
	                System.out.printf("Fahrenheit: %.2f °F%n", fahrenheit);
	                break;

	            default:
	                System.out.println("Invalid Choice!");
	        }

	        sc.close();
		

	}

}
