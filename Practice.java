import java.util.*;
 
class Practice
{
	public  void getvalue(){
String original, reverse = ""; // Objects of String class
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a string to check if it's a palindrome");
    original = in.nextLine();
	int length = original.length();


}
public   reverse extends getvalue(){

String original, reverse = ""; // Objects of String class
    for (int i = length - 1; i >= 0; i--)
      reverse = reverse + original.charAt(i);

    if (original.equals(reverse))
      System.out.println("The string is a palindrome.");
    else
      System.out.println("The string isn't a palindrome.");

}
  public static void main(String args[])
  {
    Practice aa = new Practice();
	aa.getvalue();
	aa.reverse();
    
  }
  }