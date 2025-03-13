package module;

public class Class {
    private String idClass;
    private String nameClass;
    private int numberOfStudents;

    public Class(String idClass, String nameClass, int numberOfStudents) {
        this.idClass = idClass;
        this.nameClass = nameClass;
        this.numberOfStudents = numberOfStudents;
    }

    public String getIdClass() {
        return idClass;
    }

    public void setIdClass(String idClass) {
        this.idClass = idClass;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
}
