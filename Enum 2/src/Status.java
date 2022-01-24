public enum Status {
    NEW("Nowe"),
    PAID("Opłacone"),
    SHIPPED("Wysłane"),
    DELIVERED("Dostarczono"),
    CANCELLED("Anulowano");

    String description;

    Status(String description) {
        this.description = description;


    }
}
