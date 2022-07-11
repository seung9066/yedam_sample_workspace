package homework;

import java.util.HashMap;

public class StudentExample {
    public static void main(String[] args) {
        // Student 키로 총점을 저장하는 HashMap 객체 생성
        HashMap<Student_override_equals_hashcode, String> hashMap = new HashMap<Student_override_equals_hashcode, String>();

        // new Student("1")의 점수 95를 저장
        hashMap.put(new Student_override_equals_hashcode("1"), "95");

        // new Student("1")로 점수를 읽어줌
        String score = hashMap.get(new Student_override_equals_hashcode("1"));
        System.out.println("1번 학생의 총점 : " + score);
    }
}
