package com.pk.edu.info.manaager.dao;

import com.pk.edu.info.manaager.domain.Student;

import java.util.ArrayList;

//学生管理Dao层
public class OtherStudentDao implements BaseStudentDao{
    //创建存储学生信息的数组
    private final static ArrayList<Student> students = new ArrayList<>();

    //初始化数组(static只初始化一次 )
    static {

        students.add(new Student("heima005", "赵六", "23", "2001-01-22"));
        students.add(new Student("heima004", "陈七", "25", "1999-01-22"));
    }

    //添加学生信息
    public boolean addStudent(Student student) {

        students.add(student);
            return true;
    }

    //    查找全部学生信息
    public Student[] findAllStudent() {
        Student[] students = new Student[OtherStudentDao.students.size()];    //OtherStudentDao.students = this.students
        for (int i = 0; i < OtherStudentDao.students.size(); i++) {
            students[i] = OtherStudentDao.students.get(i);
        }
        return students;
    }


    //根据学生id查找索引
    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) != null && students.get(i).getId().equals(id)) {
                index = i;
            }
        }
        return index;
    }

    //根据学生学号删除学生
    public void deleteById(String id) {
        students.remove(getIndex(id));
    }

    //修改学生信息,获得原学生信息索引再覆盖新学生信息即可
    public void updateStudent(Student student, String id) {
        students.set(getIndex(id), student);
    }
}
