import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        Employee[] people = new Employee[n];

        for(int i = 0; i < n; i++) {

            String FN = input.next();
            String LN = input.next();
            int SL = input.nextInt();
            String P = input.next();

            people[i] = new Employee(FN,LN,SL,P);
        }

        int up = input.nextInt();

        for(int i = 0 ; i < n ;i++){
            System.out.println(people[i].toString());
        }
        System.out.println("After update salary");
        for(int i = 0 ; i < n ;i++){
            people[i].upSalary(up);
            System.out.println(people[i].toString());
        }
    }
}
