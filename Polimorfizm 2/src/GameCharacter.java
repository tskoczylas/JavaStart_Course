public class GameCharacter
{
    private String characterName;
    private int attackPower;
    private int defensePower;
    private int lifeEnergy;


    public GameCharacter(String characterName, int attackPower, int defensePower, int lifeEnergy) {
        this.characterName = characterName;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.lifeEnergy = lifeEnergy;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefensePower() {
        return defensePower;
    }

    public void setDefensePower(int defensePower) {
        this.defensePower = defensePower;
    }

    public int getLifeEnergy() {
        return lifeEnergy;
    }

    public void setLifeEnergy(int lifeEnergy) {
        this.lifeEnergy = lifeEnergy;
    }




}
