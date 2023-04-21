package advancedjava;

class Student {
    private String name;
    private String regNo;
    private String branch;
    private double cgpa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}

public class que11 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Risha Rahaman");
        student.setRegNo("20BCE11013");
        student.setBranch("Computer Science");
        student.setCgpa(8.47);

        System.out.println("Name: " + student.getName());
        System.out.println("Registration Number: " + student.getRegNo());
        System.out.println("Branch: " + student.getBranch());
        System.out.println("CGPA: " + student.getCgpa());
    }
}
