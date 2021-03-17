import java.util.Scanner;

/*키보드로 정수 두개를 받아 작은 수 부터 큰 수까지의모든 정수의 합*/
public class iffortest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int max = 0;
        int min = 0;

        System.out.print("정수를 입력 하시오 : ");
        int a = sc.nextInt();

        System.out.print("정수를 입력 하시오 : ");
        int b = sc.nextInt();

        if (a > b) {
            max = a;
            min = b;
        } else if (a < b) {
            max = b;
            min = a;
        }
        else {
            System.out.println("숫자를 잘못 입력하였습니다");
            /*같은 수를 입력했을때 위와 같은 문구가 입력된다.*/
            return;
        }
        for (int i= min; i<=max; i++){
            sum +=i;
        }
        System.out.println("숫자 a 부터 b 까지의 합은 "+sum);
    }
}
