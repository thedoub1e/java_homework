import java.util.*;
public class ComputeLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input = new Scanner(System.in);
       System.out.print("enter annual interest rate, e.g,7.25: ");
       double annualInterestRate = input.nextDouble();
       double monthlyInterestRate = annualInterestRate / 1200;
       System.out.print("enter number of year as an integer,e.g,7.25: ");
       double numberOfYears = input.nextDouble();
       
       System.out.print("enter loan amount,e.g,7.25: ");
       double loanAmount = input.nextDouble();
       //
       double monthlyPayment = loanAmount*monthlyInterestRate / (1 - 1/Math.pow(1+monthlyInterestRate,
    		   numberOfYears *12));
       double totalPayment = monthlyPayment * numberOfYears *12;
       System.out.println("The monthly payment is $"+
          (int)(monthlyPayment*100)/100.0);
       System.out.println("The monthly payment is $"+
          (int)(totalPayment*100)/100.0);
	}

}
