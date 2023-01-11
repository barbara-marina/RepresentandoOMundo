public class User {
    private String email;
    private String name;
    private String dateOfBirth;
    String course;
    int admissionYear;
    int admissionSemester;

    public String getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getAdmissionYear() {
        return this.admissionYear;
    }

    public void setAdmissionYear(int admissionYear) {
        this.admissionYear = admissionYear;
    }
    
    public int getAdmissionSemester() {
        return this.admissionSemester;
    }

    public void setAadmissionSemester(int admissionSemester) {
        this.admissionSemester = admissionSemester;
    }
}
