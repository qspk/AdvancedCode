package com.pk.edu.info.manaager.factory;

import com.pk.edu.info.manaager.dao.BaseStudentDao;
import com.pk.edu.info.manaager.dao.OtherStudentDao;

public class StudentDaoFactory {
    public static BaseStudentDao getStudentDao() {
        return new OtherStudentDao();
    }
}
