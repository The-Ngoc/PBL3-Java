package dao;
import db.DB_Connection;
import module.Teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class TeacherDao implements Dao<Teacher>{

    public static TeacherDao getInstance(){
        return new TeacherDao();
    }


    @Override
    public int insert(Teacher teacher){
        try {
            Connection c = DB_Connection.getConnection();
            String sql = "INSERT INTO giangvien(idTeacher, nameTeacher, email, SDT, idSubject, idFaculty) " +
                         "VALUE(?,?,?,?,?,?)";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1,teacher.getIdTeacher());
            ps.setString(2,teacher.getNameTeacher());
            ps.setString(3,teacher.getEmail());
            ps.setString(4,teacher.getSDT());
            ps.setString(5,teacher.getIdSubject());
            ps.setString(6,teacher.getIdFaculty());

            int result = ps.executeUpdate();
            DB_Connection.closeConnection(c);
            System.out.println("Ok " + result);
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int update(Teacher teacher) {
        Connection c = DB_Connection.getConnection();

        try {
            String sql = " UPDATE giangvien SET nameTeacher = ?,email = ?,SDT = ? " +
                         "WHERE idTeacher = ?";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1,teacher.getNameTeacher());
            ps.setString(2,teacher.getEmail());
            ps.setString(3,teacher.getSDT());
            ps.setString(4,teacher.getIdTeacher());

            int result = ps.executeUpdate();
            ps.close();
            DB_Connection.closeConnection(c);
            System.out.println("Ok" + result);
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int delete(String id) {
        int result = 0;
        try {
            Connection connection = DB_Connection.getConnection();
            String sql = "DELETE FROM giangvien " +
            "WHERE idTeacher = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,id);

            result  = ps.executeUpdate();
            ps.close();
            DB_Connection.closeConnection(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    @Override
    public ArrayList<Teacher> sellectAll() {
        ArrayList<Teacher> list = new ArrayList<>();
        try {
            Connection c = DB_Connection.getConnection();
            String sql = "SELECT * FROM giangvien";
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Teacher teacher = new Teacher(
                        rs.getString("idTeacher"),
                        rs.getString("nameTeacher"),
                        rs.getString("email"),
                        rs.getString("SDT"),
                        rs.getString("idSubject"),
                        rs.getString("idFaculty"));
                list.add(teacher);
            }
            System.out.println("Ok");
            rs.close();
            ps.close();
            DB_Connection.closeConnection(c);
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Teacher sellectById(String id) {
        Teacher teacher = null;
        try {
            Connection c = DB_Connection.getConnection();
            String sql = "SELECT * FROM giangvien " +
                         "WHERE idTeacher = ?";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1,id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                teacher = new Teacher(
                        rs.getString("idTeacher"),
                        rs.getString("nameTeacher"),
                        rs.getString("email"),
                        rs.getString("SDT"),
                        rs.getString("idSubject"),
                        rs.getString("idFaculty"));
            }
            rs.close();
            ps.close();
            DB_Connection.closeConnection(c);
            System.out.println("Thanh cong");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return teacher;
    }
}
