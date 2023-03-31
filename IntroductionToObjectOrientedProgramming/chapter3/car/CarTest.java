package IntroductionToObjectOrientedProgramming.chapter3.car;

public class CarTest {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.make = "Audi";
        car1.model = "Q8";
        car1.year = "2023";
        car1.distance = 0;
        car1.speed = 250;
        System.out.println(car1.getInfo());


        car1.accelerate(280);

        Car car2 = new Car();
        car2.make = "Ferrari";
        car2.model = "F1";
        car2.year = "2022";
        car2.distance = 0;
        car2.speed = 400;
        System.out.println(car2.getInfo());

        car2.accelerate(450);

        int calculateTimeForCar1 = 1000 / car1.speed;
        int calculateTimeForCar2 = 1000 / car2.speed;

        String info = "1000 Km to Time for Car1 " + calculateTimeForCar1 + " Hour \n1000 Km to Time for Car2 "+ calculateTimeForCar2+" Hour";

        System.out.println(info);
    }
}
