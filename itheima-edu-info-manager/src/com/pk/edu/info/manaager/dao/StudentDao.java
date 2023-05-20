package com.pk.edu.info.manaager.dao;

import com.pk.edu.info.manaager.domain.Student;

//学生管理Dao层
public class StudentDao {
    //创建存储学生信息的数组
    private final static Student[] students;

    //初始化数组(static只初始化一次 )
    static {
        students = new Student[5];
        students[0] = new Student("heima005", "赵六", "23", "2001-01-22");
    }

    //添加学生信息
    public boolean addStudent(Student student) {

        //2.1 定义数组索引index,初始化值为-1,表示数组已满,没有null元素
        int index = -1;
        //2.2 遍历数组,查看是否有数组元素为null
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                //2.3 如果为空 则结束遍历,用index记录当前数组索引,并结束循环
                index = i;
                break;
            }
        }
        if (index == -1) {
            //数组已满,无法添加学生信息
            return false;
        } else {
            //数组未满还可以添加
            students[index] = student;
            return true;
        }
    }

    //    查找全部学生信息
    public Student[] findAllStudent() {
        return students;
    }


    //根据学生id查找索引
    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId().equals(id)) {
                index = i;
            }
        }
        return index;
    }

    //根据学生学号删除学生
    public void deleteById(String id) {
        students[getIndex(id)] = null;
    }

    //修改学生信息,获得原学生信息索引再覆盖新学生信息即可
    public void updateStudent(Student student, String id) {
        students[getIndex(id)] = student;
    }
}
