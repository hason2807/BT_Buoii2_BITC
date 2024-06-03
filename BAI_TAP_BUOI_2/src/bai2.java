class Circle {
    double banKinh;

    public double Area() {
        return Math.PI * banKinh * banKinh;
    }

    public double Perimeter() {
        return 2 * Math.PI * banKinh;
    }
}
public class bai2 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.banKinh = 4;
        double dienTich = circle.Area();
        double chuVi = circle.Perimeter();
        System.out.println("Dien tich hinh tron la : " + dienTich);
        // Output: Dien tich hinh tron la : 50.24000
        System.out.println("Chu vi hinh tron la : " + chuVi);
        // Output: Chu vi hinh tron la : 25.12000
    }
}
