public class Study6_1 {
 // id 값으로 egoing, k8805, sorialgi 중의 하나를 사용하고 비밀번호는 111111을 입력하면 right 외의 경우에는 wrong를 출력하는 예다.
        public static void main(String[] args) {
            String id = args[0];
            String password = args[1];
            if (id.equals("egoing") && password.equals("111111")) {
                System.out.println("right");
            } else {
                System.out.println("wrong");//or와 and를 혼합해서 사용하는 방법을 보여준다. id 값을 테스트하는 구간을 괄호()로 묶었다.
            }
        }
    }

