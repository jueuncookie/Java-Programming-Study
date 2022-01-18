public class Study6_2 {
    public static void main(String[] args) {
        //반복문
        for (
                int i = 0;
                i < 10; i++) {
            System.out.println("Coding Everybody " + i);
        }

        //  while (true) {System.out.println("Coding Everybody"); //false면 안됨

        // 배열part - 배열 생성
        String[] classGroup = {"최진혁", "최유빈", "한이람", "이고잉"};

        String[] classGroup2 = new String[4];
        classGroup[0] = "최진혁";
        System.out.println(classGroup.length);
        classGroup[1] = "최유빈";
        System.out.println(classGroup.length);
        classGroup[2] = "한이람";
        System.out.println(classGroup.length);
        classGroup[3] = "이고잉";
        System.out.println(classGroup.length);

        String[] members = {"최진혁", "최유빈", "한이람"};
        for (
                int i = 0;
                i < members.length; i++) {
            String member = members[i];
            System.out.println(member + "이 상담을 받았습니다");

        }
    }

}


