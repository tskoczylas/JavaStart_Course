public class Student {
    University university=new University();
    String name;
    String surname;
    String indexNumber;

    public Student(String name, String surname, String indexNumber) {
        this.name = name;
        this.surname = surname;
        this.indexNumber = indexNumber;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }


}
