package com.pk.edu.info.manaager.controller;

import com.pk.edu.info.manaager.domain.Student;
import com.pk.edu.info.manaager.server.StudentServer;

import java.util.Scanner;

//学生管理Controller层
public class OtherStudentController extends BaseStudentController {
    private final Scanner sc = new Scanner(System.in);

    //录入学生信息

    @Override
    public Student inputStuInfo(String id) {
        System.out.println("请输入学生姓名:");
        String name = sc.next();
        System.out.println("请输入学生年龄:");
        String age = sc.next();
        System.out.println("请输入学生生日:");
        String birthday = sc.next();
        return new Student(id, name, age, birthday);
    }
}





