class Employee {
    private String empId;
    private String name;
    private String department;

    public Employee(String empId, String name, String department) {
        this.empId = empId;
        this.name = name;
        this.department = department;
    }

    public void updateDepartment(String newDepartment) {
        this.department = newDepartment;
        System.out.println("Department updated to: " + newDepartment);
    }

    public void showDetails() {
        System.out.println("ID: " + empId + ", Name: " + name + ", Department: " + department);
    }
}

