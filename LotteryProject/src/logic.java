public class logic {


    void  sprawdzCzy(int x)
    { if (x<5000)
        {
            System.out.println("Mniejsza niż 5000");
        }
        else if(x==5000)
        {
            System.out.println("Równe 5000");
        }
        else if(x>5000)
        {
            System.out.println("Większa niż 5000");
        } }

    void czyParzyste(int x)
    { if (x % 2 ==0)
        {
            System.out.println("Jest parzysta");
        }
        else
        {
            System.out.println("Nie jest parzysta");
        } }
    public  void ma4Cyfry(int x)
    {
        if(x/1000!=0)
            System.out.println("Ma co najmniej 4 cyfry");
    }
}
