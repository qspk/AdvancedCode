package exception;

public class Student {
    private String name;
    private int age;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.setAge(age);
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
    //定义年龄年龄范围 ,超出范围就扔出 自定义的异常
    public void setAge(int age) {
        if (age > 0 && age <= 200) {
            this.age = age;
        } else {
            throw new AgeOutOfBoundsException("年龄超出范围");
        }
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
