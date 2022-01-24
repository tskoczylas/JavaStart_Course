public class Fulltime extends Employe {
    private int workingDays;
   private int dailyHours;
   private int hourSallary;

    public Fulltime(String name, String surname, int workingDays, int dailyHours, int hourSallary) {
        super(name, surname);
        this.workingDays = workingDays;
        this.dailyHours = dailyHours;
        this.hourSallary = hourSallary;
    }

    @Override
    public String toString() {
        return "Pracownik pełnoetowy   " + getName() + "  " + getSurname() +  "  "+
                "Zarobki miesięcxzne=" + monthlyPeyments() +
                ", Zarobki roczne=" + yearPeyments() ;
    }

    @Override
    public int monthlyPeyments() {
        return workingDays*dailyHours*hourSallary;
    }

    @Override
    public int yearPeyments() {
        return monthlyPeyments()*Employe.HOWMANYMOUTHS +(monthlyPeyments()*Employe.HOWMANYMOUTHS);
    }
}
