import java.util.Scanner;

public class IFelsetest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하시오 :");
        int point = sc.nextInt();
        /*이런 식으로 적는다면
        * int point;
        * point = sc.nextInt(); 라고 적을 필요가 없음*/
        if (point >=90) /*90점이상*/
            System.out.println("A학점입니다.");
        else if (point >= 80)
            System.out.println("B학점입니다.");
        else if (point >= 80)
            System.out.println("C학점입니다.");
        else if (point >= 70)
            System.out.println("D학점입니다.");
        else
            System.out.println("F학점입니다.\n 학점을 취득하지 못했습니다.");
    }
}
