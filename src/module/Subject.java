package module;

public class Subject {
    private String idSubject;
    private String nameSubject;
    private int numberOfCredits;

    public Subject(String idSubject, String nameSubject, int numberOfCredits) {
        this.idSubject = idSubject;
        this.nameSubject = nameSubject;
        this.numberOfCredits = numberOfCredits;
    }

    public String getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(String idSubject) {
        this.idSubject = idSubject;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }
}
