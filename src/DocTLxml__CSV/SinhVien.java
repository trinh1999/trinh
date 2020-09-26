package DocTLxml__CSV;

public class SinhVien {
    private String id;
    private String firstName;
    private String lastName;
    private String marks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public SinhVien(String id, String firstName, String lastName, String marks) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.marks = marks;
    }

    public SinhVien() {
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", marks='" + marks + '\'' +
                '}';
    }
}
