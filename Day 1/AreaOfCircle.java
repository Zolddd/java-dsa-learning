import java.util.Scanner;

public class AreaOfCircle {
  public static void main(String[] args) {
    double pi = 3.14159;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the value of r: ");
    int r = sc.nextInt();

    double formula = pi * Math.pow(r, 2);

    System.out.println("Area of Circle: " + formula);
  }
}
