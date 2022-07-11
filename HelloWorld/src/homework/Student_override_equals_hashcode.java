package homework;

public class Student_override_equals_hashcode {
    private String StudentNum;

    public Student_override_equals_hashcode(String studentNum) {
        this.StudentNum = studentNum;
    }

    public String getStudentNum(){
        return StudentNum;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Student_override_equals_hashcode) {
            Student_override_equals_hashcode student = (Student_override_equals_hashcode) obj;
            if(StudentNum.equals(student.getStudentNum())); {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return getStudentNum().hashCode();
    }


}
