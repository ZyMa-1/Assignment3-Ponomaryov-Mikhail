public class WorkingWithStudents12 {
    public class Student {
        private String name;
        private int age;
        private double gpa;

        public void displayStudentInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("GPA: " + gpa);
        }

        public void updateGPA(double newGPA) {
            this.gpa = newGPA;
        }
    }

    public static void main(String[] args) {
        WorkingWithStudents12 work = new WorkingWithStudents12();
        Student student = work.new Student();

        student.name = "Mikhail";
        student.age = 19;
        student.gpa = 2.8;

        student.displayStudentInfo();

        student.updateGPA(4.0);
        System.out.println("Updated GPA: " + student.gpa);
    }
}
