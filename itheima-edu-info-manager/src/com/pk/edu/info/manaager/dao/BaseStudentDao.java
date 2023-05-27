package com.pk.edu.info.manaager.dao;

import com.pk.edu.info.manaager.domain.Student;

//学生管理Dao层
public interface BaseStudentDao {

    //添加学生信息
    public abstract boolean addStudent(Student student);

    //    查找全部学生信息
    public abstract Student[] findAllStudent();


    //根据学生id查找索引
    public abstract int getIndex(String id);

    //根据学生学号删除学生
    public abstract void deleteById(String id);

    //修改学生信息,获得原学生信息索引再覆盖新学生信息即可
    public abstract void updateStudent(Student student, String id);
}
