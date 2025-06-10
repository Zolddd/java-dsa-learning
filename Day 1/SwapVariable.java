import java.util.Scanner;

public class SwapVariable {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the vale of a: ");
    int a = sc.nextInt();

    System.out.print("Enter the value of b: ");
    int b = sc.nextInt();

    System.out.println("Before swapping: a = " + a + ", b = " + b);

    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("After swapping: a = " + a + ", b = " + b);
  }
}
