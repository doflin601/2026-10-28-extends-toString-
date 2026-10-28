package ch01.sec03;
class Animal {
    public String name;
    public int age;
    public String jong;

    public Animal(String name, int age, String jong) {
        this.name = name;
        this.age = age;
        this.jong = jong;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJong() {
        return jong;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", jong='" + jong + '\'' +
                '}';
    }
}
class Cat extends Animal {
    public Cat(String name, int age, String jong) {
        super(name, age, jong);
    }
}
class Dog extends Animal {
    public Dog(String name, int age, String jong) {
        super(name, age, jong);
    }
}

public class Ex04 {
    public static void main(String[] args) {
        Animal[] ani = new Animal[4];
        ani[0] = new Dog("땡칠이", 7, "개");
        ani[1] = new Cat("미미", 5, "고양이");
        ani[2] = new Cat("네로", 4, "고양이");
        ani[3] = new Dog("덕구", 10, "개");
        for (int i = 0; i < ani.length; i++) {
            System.out.println(ani[i]);
    // --> toString을 안 써도 컴파일러가 toString을 자동으로 추가해서 번역하기 때문에 매소드가 실행됨
        }
    }
}
