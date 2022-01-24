public class Attack extends GameCharacter {
    public int getPercentageAttackPower() {
        return percentageAttackPower;
    }

    public void setPercentageAttackPower(int percentageAttackPower) {
        this.percentageAttackPower = percentageAttackPower;
    }

    private int percentageAttackPower;

    public Attack(String characterName, int attackPower, int defensePower, int lifeEnergy, int percentageAttackPower) {
        super(characterName, attackPower, defensePower, lifeEnergy);
        this.percentageAttackPower = percentageAttackPower;
    }

    int addpercentageAttackPower() {
        return (getAttackPower() * (((percentageAttackPower / 100 )*getAttackPower())+getAttackPower()));
    }

}

