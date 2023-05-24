package fanshe;

public class Student {
    private char name;
    private int age;

    //默认的构造方法  (default)
    Student(String str) {
        System.out.println("(默认的)构造方法 s = " + str);
    }

    //无参构造
    public Student() {
        System.out.println("调用了公有、无参构造方法");
    }

    //单参构造
    public Student(char name) {
        System.out.println("姓名: " + name);
    }

    public Student(char name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("姓名: " + name + "年龄: " + age);
    }

    //受保护的构造方法
    protected Student(boolean n) {
        System.out.println("受保护的构造方法 n = " + n);

    }

    //私有构造方法
    private Student(int age) {
        System.out.println("私有的构造方法 年龄: " + age);
    }

    /**
     * 获取
     * @return name
     */
    public char getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(char name) {
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
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
