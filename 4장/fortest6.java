import java.util.Scanner;

/*for문을 이용해서 1부터 10까지의 정수 중에서 N의 배수의 총합을 구하는 코드를 작성하시오*/
public class fortest6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for (int i=1; i<=10; i++){
            if (i%N==0){
                sum = i +sum;
            }
        }
        System.out.println(sum);
    }
}
