package comparable;

public class Employee implements Comparable<Employee>{
    String name;
    int salary;
    Integer  empCode;

    public Employee(String name, int salary, Integer empCode) {
        this.name = name;
        this.salary = salary;
        this.empCode = empCode;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", empCode=" + empCode +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Integer getEmpCode() {
        return empCode;
    }

    public void setEmpCode(Integer empCode) {
        this.empCode = empCode;
    }
//overide this when we want to sort integers
    /*@Override
    public int compareTo(Employee o) {
        return o.getSalary() - this.salary;
    }*/
    @Override
    public int compareTo(Employee o) {
        return this.name.compareToIgnoreCase(o.getName());
    }
}
