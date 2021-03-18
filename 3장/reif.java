import java.util.Scanner;

public class reif {
    public static void main(String[] args) {
        /*정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 판단해보자*/
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오 : ");
        int x = sc.nextInt();
        if (x>=50){
            System.out.println("x는 50 이상의 수입니다.");
        }
        else if (x<50) {
            System.out.println("x는 50미만입니다.");
        }
    }
}

