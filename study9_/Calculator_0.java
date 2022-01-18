package study9_;

//상속 part
//1. 부모 클래스와 자식 클래스의 관계를 상위(super) 클래스와 하위(sub) 클래스라고 표현하기도 한다. 또한 기초 클래스(base class), 유도 클래스(derived class)라고도 부른다.
//2. Class SubtractionableCalculator(상속) extends Calculator(피상속)

//초기화= 생성자 파트
// 생성자 : 생성자 덕분에 Calculator 객체를 사용하기 위해서 사실상 반드시 필요한 작업이라고 할 수 있는 좌항(left)과 우항(right)의 값을 설정하는 과정을 객체 생성 과정에서 강제할 수 있게 되었다.
// 특징:값을 반환하지 않는다.
//생성자의 이름은 클래스의 이름과 동일하다.

class Calculator_0 {

    int left, right;

    public Calculator(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
