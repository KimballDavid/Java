/*
Property of David Kimball, Student National University
*/
import java.util.Scanner;

public class Switch
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A, B, or C for quality: ");
        //input = input.toUpperCase();
        char qCode = input.next().charAt(0);
        
        
        switch(qCode){
            case 'A':
            case 'a':
            {
                System.out.println("High Quality");
                break;
            }
            
           
            case 'B':
            case 'b':
            {
                System.out.println("Medium Quality");
                break;
            }
            
            case 'C':
            case 'c':
            {
                System.out.println("low Quality");
                break;
            }
            
            
            default:
            {
                System.out.println("Error: Unknown Code");
                break;
            }

        }
        input.close();
    }
}