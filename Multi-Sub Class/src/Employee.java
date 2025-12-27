public class Employee extends Person{
    protected int salary;
    protected String position;

    public Employee(){
        super();
        salary = 0;
        position = "";
    }

    public Employee(String firstname, String lastname,int salary , String position){
        super(firstname,lastname);
        this.salary = salary;
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public int calculatePay(){
        return getSalary();
    }

    public String toString(){
        return "Employee : " + getFirstname() + " " + getLastname() + " " + getPosition() + " " + calculatePay();
    }

    public void upSalary(int percent){
        salary += (getSalary() * percent)/100;
    }
}
