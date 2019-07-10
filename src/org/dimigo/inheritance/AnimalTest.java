package org.dimigo.inheritance;

public class AnimalTest {
    public static void main(String[] args) {
//        Animal a = new Animal("동물");
//        System.out.println(a);
//        a.eat();
//        a.sleep();
//        a.bark();
//
//        Animal d = new Dog("멍멍이");
//        System.out.println(d);
//        d.bark();       // Animal의 bark()
//        // d.wag();
//
//        Animal c = new Cat("냥냥이");
//        System.out.println(c);
//        c.bark();
//        // c.scratch();
//
//        Animal t = new Tiger("호돌이");
//        System.out.println(t);
//        t.bark();
//        // t.hunt(); Animal t라고 하면 Animal에는 hunt가 없어서 에러 남

        Animal[] animals = {
                new Animal("동물"),
                new Dog("멍멍이"),
                new Cat("야옹이"),
                new Tiger("호돌이")
        };

        for (Animal a : animals) {
            System.out.println(a);
            a.eat();
            a.sleep();
            a.bark();
        }

        Animal dog = new Dog("멍멍이");
        dog.eat();
        dog.sleep();
        Dog dog2 = (Dog) dog;
        dog2.wag();

        ((Dog) dog).wag();

        Animal cat = new Cat("야옹이");
        ((Cat) cat).scratch();

        System.out.println(dog instanceof Dog);
        System.out.println(cat instanceof Cat);
        System.out.println(dog instanceof Cat);
        System.out.println(cat instanceof Dog);
        System.out.println(dog instanceof Animal);
        System.out.println(cat instanceof Object);

        doAction(dog);
        doAction(cat);
    }

    private static void doAction(Animal a) {
        if(a instanceof Cat) {
            Cat c = (Cat) a;
            c.scratch();
        } else if(a instanceof Dog) {
            ((Dog) a).wag();
        }
    }
}