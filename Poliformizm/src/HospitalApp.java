public class HospitalApp
{
    public static void main(String[] args) {
        Hospital hospital= new Hospital();
        HospitalClone hospitalClone=new HospitalClone();
        hospital.addPerson(new Doctor("Anna","Kowalewsja",10,22));
        hospital.addPerson(new Nurse("Kowalewska","Jijsijis",22,22));
        hospital.addPerson(new Nurse("Kalawska","Anna",22,11));
        hospital.addPerson(new Nurse("Karolina","Anna",22,33));

        System.out.println(hospital.getInfo());

        }
    }
