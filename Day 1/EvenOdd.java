import java.util.Scanner;

public class EvenOdd {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter a number to check even or odd: ");
      int num = sc.nextInt();

      if(num % 2 == 0) {
        System.out.println("The number is Even.");
      }
      else {
        System.out.println("The number is Odd.");
      }
  }
}
