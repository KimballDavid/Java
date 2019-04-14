/*
Property of David Kimball, Student National University
*/
import java.util.Scanner;

public class Integer 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter integer: ");
        int number = input.nextInt();
        System.out.print("The integer you entered is " + number + "\n");
        
        //Q2 integer is negative, positive, or zero
        
        if(number < 0)
            System.out.print(number + " is negative.\n");
        else if (number == 0)
            System.out.print(number + " is zero.\n");
        else 
            System.out.print(number + " is positive.\n");
        
        // Q3 even or odd
        
        if(number % 2 == 0)
            System.out.print(number + " is even\n");
        else
            System.out.print(number + " is odd.\n");
        
        input.close();
    }
}
