package Patterens;

public class number {
    public static void main(String[] args) {
        int n=5,num=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(num+j+" ");
            }
            num+=i;
            System.out.println();
        }
        num=1;
        for (int i = 1; i <= n; i++) {
            for (int j = i-1; j >=0; j--) {
                System.out.print(num+j+" ");
            }
            num+=i;
            System.out.println();
        }
    }
}
