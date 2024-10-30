import java.util.Scanner;
public class CharAtExample4{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
for(int i=0;i<=str.length()-1;i++)
{
if(i%2!=0)
{
System.out.println("Char at"+i+"place"+str.charAt(i));
}
}
}
}
