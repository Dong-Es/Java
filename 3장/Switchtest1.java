import java.util.Scanner;

public class Switchtest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇월인지 입력하시오 : ");
        int month = sc.nextByte();
        String season;
        switch (month)
        {
            case 12:
            case 1:
            case 2:
                season = "겨울입니다.";
                break;
            case 3:
            case 4:
            case 5:
                season = "봄입니다.";
                break;
            case 6:
                season ="여름이 시작되는 6월";
                break;
            case 7:
                season ="엄청더운 7월";
                break;
            case 8:
                season = "여름이 끝나가는 8월";
                break;
                /*이런식으로 둔다면 6~8을 입력을 한다면 case 6~8까지의 문장이 전부 출력이 됩니다.*/
            case 9:
            case 10:
            case 11:
                season = "겨울입니다.";
                break;
            default:
                season="계절을 벗어났습니다.";
                break;
        }
        System.out.println(season);
    }
}
