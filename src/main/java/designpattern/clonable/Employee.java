package designpattern.clonable;

public class Employee implements Cloneable{
    private String name;
    private String code;
    private Integer age;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Employee(this);
    }

    public Employee(Employee other) {
        this.name = other.name;
        this.age = other.age;
        this.code = other.code;
    }

    public Employee(String name, String code, Integer age) {
        this.name = name;
        this.code = code;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", age=" + age +
                '}';
    }
}
