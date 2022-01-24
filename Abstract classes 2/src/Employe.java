abstract class Employe {

    static int HOWMANYMOUTHS=12;
    static int MAXWORKERS=100;
    private String name;

    public static int getHOWMANYMOUTHS() {
        return HOWMANYMOUTHS;
    }

    public static void setHOWMANYMOUTHS(int HOWMANYMOUTHS) {
        Employe.HOWMANYMOUTHS = HOWMANYMOUTHS;
    }

    public static int getMAXWORKERS() {
        return MAXWORKERS;
    }

    public static void setMAXWORKERS(int MAXWORKERS) {
        Employe.MAXWORKERS = MAXWORKERS;
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

    public Employe(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    private String surname;



    abstract int monthlyPeyments();
    abstract int yearPeyments();

}
