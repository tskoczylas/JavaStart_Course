class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private Employment employment;

    public Employee(String firstName, String lastName, double salary, Employment employment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.employment = employment;
    }
    
    public Employee(Employment employment){
        this.employment=employment;
    }

    public Employee(Employee employee) {
    }

    public String getFirstName() {
        return firstName;
    }
    String getfullName(){
       return firstName + " " + lastName;
    }
    boolean compareEmploymert(Employment employment){
        return this.employment.equals(employment);
    }

    void bonussallary(){
         setSalary(getSalary()*1.1);
    }

    boolean fulltimeEmlploee(){
       return employment.equals(Employment.FULL_TIME);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employment getEmployment() {
        return employment;
    }

    public void setEmployment(Employment employment) {
        this.employment = employment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", employment=" + employment +
                '}';
    }
}