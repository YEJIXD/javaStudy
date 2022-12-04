package study.inherit.sample;

/*
  '동물'은 객체로 만들 필요가 없기 때문에 추상 클래스로 구현한 후 고양이와 강아지 클래스에 상속 시킨 코드이다.
  공통된 속성들(이름, 나이)와 공통된 기능(울부짖기) 를 상위클래스에 정의함으로서 하위 클래스인 강아지와 고양이 클래스에 중복코드를 간소화 시킬 수 있다.

* */
abstract class Animal {
    String name;
    int age;

    // 울음 소리는 하위 클래스에서 정의!
    String howling;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    void howl(){
        System.out.println(this.howling + " 내 이름은 " + this.name + ", " + age + "살 이다!");
    }

    // 추상 메소드! 상속받는 클래스는 무조건 오버라이딩 해야 함! -> 강제성 부여
    abstract void charming();
}

class CatAbstract extends Animal{
    CatAbstract(String name, int age){
        super(name, age);
        this.howling = "야옹!";
    }

    // 메소드 오버라이딩
    void charming(){
        System.out.println("부비부비!");
    }
}

class DogAbstract extends Animal{
    DogAbstract(String name, int age){
        super(name, age);
        this.howling = "멍멍!";
    }

    void charming(){
        System.out.println("배 까고 드러눕기!");
    }
}

public class Test2{
    public static void main(String[] args){
        CatAbstract a = new CatAbstract("나비", 5);
        DogAbstract b = new DogAbstract("귀리", 3);

        a.howl();
        b.howl();

        a.charming();
        b.charming();
    }
}
