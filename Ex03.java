package ch01.sec02;
class Animal {
    String name;
    void eat() {
        System.out.println(name + "이/가 밥을 먹습니다.");
    }
    void sound() {
        System.out.println("동물 소리");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("멍멍");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("냐옹");
    }
}
public class Ex03 {
    public static void main(String[] args) {
        Animal[] ani = new Animal[4]; // 초기값 : null
        Animal d1 = new Dog();
        d1.name = "땡칠이";
        Animal c1 = new Cat();
        c1.name = "미미";
        Animal d2 = new Dog();
        d2.name = "덕구";
        Cat c2 = new Cat();
        c2.name = "네로";
        ani[0] = d1;
        ani[1] = c1;
        ani[2] = d2;
        ani[3] = c2;
//        for (int i=0; i < ani.length; i++) {
//            Animal a = ani[i];
//            System.out.println(a.name);
//            a.eat();
//            a.sound();
//            System.out.println("-------------");
//        }
        for (Animal a : ani) {
            System.out.println(a.name);
            a.eat();
            a.sound();
            System.out.println("-----------------------------");
        }
    }
}
