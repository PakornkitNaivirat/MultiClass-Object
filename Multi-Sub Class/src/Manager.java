public class Manager extends Employee{
    protected int cashPosition;

    public Manager(){
        super();
        cashPosition = 0;
    }

    public Manager(String firstname,String lastname,int salary,String position,int cash){
        super(firstname,lastname,salary,position);
        cashPosition = cash;
    }

    public int calculatePay(){
        return getSalary() + cashPosition;
    }
}
