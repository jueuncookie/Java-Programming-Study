package scope;

//유효범위 part
class ScopeDemo3 {
    static int i;

    static void a() {
        int i = 0;
    }

    public static void main(String[] args) {
        for (i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }
    }

    // 정적 스코프(static scope) 혹은 렉시컬 스코프(lexical scope)
    //즉 사용되는 시점에서의 유효범위(메소드 a의 i)를 사용하는 것이 아니라 정의된 시점에서의 유효범위(i = 5)를 사용하는 것


    // 초기화 part
}
