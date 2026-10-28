package ch01.sec01;
class Animal {
    String name = "애니멀";
    int age = 7;
    public Animal(String name) {
        this.name = name;
        System.out.println("애니멀 생성자 " + name);
    }
    void eat() {
        System.out.println(name+"이(가) 밥을 먹습니다.");
    }
    void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}
class Dog extends Animal {
    public Dog(String name) {
        super(name);
        System.out.println("dog생성자 " + name);
    }
    @Override
    void sound() {
        super.sound(); // 부모 매소드도 호출
        System.out.println("멍멍");
    } // 매소드 재정의
}
public class Ex02 {
    public static void main(String[] args) {
        Dog d1 = new Dog("땡칠이"); // 타입을 부모타입으로 바꿔도 됨
        System.out.println(d1.name + " " + d1.age);
        d1.eat();
        d1.sound();
    }
}
