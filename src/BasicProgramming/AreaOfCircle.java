package BasicProgramming;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double r=scanner.nextDouble();

        double area=3.1416*r*r;

        System.out.println("The area is: "+area);
    }
}
