/*
Property of David Kimball, Student National University
*/

public class EmployeeTest
{
    public static void main(String[] args)
    {
        // create two employees
        Employee employee1 = new Employee("David", "Kimball", 55000);
        Employee employee2 = new Employee("Catherine", "Kimball", 65000);

        // display employee salary
        double e1Salary = employee1.getSalary();
        System.out.println(e1Salary);

        double e2Salary = employee2.getSalary();
        System.out.println(e2Salary);

        e1Salary += (e1Salary * .10);
        System.out.println(e1Salary);

        e2Salary += (e2Salary * .10);
        System.out.println(e2Salary);

    }
}