public enum Pizza {
    MARGHERITA ("sos pomidorowy + ser"),
    CAPRICIOSA ("sos pomidorowy + ser + pieczarki"),
    PROSCIUTTO ("sos pomidorowy + ser + szynka"),
    CHLOPSKA("Kiełbasa");


   private final String description;

    Pizza(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return  "Składniki pizzy: " + description; }




}
