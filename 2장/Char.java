public class Char {
    public static void main(String[] args) {
        char a='임';
        char b='동';
        char c='균';

        System.out.println("출력결과 : "+ a+b+c);
        System.out.println(a+b+c);
        /*2번째 문장처럼 출력이 되는 이유는 a+b+c의 식별자안에 있는 변수가 아스키코드로 변환되어 합이되었기 때문입니다.*/
    }
}
