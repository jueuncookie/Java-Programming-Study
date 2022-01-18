package scope;

class ScopeDemo6_0 {
    static int i = 5;

    static void a() {
        int i = 10;
        b();
    }

    static void b() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        a();
    }

} // 결과는 5다. 위의 예제는 메소드 a가 메소드 b를 호출하고 있는데 메소드 b에는 변수 i의 값이 존재하지 않는다
