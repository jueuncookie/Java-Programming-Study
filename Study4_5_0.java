public class Study4_5_0 {
    // 조건문 중첩 사용가능
    // 스위치 문 part 사용빈도는 적지만 조건이 많다면 switch문이 로직을 보다 명료하게 보여줄 수 있다.
    class SwitchDemo {

        public static void main(String[] args) {

            System.out.println("switch(1)");
            switch (1) {
                case 1:
                    System.out.println("one");
                case 2:
                    System.out.println("two");
                case 3:
                    System.out.println("three");
            }

            System.out.println("switch(2)");
            switch (2) {
                case 1:
                    System.out.println("one");
                case 2:
                    System.out.println("two");
                case 3:
                    System.out.println("three");
            }

            System.out.println("switch(3)");
            switch (3) {
                case 1:
                    System.out.println("one");
                case 2:
                    System.out.println("two");
                case 3:
                    System.out.println("three");
                    break;
            }
            class SwitchDemo2 { //위에 스위치문을 이프문으로. 둘은 대체 가능 서로.
                // default문 사용하면 맨 마지막이 default로 끝난다. 즉 주어진 케이스가 없는 경우 default 문이 실행된다
            }
        }
    }
}