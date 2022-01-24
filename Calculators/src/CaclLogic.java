public class CaclLogic {
    int calculator(String operationSymbol, int firstNumber, int secoundNumber) throws UnknownOperatorException {
        int wynik = 0;
        switch (operationSymbol) {
            case ("+"): {
                wynik = firstNumber + secoundNumber;
                return wynik;
            }
            case ("-"): {
                wynik = firstNumber - secoundNumber;
                return wynik;

            }
            case ("*"): {
                wynik = firstNumber * secoundNumber;
                return wynik;

            }
            case ("/"): {
                wynik = firstNumber / secoundNumber;
                return wynik;


            }


        }
        throw new UnknownOperatorException("Podałeś nieprawidłowy symbol");

    }
}
