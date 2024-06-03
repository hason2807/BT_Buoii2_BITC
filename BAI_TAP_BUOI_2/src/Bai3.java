class Car {
    double speed;

    public int upTo200() {
        speed = 200;
        return 200;
    }

    public int upTo400() {
        speed = 400;
        return 400;
    }

    public int upTo600() {
        speed = 600;
        return 600;
    }
}
public class Bai3 {
    public static void main(String[] args) {
        Car car1 = new Car();

        int tolanThu1 = car1.upTo200();
        System.out.println("Toc do xe trong lan tang thu nhat : " + tolanThu1 + " km/h");

        int tolanThu2 = car1.upTo400();
        System.out.println("Toc do xe trong lan tang thu hai : " + tolanThu2 + " km/h");

        int tolanThu3 = car1.upTo600();
        System.out.println("Toc do xe trong lan tang thu ba : " + tolanThu3 + " km/h");

        int tolanThu4 = car1.upTo200();
        System.out.println("Toc do xe trong lan tang thu tu : " + tolanThu4 + " km/h");
    } 
}
