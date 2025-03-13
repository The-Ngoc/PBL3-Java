package test;

import dao.TeacherDao;
import db.DB_Connection;
import module.Teacher;

import java.sql.Connection;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class testDB {
    public static void main(String[] args) {
        TeacherDao.getInstance().delete("T02");
    }
}
