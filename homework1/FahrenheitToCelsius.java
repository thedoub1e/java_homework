import java.util.*;
public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a degree in Fahrengeit : ");
      double fah = input.nextDouble();
      double cel = (5.0/9)* (fah -32);
      System.out.println("Fahrenheit "+fah + " is "+cel + " in Celsius ");
	}

}
