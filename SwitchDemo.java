package basicsTNSIF;
import java.util.Scanner;
public class SwitchDemo {
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("enter x:");
	char x=sc.next().charAt(0);
 switch(x) {
 case'l':
 case'L':System.out.println("x is a LETTER");
 break;
 case'd':
 case'D':System.out.println("x is DIGIT");
 break;
 default:System.out.println("x is neither LETTER nior DIGIT");
 break;
 }
}
}
