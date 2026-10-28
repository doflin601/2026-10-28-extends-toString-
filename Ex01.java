package ch01.sec00;
class Animal {
    String name = "애니멀";
    int age = 7;
    public Animal() {
        System.out.println("애니멀 생성자1");
    }
    public Animal(String name) {
        System.out.println("애니멀 생성자2 " + name);
    }
    void eat() {
        System.out.println(name+"이(가) 밥을 먹습니다.");
    }
    void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}
class Dog extends Animal {
    public Dog() {
        super(); // 상속받은 클래스라면 반드시 존재, 없어도 컴파일러가 넣어서 번역, super 위는 문장 X
                 // 또한 부모 클래스에 기본 생성자가 없을 경우 에러남
        //super("고양이") --> 변형된 부모 생성자 호출
        System.out.println("자식(dog) 생성자");
    }
}

public class Ex01 {
    public static void main(String[] args) {
        Dog d1 = new Dog(); // 상속을 받았으면 자식 생성자를 호출해도 부모 생성자도 호출
    }

}
