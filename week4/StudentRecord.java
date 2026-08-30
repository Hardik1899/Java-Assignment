public class StudentRecord {

    private String name;
    private String StudentId;
    private int marks;

    public StudentRecord(String name, String StudentId, int marks){

        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Name cannot be null or blank!");
        }
        if(marks < 0 && marks > 100){
            throw new IllegalArgumentException("marks must be between 0 to 100.");
        }
        if(StudentId == null || StudentId.isBlank()){
            throw new IllegalArgumentException("StudentId cannot be null or blank!");
        }

        this.name = name;
        this.StudentId = StudentId;
        this.marks = marks;
    }

    public String getName(){
        return name;
    }

    public String getStudentId(){
        return StudentId;
    }

    public int getMarks(){
        return marks;
    }

    boolean setMarks(int newmarks){
        if(newmarks < 0 || newmarks > 100){
            return false;
        }
        else{
            marks = newmarks;
            return true;
        }
    }

    public boolean hasPassed(){
        if(marks >= 40){
            return true;
        }
        return false;
    }

    public String getClassification() {
        if (marks >= 75) {
            return "A grade";
        } else if (marks >= 60) {
            return "B grade";
        } else if (marks >= 50) {
            return "C grade";
        } else if (marks >= 40) {
            return "D grade";
        } else {
            return "Fail";
        }

    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId='" + StudentId + '\'' +
                ", mark=" + marks +
                ", passed=" + hasPassed() +
                ", classification='" + getClassification() + '\'' +
                '}';
    }

}

public void main(String[] args){

    StudentRecord s1 = new StudentRecord("Hardik", "234", 90);

    System.out.println(s1.getMarks());
    System.out.println(s1.getName());
    System.out.println(s1.getStudentId());

    System.out.println(s1.toString());



}


