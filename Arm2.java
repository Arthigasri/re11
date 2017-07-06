# re11
import java.io.*;
  import java.util.*;       
public class Arm2
{
  public static void main(String args[])
  {
    int a,b,i,n,c,temp,count=0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Interval");
      
    System.out.println("Enter Starting Number");
    a= scan.nextInt();
    System.out.println("Enter Ending Number");
    b= scan.nextInt();
      
    for(i=a+1; i<b; i++)
    {
      temp = i;
      n = 0;
      while(temp != 0)
      {
        c = temp%10;
        n = n + c*c*c;
        temp = temp/10;
      }
      if(i == n)
      {
        if(count == 0)
        {
          System.out.print("Armstrong Numbers Between the Given Interval are :\n");
        }
        System.out.print(i + "  ");
        count++;
      }
    }
    if(count == 0)
    {
      System.out.print("Armstrong Number not Found between the Given Interval.");
    }
  }
}
