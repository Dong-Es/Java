public class StringTest {
    public static void main(String[] args) {
        String a = "현재 다리의 길이는 ";
        char b= 'M';
        int bridge = 2000;
        String c ="입니다.";
        String d ="만약 여기서 ";
        String e ="를 추가 건설을 할 경우에는";
        int plus=1000;
        String f ="기준치보다 초과 되어 지을수 없습니다.";
        String x="연결하면";

        System.out.println(a+bridge+b+c+d+plus+b+e+(bridge+plus)+b+f);
        System.out.println(a+bridge+b+c+d+plus+b+e+bridge+plus+b+f);
        /*서로 다르게 출력이 됩니다. 왜냐하면 정수형을 연결하여 출력되었기 때문입니다.*/
        System.out.println(bridge+plus+"입니다.");
        /*정수형이 먼저 덧셈이 되어 출력이 됩니다.*/
    }
}
