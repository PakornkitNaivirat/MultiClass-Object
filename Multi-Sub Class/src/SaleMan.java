public class SaleMan extends Employee{
    protected int saleAmount;

    public SaleMan(){
        super();
        saleAmount = 0;
    }

    public SaleMan(String firstname,String lastname,int salary,String position,int amount){
        super(firstname,lastname,salary,position);
        saleAmount = amount;
    }

    public int calculatePay(){
        return getSalary() + ((saleAmount * 5) / 100);
    }
}
