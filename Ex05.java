package ch01.sec04;
class A {
    public String toString() {
        return "A클래스";
    } // 원래 Object 클래스 안에 있는 toString() 매소드를 재정의 한 것
} // 어떠한 클래스든 Object 클래스를 상속받음 (extends Object를 안 해도)
class B {
    public String toString() {
        return "B클래스";
    }
}
public class Ex05 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);
        B b = new B();
        System.out.println(b);

        Object[] o = new Object[2];
        o[0] = a;
        o[1] = b;
        for (Object oo: o) {
            System.out.println(oo.toString());
        }
    }
}
