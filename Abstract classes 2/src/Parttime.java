public class Parttime extends Employe {
   private int workingHoursInYear;
    private int hourSallary;

    public Parttime(String name, String surname, int workingHoursInYear, int hourSallary) {
        super(name, surname);
        this.workingHoursInYear = workingHoursInYear;
        this.hourSallary = hourSallary;
    }

    public int getWorkingHoursInYear() {
        return workingHoursInYear;
    }

    public void setWorkingHoursInYear(int workingHoursInYear) {
        this.workingHoursInYear = workingHoursInYear;
    }

    public int getHourSallary() {
        return hourSallary;
    }

    public void setHourSallary(int hourSallary) {
        this.hourSallary = hourSallary;
    }

    @Override
    public String toString() {
        return "Pracownicy niepełno etatowi:" + getName() + "  " + getSurname() +  "  "+
                "Zarobki miesięczne=" + monthlyPeyments() +
                "Zarobki roczne" + yearPeyments();
    }

    @Override
    public int monthlyPeyments() {
       return workingHoursInYear*hourSallary/Employe.HOWMANYMOUTHS;
    }

    @Override
    public int yearPeyments() {
        return workingHoursInYear*hourSallary;
    }
}
