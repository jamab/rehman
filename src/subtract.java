import java.util.Scanner;

public class subtract {

	public static void main(String args[]){
	  int x, y, z;
      System.out.println("Enter two integers to calculate their subtration ");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      y = in.nextInt();
      z = x - y;
      System.out.println("subtraction of entered integers = "+z);
	}
}
