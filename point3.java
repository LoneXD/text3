package text3;

import java.util.Scanner;

public class point3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);

	    System.out.print("Enter a point's x- and y-coordinates: ");
	    double x = input.nextDouble();
	    double y = input.nextDouble();

	    if (x > 200 || x < 0 || y > 100 || y < 0)
	      System.out.println("The point is not in the triangle");
	    else {
	      double slope = (100.0 - 0) / (0 - 200);
	      double slope1 = y / (x - 200.0);
	      if (slope1 > slope)
	        System.out.println("The point is in the triangle");
	      else
	        System.out.println("The point is not in the triangle");
	    }
	}

}
