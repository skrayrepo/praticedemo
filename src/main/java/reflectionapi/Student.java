package reflectionapi;

public class Student {
    private String name;
    private Integer age;
    private final String schoolName;

    public Student(String name, Integer age, String schoolName) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public Integer getAge() {
        return age;
    }

    public void getStudentInfo(){
        System.out.println("Getting the student information");
    }

    private void getStudentFees(){
        System.out.println("Getting student fees structure");
    }

    private static void getSchoolNameDetails(){
        System.out.println("School Name is NPS");
    }

    @Override
    public String toString() {
        return "Student{" +
                "schoolName='" + schoolName + '\'' +
                '}';
    }
}
