//메소드part
public class Study7_0 {
    public static void numbering() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        numbering();
    }

    //매개변수와 인자 (뽁수인자도 가능. 밑처럼)
    public static String numbering(int init, int limit) {
        int i = init;
        // 만들어지는 숫자들을 output이라는 변수에 담기 위해서 변수에 빈 값을 주었다.
        String output = "";
        while (i < limit) {
            // 숫자를 화면에 출력하는 대신 변수 output에 담았다.
            output += i;
            i++;
        }
        // 중요!!! output에 담겨 있는 문자열을 메소드 외부로 반환하려면 아래와 같이 return 키워드 뒤에 반환하려는 값을
        // 배치하면 된다.
        return output;

    }

    // 메소드 numbering이 리턴한 값이 변수 result에 담긴다 String result = numbering(1, 5);
    // 변수 result의 값을 화면에 출력한다. System.out.println(result);


    //복수의 리턴턴  여러 개의 값을 출력하고 싶다면 하나의 변수에 여러개의 값을 담아서 출력하면 된다
    public static String[] getMembers() {
        String[] members = {"최진혁", "최유빈", "한이람"};
        return members;
    }

    {
        String[] members = getMembers();
    }

}




