
import java.util.Scanner;
public class Assignment2 {


 //function to checkPalindrome

       public main checkPalindrome(int n)  {
	void getdata(){
 
	int n,x;

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n value");
	n=sc.nextInt();
	 }
	void Palindrome()
	{
	int rev=0,temp=n;
        while(temp!=0)
        {
            rev=rev*10+(temp%10);
            temp=temp/10;
        }
        if(rev==n)
            System.out.println("It is Palindrome number");
        else
            System.out.println("It is not a Palindrome number");

	}
      	}
public static void main(String[] args){
 Assignment2 obj = new Assignment2();
obj.Palindrome();
obj.getdata();
}