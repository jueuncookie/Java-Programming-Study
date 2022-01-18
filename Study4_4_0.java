public class Study4_4_0 {
    public static void main(String[] args) {
        if (false) {
            System.out.println(1);
        } else if (true) {  //파이썬의 elif와 같은듯. 결과는 2만 출력.
            System.out.println(2);
        } else if (true) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }


        if (false) {
            System.out.println(1);
        } else if (false) {
            System.out.println(2);
        } else if (true) {
            System.out.println(3);
        } else {
            System.out.println(4); //3출력력
        }
        if (false) {
            System.out.println(1);
        } else if (false) {
            System.out.println(2);
        } else if (false) {
            System.out.println(3);
        } else {
            System.out.println(4);
        } //4출력
    }
}
