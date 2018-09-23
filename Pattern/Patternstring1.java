import java.util.Scanner;
class Patternstring1
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Any String");
String str=sc.next();
for(int i=0;i<str.length();i++)
System.out.println(str.substring(0,i+1));
			
}
}