package pojo;

public class Student {
    String name;
    int rollNo;
    String section;

    public Student(String name,int rollNo,String section){
        this.name = name;
        this.rollNo = rollNo;
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

    public String getSection() {
        return section;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", section='" + section + '\'' +
                '}';
    }

    public void setSection(String section) {
        this.section = section;
    }


}
