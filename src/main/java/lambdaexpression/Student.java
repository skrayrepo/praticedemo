package lambdaexpression;

public class Student {
    private String name;
    private int rollNo;
    private String section;

    Student(String name,int rollNo,String section){
        this.name = name;
        this.rollNo = rollNo;
        this.section =  section;
    }
    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", section='" + section + '\'' +
                '}';
    }
}
