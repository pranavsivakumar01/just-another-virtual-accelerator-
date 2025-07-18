
class Student {
    String name;
    int age;
    static String subject;

    public void show() {
        System.out.println(name + " " + age + " " + subject);
    }
}

public class Solution {
    public static void main(String[] args) {
        Student obj = new Student();
        Student.subject = "javadeveloper";
        obj.name = "pranav";
        obj.age = 20;
       
        Student obj1 = new Student();
        obj1.name="sivakumar";
        obj1.age=34;

        obj.show(); 
        obj1.show(); 
    }
}
