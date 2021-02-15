import java.util.Scanner;

public class IFtest1 {
    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하시오 : ");
        number = sc.nextInt();
        if(number % 2 == 0)         /*=이란 부호를 사용하기 위해서는 =을 두번 사용해줘야합니다.*/
            System.out.println( number + "는 짝수입니다.");
        if (number > 0)
            System.out.println( number + "은 양수입니다.");
    /*10을 입력하면 두개의 문장이 출력이 되고 9를 입력하면 2번째 문장만 출력하게 됩니다. 그리고 -1이라는 값을 넣으면 아무것도 출력이 되지 않습니다.*/
        /*만약 조건에 ;(세미콜론)을 붙히게 되면 값이 어떠든 간에 문장은 전부 출력이 됩니다.*/
    }
}
