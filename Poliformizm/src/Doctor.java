public class Doctor extends Person {

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    private int bonus;

    public Doctor(String name, String surname, int sallary, int bonus) {
        super(name, surname, sallary);
        this.bonus = bonus;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Premia"+ bonus;
    }
}
