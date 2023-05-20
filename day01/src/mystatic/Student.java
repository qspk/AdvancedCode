package mystatic;

public class Student {
    String name;
    int age;
    static String graduateFrom;


    public Student() {
    }

    public Student(String name, int age, String graduateFrom) {
        this.name = name;
        this.age = age;
        Student.graduateFrom = graduateFrom;
    }

    /**
     * 获取
     * @return graduateFrom
     */
    public static String getGraduateFrom() {
        return graduateFrom;
    }

    /**
     * 设置
     * @param graduateFrom
     */
    public static void setGraduateFrom(String graduateFrom) {
        Student.graduateFrom = graduateFrom;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", graduateFrom = " + graduateFrom + "}";
    }
}
