/*
Property of David Kimball, Student National University
*/
public class Employee
{
    private String m_firstName;
    private String m_lastName;
    private double m_salary;

    // ctor with parameters

    public Employee()
    {
        
    }


    public Employee(String fN, String lN, double salary)
    {
        this.m_firstName = fN;
        this.m_lastName = lN;
        if(salary < 0)
            this.m_salary = 0;
        else
            this.m_salary = salary;
    }

    // setters

    public void setFirstName(String m_firstName)
    {
        this.m_firstName = m_firstName;
    }

    public void setLastName(String m_lastName) {
        this.m_lastName = m_lastName;
    }

    public void setSalary(double m_salary) {
        if(m_salary < 0)
            this.m_salary = 0;
        else
            this.m_salary = m_salary;
    }

    // getters

    public String getFirstName() {
        return m_firstName;
    }

    public String getLastName() {
        return m_lastName;
    }

    public double getSalary() {
        return m_salary;
    }

}

