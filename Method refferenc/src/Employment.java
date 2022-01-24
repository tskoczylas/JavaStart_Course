enum Employment {
    FULL_TIME, PART_TIME, CONTRACT;



     boolean cheakEmloyment(Employee employee){
        return this.equals(employee.getEmployment());
    }
}