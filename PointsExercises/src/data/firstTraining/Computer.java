package data.firstTraining;

public class Computer
{
    public static void main(String[] args)
    {
        ComputerUpgrade computerUpgrade = new ComputerUpgrade();

        ComputerStore comp1 = new ComputerStore();
        ComputerStore comp2 = new ComputerStore();

        comp1.memory=16;
        comp1.processor = "Intel i5";

        comp2.memory=12;
        comp2.processor = "Intel i7";


        computerUpgrade.addMemory(comp1,888);
        comp1.pirintIt();
        comp2.pirintIt();



    }

}
