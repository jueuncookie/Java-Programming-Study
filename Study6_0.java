//논리연산자 이어서!
public class Study6_0 {
    //(or)는 좌우항 중에 하나라도 true라면 전체가 true가 되는 논리 연산자다. 다음 예를 보자. 결과는 1,2,3이 출력된다. 마지막 조건문의 or는 좌항과 우항이 모두 false이기 때문에 false가 된다.
    public static void main(String[] args) {


        if (true || true) {
            System.out.println(1);
        }
        if (true || false) {
            System.out.println(2);
        }
        if (false || true) {
            System.out.println(3);
        }
        if (false || false) {
            System.out.println(4);
        }


    }

}
