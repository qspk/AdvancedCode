package mystatic;

public class MyStatic {
    public static void main(String[] args) {
        Student stu = new Student();
        Student.graduateFrom = "传智学院";
        System.out.println(stu);
    }
}
