package Control_Statements.Intermediate;

import java.util.Scanner;
public class CalculateElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units : ");
        int units=sc.nextInt();
        System.out.println("The electricity bill for "+units+" is:" + calculateElectricityBillAmount(units));   

        sc.close();
    }
    public static double calculateElectricityBillAmount(int units) {
        if (units<=30) {
            return units*1.90;
        }else if (units<=75) {
            return units*3.00;
        }else if (units<=125) {
            return units*4.50;
        }else if (units<=225) {
            return units*6.00;
        }else if (units<=400) {
            return units*8.75;
        }
        return units*9.75;
    }
}
