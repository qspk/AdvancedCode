package com.pk.edu.info.manaager.server;

import com.pk.edu.info.manaager.dao.StudentDao;
import com.pk.edu.info.manaager.domain.Student;

//学生管理Server层
public class StudentServer {
    //1.创建库管对象
    StudentDao studentDao = new StudentDao();


    public boolean addStudent(Student student) {
        //2.调用库管对象的addStudent(Student student)方法
        //3.将方法返回值返回给Controller层
        return studentDao.addStudent(student);
    }

    //判断学号是否存在
    public boolean isExist(String id) {
        Student[] students = studentDao.findAllStudent();
        for (Student student : students) {
            if (student != null && student.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    //查看所有学生信息,若没学生信息返回null
    public Student[] findAllStudent() {
        Student[] students = studentDao.findAllStudent();
        for (Student student : students) {
            if (student != null) {
                return students;
            }
        }
        return null;
    }

    //直接调用Dao层方法删去学生数据
    public void deleteById(String id) {
        studentDao.deleteById(id);

    }

//修改学生信息,直接调用Dao层方法修改数据
    public void updateStudent(Student student, String id) {
        studentDao.updateStudent(student,id);
    }
}
