package BasicProgramming;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter base value: ");
        double base=scanner.nextDouble();
        System.out.println("Enter height value: ");
        double height=scanner.nextDouble();

        double area=.5*base*height;

        System.out.println("The area of the triangle is: "+area);
    }
}
