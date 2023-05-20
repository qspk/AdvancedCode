package com.pk.edu.info.manaager.controller;

import com.pk.edu.info.manaager.domain.Teacher;
import com.pk.edu.info.manaager.server.TeacherServer;

import java.util.Scanner;

public class TeacherController {
    private final Scanner sc = new Scanner(System.in);
    private final TeacherServer teacherServer = new TeacherServer();

    //教师信息管理界面
    public void start() {
        while (true) {
            System.out.println("--------欢迎来到 <老师> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.退出");
            switch (sc.next()) {
                case "1":
                    System.out.println("添加老师");
                    addTeacher();
                    break;
                case "2":
                    System.out.println("删除老师");
                    delTeaById();
                    break;
                case "3":
                    System.out.println("修改老师");
                    updateTeacher();
                    break;
                case "4":
                    System.out.println("查看老师");
                    findAllTeacher();
                    break;
                case "5":
                    //退出
                    System.out.println("即将退出老师管理界面,返回主界面");
                    return;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }
    }

    private void updateTeacher() {
        String id = inputTeacherId();

        Teacher newTeacher = inputTeacherInfo(id);

        //调用业务员的修改方法
        teacherServer.updateTeacher(newTeacher, id);
        System.out.println("修改成功");


    }

    private void delTeaById() {
        String id = inputTeacherId();

        //2.调用业务员中的删除方法,根据id,删除老师
        teacherServer.delTeaById(id);

        System.out.println("删除成功");


    }

    private void findAllTeacher() {
        //1.从业务员中,获取老师对象数组
        Teacher[] teachers = teacherServer.findAllTeacher();

        //2.判断数组中是否有元素
        if (teachers == null) {
            System.out.println("查无信息,请添加后重试");
            return;
        }

        //3. 遍历数组,取出元素,并打印在控制台
        System.out.println("工号" + "\t\t\t" + "姓名" + "\t\t" + "年龄" + "\t\t生日");
        for (Teacher teacher : teachers) {
            if (teacher == null) {
                return;
            }
            System.out.println(teacher.getId() + "\t" + teacher.getName() + "\t\t" + teacher.getAge() + "\t\t" + teacher.getBirthday());
        }
    }

    private void addTeacher() {
        String id;
        while (true) {
            //1.接受不存在的老师id
            System.out.println("请输入老师id");
            id = sc.next();

            //2.判断id是否存在
            boolean exists = teacherServer.isExists(id);

            if (exists) {
                System.out.println("id已被占用,请重新输入");
            } else {
                break;
            }
        }

        Teacher teacher = inputTeacherInfo(id);

        //5.将封装好的老师对象,传递给TeacherServer继续完成添加操作
        boolean result = teacherServer.addTeacher(teacher);
        if (result) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    //录入老师id
    private String inputTeacherId() {
        String id;

        while (true) {
            System.out.println("请输入id:");
            id = sc.next();
            boolean exists = teacherServer.isExists(id);
            if (!exists) {
                System.out.println("您输入的id不存在,请重新输入");
            } else {
                break;
            }
        }
        return id;
    }

    //录入老师信息,封装为老师对象
    private Teacher inputTeacherInfo(String id) {
        System.out.println("请输入老师姓名:");
        String name = sc.next();
        System.out.println("请输入老师年龄:");
        String age = sc.next();
        System.out.println("请输入老师生日:");
        String birthday = sc.next();

        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setName(name);
        teacher.setAge(age);
        teacher.setBirthday(birthday);

        return teacher;
    }
}
