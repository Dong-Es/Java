import java.util.Scanner;

public class fortest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<=10; i++){
            System.out.println("n을 1~10까지 제곱한 값"+n*(i*i));
        }
    }
}
