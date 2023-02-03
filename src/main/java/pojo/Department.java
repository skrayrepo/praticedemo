package pojo;

public class Department {

    private Integer departmentId;
    private String departmeName;

    public Department(Integer departmentId, String departmeName) {
        this.departmentId = departmentId;
        this.departmeName = departmeName;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmeName() {
        return departmeName;
    }

    public void setDepartmeName(String departmeName) {
        this.departmeName = departmeName;
    }
}
