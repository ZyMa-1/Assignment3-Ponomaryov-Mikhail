public class SchoolSubject11 {
    private String subjectName;
    private int numberOfHours;

    public void setSubjectInfo(String name, int hours) {
        this.subjectName = name;
        this.numberOfHours = hours;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public static void main(String[] args) {
        SchoolSubject11 math = new SchoolSubject11();
        math.setSubjectInfo("Mathematics", 5);

        System.out.println("Subject: " + math.getSubjectName());
        System.out.println("Hours: " + math.getNumberOfHours());
    }
}
