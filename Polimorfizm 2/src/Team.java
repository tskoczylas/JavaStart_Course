import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;

public class Team {


    String name;
    GameCharacter[] gameCharacters = new GameCharacter[3];

    public Team(GameCharacter characters1, GameCharacter character2, GameCharacter character3, String name) {
        this.gameCharacters[0] = characters1;
        this.gameCharacters[1] = character2;
        this.gameCharacters[2] = character3;
        this.name = name;
    }
};
