import java.util.NoSuchElementException;

public enum Options {
    ADD("Dodaj opcje",0),
    FIND_BY_NAME("Znajdz po imieniu",1),
    FIND_BY_NUMBER("Znajdz po numeru",2),
    DELETE("Usuń kontakt",3),
    EXIT("Wyjdz z programu",4);



    final private String desriptions;
   final private int digitOptions;

    @Override
    public String toString() {
        return digitOptions + " - " +  desriptions;
    }

    public int getDigitOptions() {
        return digitOptions;
    }

    static Options convertToOption(int option) {
        if(option >= values().length || option < 0)
            throw new NoSuchElementException();
        return values()[option];
    }

    Options(String desriptions, int digitOptions) {
        this.desriptions = desriptions;
        this.digitOptions = digitOptions;
    }
}
