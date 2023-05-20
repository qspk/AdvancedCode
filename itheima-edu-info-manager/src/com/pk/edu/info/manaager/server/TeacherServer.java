package com.pk.edu.info.manaager.server;

import com.pk.edu.info.manaager.dao.TeacherDao;
import com.pk.edu.info.manaager.domain.Teacher;

public class TeacherServer {
    private final TeacherDao teacherDao = new TeacherDao();

    public boolean isExists(String id) {
        //1.获取库管对象中的数组
        Teacher[] teachers = teacherDao.findAllTeacher();
        boolean exists = false;

        //2.遍历数组,取出每个元素,进行判断
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];
            if (teacher != null && teacher.getId().equals(id)) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    public boolean addTeacher(Teacher teacher) {
        return teacherDao.addTeacher(teacher);
    }

    public Teacher[] findAllTeacher() {
        Teacher[] allTeacher = teacherDao.findAllTeacher();

        boolean flag = false;

        for (int i = 0; i < allTeacher.length; i++) {
            Teacher t = allTeacher[i];
            if (t != null) {
                flag = true;
                break;
            }
        }
        if (flag) {
            return allTeacher;
        } else {
            return null;
        }
    }

    public void delTeaById(String id) {
        teacherDao.delTeaById(id);
    }

    public void updateTeacher(Teacher newTeacher, String id) {
        teacherDao.updateTeacher(newTeacher, id);
    }
}
