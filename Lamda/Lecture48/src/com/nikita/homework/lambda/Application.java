package com.nikita.homework.lambda;

public class Application {
    public static void main(String[] args) {
        Human tom = new Human();
        Robot wale = new Robot();

        walker(() -> System.out.println("Custom object walking..."));

        Walkable aBlockOfCode = () -> {
            System.out.println("Custom object walking...");
            System.out.println("the object tripped...");
        };

        walker(aBlockOfCode);

        //1
        ALambdaInterface helloVar = () -> System.out.println("Hello there");

       //2
        Calculate someVar = (a, b) -> a+b;
        helloVar.someMethod();
        System.out.println(someVar.compute(4, 6));

        //3
        Calculate nonZeroDivider = (a, b) -> {
            if (a == 0) {
                return 0;
            }
            return a/b;
        };

        System.out.println(nonZeroDivider.compute(10, 5));

        //4
        MyGenericInterface<String> reverser = (s) -> {
            String result = "";
            for (int i = s.length() -1; i >= 0; i--) {
                result = result + s.charAt(i);
            }
            return result;
        };

        System.out.println(reverser.work("Vehicle"));

        //5
        MyGenericInterface<Integer> computedNumber = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i*result;
            }
            return result;
        };

        System.out.println(computedNumber.work(10));

    }

    public int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = i*result;
        }
        return result;
    }

    public String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }

    public int nonZeroDivide(int arg1, int arg2) {
        if (arg1 == 0) {
            return 0;
        }
        return arg1/arg2;
    }

    public int sum(int arg1, int arg2) {
        return arg1+arg2;
    }

    public void sayHello() {
        System.out.println("Hello there");
    }

    public static void walker(Walkable walkableEntity) {
        walkableEntity.walk();
    }
}

interface Calculate {
    public int compute(int a, int b);
}

interface MyGenericInterface<T> {
    public T work(T t);
}

interface NumberWorker {
    public int compute(int a);
}
