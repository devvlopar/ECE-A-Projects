class Student {
    private String name;
    private int studentId;
    private String department;

    public Student(String name, int studentId, String department) {
        this.name = name;
        this.studentId = studentId;
        this.department = department;
    }

    public void updateDetails(String name, String department) {
        this.name = name;
        this.department = department;
        System.out.println("Details updated.");
    }

    public void viewDetails() {
        System.out.println("Name: " + name + ", ID: " + studentId + ", Department: " + department);
    }
}

