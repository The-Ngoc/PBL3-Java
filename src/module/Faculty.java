package module;

public class Faculty {
    private String idFaculty;
    private String nameFaculty;

    public Faculty(String idFaculty, String nameFaculty) {
        this.idFaculty = idFaculty;
        this.nameFaculty = nameFaculty;
    }

    public String getIdFaculty() {
        return idFaculty;
    }

    public void setIdFaculty(String idFaculty) {
        this.idFaculty = idFaculty;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }
}
