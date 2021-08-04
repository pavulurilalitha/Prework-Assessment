import java.util.Scanner;
public class POOJI {
public void printPattern() {

int n;
    	for (int i= 0; i<= n-1 ; i++)
    	{
        	for (int j=0; j<=i; j++)
        	{
           	 	System.out.print(" ");
        	}
        	for (int k=0; k<=n-1-i; k++)
        	{
            		System.out.print("*" + " ");
        	}
        	System.out.println();
    	}
    

      	}

public static void main(String[] args) {
  POOJI obj = new POOJI();
obj.printPattern();
int n;
}
}