import java.util.Scanner;

public class ReQuadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x값의 정수를 입력하시오 : ");
        int x = sc.nextInt();
        System.out.print("y값의 정수를 입력하시오 : ");
        int y = sc.nextInt();
        if (x>0 && y>0){
            System.out.println("x는"+x+"이고 y는"+y+"에 속할때는");
            System.out.println("1분면");
        }
        if (x<0 && y>0){
            System.out.println("x는"+x+"이고 y는"+y+"에 속할때는");
            System.out.println("2분면");
        }
        if (x<0 && y<0){
            System.out.println("x는"+x+"이고 y는"+y+"에 속할때는");
            System.out.println("3분면");
        }
        if (x>0 && y<0){
            System.out.println("x는"+x+"이고 y는"+y+"에 속할때는");
            System.out.println("4분면");
        }
        if (x==0 && y==0){
            System.out.println("x는"+x+"이고 y는"+y+"에 속할때는");
            System.out.println("0점");
        }
    }
}
/* && 은 그리고 라는 의미가 있다 */
