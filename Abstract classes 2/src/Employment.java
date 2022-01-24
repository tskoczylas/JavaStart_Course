public class Employment {



        public Employe[] createEmployee(){

        Employe[] employes = new Employe[Employe.MAXWORKERS];
            employes[0]=new Parttime("Tomsz","Skoczulas",140,88);
            employes[1]=new Fulltime("Aleksander","Walinowski",22,8,91);
            employes[2]=new Fulltime("Kaczor","Kaczorowaty",22,8,88);
            employes[3]=new Parttime("Alek","Władysłąw",431,77);
            return employes;
    }

   public  void showEmploye(){
            if(createEmployee()!=null)
            {for (Employe employe : createEmployee())
            System.out.println(employe);}

    }




    }

