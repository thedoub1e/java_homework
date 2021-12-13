import java.util.*;
public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer for seconds: ");
		int seconds = input.nextInt();
		int min = seconds/60;
		int remainingSeconds = seconds % 60;
		System.out.println(seconds + " seconds is "+min+" min and "+remainingSeconds+" seconds");
	}

}
