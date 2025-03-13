package module;

public class Teacher {
    private String idTeacher;
    private String nameTeacher;
    private String email;
    private String SDT;
    private String idSubject;
    private String idFaculty;

    public Teacher(String idTeacher, String nameTeacher, String email, String SDT, String idSubject, String idFaculty) {
        this.email = email;
        this.idFaculty = idFaculty;
        this.idSubject = idSubject;
        this.idTeacher = idTeacher;
        this.nameTeacher = nameTeacher;
        this.SDT = SDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdFaculty() {
        return idFaculty;
    }

    public void setIdFaculty(String idFaculty) {
        this.idFaculty = idFaculty;
    }

    public String getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(String idSubject) {
        this.idSubject = idSubject;
    }

    public String getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(String idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
}
