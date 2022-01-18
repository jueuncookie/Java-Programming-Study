package scanners;

import java.util.Scanner;

class Scanner2Dem {
    //sc.hasNextInt()는 입력값이 생기기 전까지 실행을 유보시키는 역할을 한다. 만약 입력한 값이 int 형이 아닐 경우는 false를 리턴하고, int로 표현할 수 있는 형식의 숫자형인 경우는 true를 리턴한다.
// 따라서 위의 코드는 사용자가 입력을 할 때가지 실행을 기다렸다가 입력이 일어나면 반복문이 동작하면서 입력값의 1000배를 곱한 수가 출력된다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            System.out.println(sc.nextInt() * 1000);
        }
        sc.close();
    }

}
