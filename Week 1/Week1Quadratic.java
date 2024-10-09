import java.util.Scanner;
import java.lang.*;
class Week1Quadratic
{
public static void main(String args[])
{
double a,b,c;
double r1,r2,d;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the values for a b and c:\n");
a=sc.nextDouble();
b=sc.nextDouble();
c=sc.nextDouble();

if(a==0)
{
System.out.println("Invalid!");
}

d=Math.pow(b,2.0)-4.0*a*c;

if(d>0)
{
r1=((-b)+(Math.sqrt(d)))/(double)(2*a);
r2=((-b)-(Math.sqrt(d)))/(double)(2*a);
System.out.println("Roots are "+r1+" and "+r2);
}

else if(d<0)
{
r1=(-b)/(2.0*a);
r2=Math.sqrt(-d)/(2.0*a);
System.out.println("Roots are imaginary.");
System.out.println("Roots are "+r1+"+i"+r2+" and "+r1+"-i"+r2);
}

else
{
System.out.println("Roots are Equal.");
r1=(-b)/(2.0*a);
System.out.println("Roots are "+r1+" and "+r1);
}
System.out.println("AMAL ROY 1BM23CS025.");
}
}