/*
Property of David Kimball, Student National University
*/
import java.util.Scanner;

public class SmallestValue
{
    
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double m_Counter;
        double m_Number;
        double m_Smallest = 100;

        System.out.print("Enter an integer: \n");
        double Counter = input.nextInt();
        for(m_Counter = 0; m_Counter < Counter; m_Counter++)
        {
            System.out.print("Enter an integer: \n");
            m_Number = input.nextInt();

            if(m_Number < m_Smallest)
            {
                m_Smallest = m_Number;
            }
            else
            {
                System.out.print(m_Smallest + " is smaller than " + m_Number + "\n");
            }
        }

        System.out.print("The smallest integer is: " + m_Smallest);
        input.close();
    }
}