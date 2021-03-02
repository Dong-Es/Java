public class fortest1 {
    public static void main(String[] args) {
        int sum=0;
        for (int i= 0; i<=10; i++)
            /*int i;라고 위에 변수값을 먼저 지정해준다면 for문의 조건에는 int를 쓰지 않아도 됩니다.*/
            /*i<=10이라고 적어도됩니다.*/{
            sum = sum+ i;
            System.out.println("0부터 10까지 합은"+sum);
            /*for문의 조건식안에 문장의 순서를 바꿔서 한다면 다른 답이 나오기때문에 조심해야합니다.*/
        }
    }
}
