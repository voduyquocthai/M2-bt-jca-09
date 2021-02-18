package Entities;

public class Candidate {

    private int id;

    private String name;

    private String address;

    private String area;

    private String grade;

    public Candidate() {
    }

    public Candidate(int id, String name, String address, String area, String grade) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.area = area;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getExamSubjects(){
        String grade = this.grade;
        String result = null;
        switch (grade){
            case "A":
                result = "Subjects: Math, Physics, Chemistry";
                break;
            case "B":
                result = "Subjects: Math, Chemistry, Biology";
                break;
            case "C":
                result = "Subjects: Literature, History, Geography";
                break;
            default:
                result = "Invalid Grade !";
        }
        return result;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", area='" + area + '\'' +
                ", grade='" + grade + '\'' + ", " + this.getExamSubjects() +
                '}';
    }
}
