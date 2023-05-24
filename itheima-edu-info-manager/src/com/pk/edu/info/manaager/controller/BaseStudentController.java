package com.pk.edu.info.manaager.controller;

import com.pk.edu.info.manaager.domain.Student;
import com.pk.edu.info.manaager.server.StudentServer;

import java.util.Scanner;

//学生管理Controller层
public abstract class BaseStudentController {
    private final Scanner sc = new Scanner(System.in);
    //创建服务层对象
    private final  StudentServer studentServer = new StudentServer();

    //学生信息管理界面
    public final void start() {
        while (true) {
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            switch (sc.next()) {
                case "1":
                    System.out.println("添加学生");
                    addStudent();
                    break;
                case "2":
                    System.out.println("删除学生");
                    deleteById();
                    break;
                case "3":
                    System.out.println("修改学生");
                    updateStudent();
                    break;
                case "4":
                    System.out.println("查看学生");
                    printAllStudent();
                    break;
                case "5":
                    System.out.println("即将退出学生管理界面,返回主界面");
                    return;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }
    }

    //修改学生信息
    public final void updateStudent() {
        String id = inputStuId();
        if (id!=null ) {
            Student newStu = inputStuInfo(id);
            studentServer.updateStudent(newStu, id);
            System.out.println("修改成功");
        }
    }

    //根据学号删除学生
    public final void deleteById() {
        String id = inputStuId();
        if (id != null) {
            studentServer.deleteById(id);
            System.out.println("删除成功");
        }
    }

    //打印所有学生信息
    public final void printAllStudent() {
        Student[] students = studentServer.findAllStudent();
        if (students != null) {
            System.out.println("学号" + "\t\t\t" + "姓名" + "\t\t" + "年龄" + "\t\t生日");
            for (Student student : students) {
                if (student == null) {
                    return;
                }
                System.out.println(student.getId() + "\t" + student.getName() + "\t\t" + student.getAge() + "\t\t" + student.getBirthday());
            }
        } else {
            System.out.println("还没有学生信息,请添加后重试");
        }
    }

    //学生信息添加
    public final void addStudent() {
        //1.录入学生信息
        //2.将学生信息封装进学生对象
        String id;
        while (true) {
            System.out.println("请输入学生id:");
            id = sc.next();
            if (studentServer.isExist(id)) {
                System.out.println("学号已存在,请重新输入");
            } else {
                break;
            }
        }
        Student student = inputStuInfo(id);
        //3.调用server层方法,将student对象传过去
        //4.根据返回值判断能否添加学生信息
        if (studentServer.addStudent(student)) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    //录入学生学号id
    public final String inputStuId(){
        Student[] students = studentServer.findAllStudent();
        String id;
        if (students == null) {
            System.out.println("当前没有学生信息,无法执行该操作");
            return null;
        } else {
            System.out.println("请输入要修改的学生的学号");
            id = sc.next();
            if (studentServer.isExist(id)) {
                return id;
            } else {
                System.out.println("查无学生信息,请检查学号后重试");
                return null;
            }
        }
    }

    //录入学生信息
    public abstract Student inputStuInfo(String id);
}





