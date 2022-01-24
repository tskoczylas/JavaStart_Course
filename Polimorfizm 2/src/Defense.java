import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Defense extends GameCharacter {

    public Defense(String characterName, int attackPower, int defensePower, int lifeEnergy, int percentageDefensekPower) {
        super(characterName, attackPower, defensePower, lifeEnergy);
        this.percentageDefensekPower = percentageDefensekPower;
    }



    public int getPercentageDefensekPower() {
        return percentageDefensekPower;
    }

    public void setPercentageDefensekPower(int percentageDefensekPower) {
        this.percentageDefensekPower = percentageDefensekPower;
    }

    private int percentageDefensekPower;

    int addpercentageAttackPower() {
        return (getAttackPower() * (((percentageDefensekPower / 100) * getAttackPower()) + getAttackPower()));
    }

    String a = "abccba";
    String cheak;
    boolean answer;
    int i;
    boolean cheakLetters(String cheak){
        for(i=1;i<cheak.length()/2;i++) {
        if (cheak.charAt(i)!=cheak.charAt (cheak.length()-i-1) );
          answer = false;      }
        return answer;
        }

}

