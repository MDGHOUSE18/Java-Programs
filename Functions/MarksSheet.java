package Functions;

import java.util.Scanner;

public class MarksSheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr his/her marks (out of 100) : ");
        int marks=sc.nextInt();
        System.out.println("Grade : "+ Grade(marks));
        sc.close();
    }
    public static String Grade(int marks){
        if(91<=marks && marks<=100){
            return "AA";
        }else if(81<=marks && marks<=90){
            return "AB";
        }else if(71<=marks && marks<=80){
            return "BB";
        }else if(61<=marks && marks<=70){
            return "BC";
        }else if(51<=marks && marks<=60){
            return "CD";
        }else if(41<=marks && marks<=50){
            return "DD";
        }
        return "Fail";
    }
}
