import java.util.*;
public class SaleTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input = new Scanner(System.in);
       System.out.print("Enter Purchase amount: ");
       double purchaseAmount = input.nextDouble();
       double tax = purchaseAmount * 0.06;
       System.out.println("sales tax is $"+(int)(tax*100)/100.0);
	}

}
