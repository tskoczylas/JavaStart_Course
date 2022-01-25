import java.util.Objects;

public class Names {
    // Year of Birth,Gender,Ethnicity,Child's First Name,Count,Rank

    private String gender;
    private String name;
    private int count;

    @Override
    public String toString() {
        return "Names{" +
                "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Names names = (Names) o;
        return count == names.count &&
                Objects.equals(gender, names.gender) &&
                Objects.equals(name, names.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, name, count);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Names(String gender, String name) {
        this.gender = gender;
        this.name = name;
    }
}