// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public int addNumber(int a, int b){
        return a + b;
    }

    int result = addNumber(5, 10);



    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Sum: " + sum);

//        class Car {
//            public void honk(){
//                System.out.println("BEEPPP!!!");
//            }
//        }
//
//        Car MyCar = new Car();
//        MyCar.honk();

        class Animal {
            public void sound() {
                System.out.println("Animal make a sound!!");
            }
        }

        class Dog extends Animal {
            public void sound() {
                System.out.println("Dog barks");
            }
        }

        Animal myDog = new Dog();
        myDog.sound();


    }
}