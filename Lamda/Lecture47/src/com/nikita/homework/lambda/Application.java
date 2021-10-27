package com.nikita.homework.lambda;

public class Application {
    public static void main(String[] args) {

        Human tom = new Human();
//        tom.walk();
//        walker(tom);

        Robot wale = new Robot();
//        wale.walk();
//        walker(wale);

//        walker(new Walkable() {
//            @Override
//            public void walk() {
//                System.out.println("Custom object walking...");
//            }
//        });

//        walker(() -> {
//            System.out.println("Custom object walking...");
//            System.out.println("the object tripped...");
//        });

//        ALambdaInterface aBlockOfCode = () -> {
//            System.out.println("Custom object walking...");
//            System.out.println("the object tripped...");
//        };

        walker(() -> System.out.println("Custom object walking..."));

        Walkable aBlockOfCode = () -> {
            System.out.println("Custom object walking...");
            System.out.println("the object tripped...");
        };

        walker(aBlockOfCode);
    }

    public static void walker(Walkable walkableEntity) {
        walkableEntity.walk();
    }


}
