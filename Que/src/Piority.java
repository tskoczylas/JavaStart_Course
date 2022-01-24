public enum Piority  {
    LOW(1),MODERATE(2),HIGHT(3);


    public int getPiority() {
        return piority;
    }

    public void setPiority(int piority) {
        this.piority = piority;
    }

    public static int getADD() {
        return ADD;
    }

    public static int getCHEAKPIORITY() {
        return CHEAKPIORITY;
    }

    public static int getEXIT() {
        return EXIT;
    }

    Piority(int piority) {
        this.piority = piority;
    }

    private int piority;

   final static int ADD=0;
    final static int CHEAKPIORITY=1;
   final static int  EXIT=2;





}
