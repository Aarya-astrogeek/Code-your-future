import java.util.*;
class Fibonacci {
  public static void main(String[] args) 
  {

    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of terms of fibonacci series that must be displayed");
    int n=sc.nextInt();
    int  firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) 
    {
      System.out.print(firstTerm + ", ");

      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}