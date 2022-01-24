public class Tire extends Part {
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWide() {
        return wide;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }

    private int size;
    private int wide;

    public Tire(int size, int wide, String setModelNumber, int setWide, int setIndentifyNumber ) {
        this.size = size;
        this.wide = wide;
        this.setModelNumber(setModelNumber);
        this.setWide(setWide);
        this.setIndentifyNumber(setIndentifyNumber);
    }

    void printInfo()
    {
        System.out.println(getSize()+getWide()+getIndentifyNumber()+getMadeBy()+getModelNumber());
    }

}
