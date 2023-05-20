package com.pk.edu.info.manaager.dao;

import com.pk.edu.info.manaager.domain.Teacher;

public class TeacherDao {
    private final static Teacher[] teachers = new Teacher[5];
    static{
        teachers[0] = new Teacher("heimaAAA", "t1", "45", "1987-21-32");
    }
    public Teacher[] findAllTeacher() {
        return teachers;
    }

    public boolean addTeacher(Teacher teacher) {
        int index = -1;
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher1 = teachers[i];
            if (teacher1 == null) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return false;
        } else {
            teachers[index] = teacher;
            return true;
        }
    }

    public void delTeaById(String id) {
        //1.查询id在数组中的索引位置
        int index = getIndex(id);
        //2.将该索引位置的元素,使用null进行替换
        teachers[index] = null;
    }

    private int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];
            if (teacher != null && teacher.getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void updateTeacher(Teacher newTeacher, String id) {
        int index = getIndex(id);
        teachers[index] = newTeacher;
    }
}
