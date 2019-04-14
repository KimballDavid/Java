/*
Property of David Kimball, Student National University
*/
import java.util.Scanner;

public class largestValue
{
    
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double m_counter;
        double m_number;
        double m_largest = 0;

        for(m_counter = 0; m_counter < 10; m_counter++)
        {
            System.out.print("Enter an integer: \n");
            m_number = input.nextInt();

            if(m_number > m_largest)
            {
                m_largest = m_number;
            }
            else
            {
                System.out.print(m_largest + " is larger than " + m_number + "\n");
            }
        }

        System.out.print("The largest integer is: " + m_largest);
        input.close();
    }
}