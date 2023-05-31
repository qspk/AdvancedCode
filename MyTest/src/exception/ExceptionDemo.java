package exception;

import java.util.Scanner;

public class ExceptionDemo {
    //键盘录入学生年龄 1 - 200
    //超出范围不能赋值, 需要重新赋值
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("请输入姓名: ");
        student.setName(sc.nextLine());
        while (true) {
            System.out.println("请输入年龄:");
            String ageStr = sc.nextLine();
            try {
                int age = Integer.parseInt(ageStr);
                student.setAge(age);
                break;
            } catch (AgeOutOfBoundsException e) {
                System.out.println(e.toString());
                System.out.println("请输入一个符合范围的年龄");
                continue;
            } catch (NumberFormatException e) {
                System.out.println("请输入一个整数");
                continue;
            }
        }
        System.out.println(student);

//        Student student1 = new Student("er", 324);
    }
}
