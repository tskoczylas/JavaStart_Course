public class Car {
    int fuelLevel;
    private   boolean engineIsFuncional;
    private boolean fuelFlapIsOpen;
    private boolean trunkIsOpen;
    private boolean engineIsRunning;

    final static int CarRUNNING = 100;
    final static int EngineFAILURE = 200;
    final static int FuelFAILURE = 300;
    final static int CarRUNNINGfuelFLAPopen = 400;
    final static int CarRUNNINGopenTRUNK=500;
    int startResult=0;

   public int   start()
    {
        if (fuelLevel>2&&!fuelFlapIsOpen && !trunkIsOpen && engineIsFuncional && engineIsRunning)
        {startResult= CarRUNNING;}
        else if(fuelLevel>2&&!fuelFlapIsOpen && !trunkIsOpen && !engineIsFuncional && engineIsRunning)
        {startResult= EngineFAILURE;}
        else if (fuelLevel<2&&!fuelFlapIsOpen && !trunkIsOpen && engineIsFuncional && engineIsRunning)
        { startResult= FuelFAILURE;}
        else if(fuelLevel>2&&fuelFlapIsOpen && !trunkIsOpen && engineIsFuncional && engineIsRunning)
        { startResult=CarRUNNINGfuelFLAPopen;}
        else if(fuelLevel>2&&!fuelFlapIsOpen && trunkIsOpen && engineIsFuncional && engineIsRunning)
        {startResult= CarRUNNINGopenTRUNK;}

    return startResult;
    }
    public void  status()
    {
        if(fuelLevel>2&&!fuelFlapIsOpen && !trunkIsOpen && engineIsFuncional && engineIsRunning)
            System.out.println("Samochód jest sprawny");
        else if (fuelLevel>2&&fuelFlapIsOpen && !trunkIsOpen && engineIsFuncional && engineIsRunning)
            System.out.println("Jest otwarta klapa wlewu paliwa");
        else if ()
    }




    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public boolean isEngineIsFuncional() {
        return engineIsFuncional;
    }

    public void setEngineIsFuncional(boolean engineIsFuncional) {
        this.engineIsFuncional = engineIsFuncional;
    }

    public boolean isFuelFlapIsOpen() {
        return fuelFlapIsOpen;
    }

    public void setFuelFlapIsOpen(boolean fuelFlapIsOpen) {
        this.fuelFlapIsOpen = fuelFlapIsOpen;
    }

    public boolean isTrunkIsOpen() {
        return trunkIsOpen;
    }

    public void setTrunkIsOpen(boolean trunkIsOpen) {
        this.trunkIsOpen = trunkIsOpen;
    }

    public boolean isEngineIsRunning() {
        return engineIsRunning;
    }

    public void setEngineIsRunning(boolean engineIsRunning) {
        this.engineIsRunning = engineIsRunning;
    }

    public Car(int fuelLevel, boolean engineIsFuncional, boolean fuelFlapIsOpen, boolean trunkIsOpen, boolean engineIsRunning) {
        this.fuelLevel = fuelLevel;
        this.engineIsFuncional = engineIsFuncional;
        this.fuelFlapIsOpen = fuelFlapIsOpen;
        this.trunkIsOpen = trunkIsOpen;
        this.engineIsRunning = engineIsRunning;
    }
}