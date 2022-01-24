public class Nurse extends Person {
    private int overtime;

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    public Nurse(String name, String surname, int sallary, int overtime) {
        super(name, surname, sallary);
        this.overtime = overtime;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"Nadgodziny" + overtime;
    }
}
