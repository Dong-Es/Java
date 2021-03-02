import java.util.Scanner;

public class fortest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i;
        for (i= 0; i<=10; i++){
            n = n+i;
            System.out.println("n을 1부터 10까지 더한수는 "+n);
        }
    }
}
