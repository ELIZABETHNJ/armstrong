# armstrong
import java.io.*;
import java.util.*;
public class Armstrongno
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner (System.in);
    int a,b,c,temp=0;
    System.out.println("Enter the number");
    a=sc.nextInt();
    b=a;
    while(a>0)
    {
      c=a%10;
      a=a/10;
      temp=temp+(c*c*c);
      }
      if(b==temp)
      {
        System.out.println("Given number is armstronger no");
      }
      else
      {
        System.out.println("Given number is not armstronger no");
      }
    }
  }
