import java.util.Scanner;

/*하루 일당, 일주일 급여, 한달 월급 월급을 구하는 식으로 문제를 만들어보았습니다.*/
public class problem1 {
    public static void main(String[] args) {
       int wage;
       int day;
       int week;
       int month;
       int salary;

       Scanner sc = new Scanner(System.in);

       System.out.println("이름을 입력 :");
       String name= sc.next().toString();

       System.out.println("회사의 시급을 입력하시오 :");
       wage = sc.nextInt();

       System.out.println("일주일에 몇일을 일하는지 입력하시오 :");
       day = sc.nextInt();

       System.out.println("한달에 몇주 일하시는지 입력하시오 :");
       week = sc.nextInt();

       System.out.println("몇개월을 일하였는지 입력하시오 :");
       month = sc.nextInt();

       System.out.println("이 회사에서 "+name+"님이 일하여 벌수있는 돈은");
       System.out.println("하루에 "+wage+"원 입니다.");
       System.out.println("일주일에 "+ wage*day + "원 입니다.");
       System.out.println("한달 월급은"+wage*day*week+"원 입니다.");
       System.out.println("연봉은"+wage*day*week*12+"원 입니다.");
       System.out.println("현재까지 "+ name +"님이 회사에 일하셔서 받으신 금액은"+wage*day*month+"원 입니다.");
    }
}
