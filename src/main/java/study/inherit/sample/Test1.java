package study.inherit.sample;

/*
강아지와 고양이의 클래스를 만든 간단한 예제이다. 강아지와 고양이 클래스를 보면 중복된 코드가 많은 것을 볼 수 있다.
이것을 추상화 해서 좀 더 상위 개념인 '동물' 클래스를 만들어서 상속해서 사용한다면 좀 더 코드가 간결해지지 않을까?
* */
class Cat {
    String name;
    int age;

    Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    void howl(){
        System.out.println("야옹 ! 내 이름은 " + this.name + ", " + age + "살 이다옹!");
    }
}

class Dog{
    String name;
    int age;

    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    void howl(){
        System.out.println("멍멍! 내 이름은 " + this.name + ", " + age + "살이다멍!");
    }
}

public class Test1{
    public static void main(String[] args){
        Cat a = new Cat("나비", 5);
        Dog b = new Dog("귀리", 3);

        a.howl();
        b.howl();
    }
}

