import java.util.Scanner;
/*학교에서 학점을 줄때 쓰는 프로그램을 생각하면서 만들어보았습니다.*/
public class ifiniftest1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("점수를 입력하시오 : ");
        int score = sc.nextInt();
        sc.close();

        if (90 <= score)
        /*A대 학점은 90점이상부터 받을 수 있도록 하였습니다.*/{
            System.out.println("축하드립니다! A학점입니다.");
            if (score >= 96)
                System.out.println("A+");
            else if (score >= 94)
                System.out.println("A0");
            else
                System.out.println("A-");
        }
        else if (80 <= score)
        /*B대 학점은 80점이상부터 받을 수 있도록 하였습니다.*/{
            System.out.println("고생하셨습니다. B학점입니다.");
            if (score >= 86)
                System.out.println("B+");
            else if (score >= 84)
                System.out.println("B0");
            else
                System.out.println("B-");
        }
        else if (70 <= score)
        /*C대 학점은 70점이상부터 받을 수 있도록 하였습니다.*/{
            System.out.println("고생하셨습니다. C학점입니다.");
            if (score >= 76)
                System.out.println("C+");
            else if (score >= 74)
                System.out.println("C0");
            else
                System.out.println("C-");
        }
        else if (60 <=score)
        /*D대 학점은 60점이상부터 받을 수 있도록 하였습니다.*/{
            System.out.println("고생하셨습니다. D학점입니다.");
            if (score >= 66)
                System.out.println("D+");
            else if (score >= 64)
                System.out.println("D0");
            else
                System.out.println("D-");
        }
        else
            /*60점 미만의 점수를 얻은 사람들은 F학점을 받게 되도록하였습니다.*/
            System.out.println("F학점입니다.");

    }
}
