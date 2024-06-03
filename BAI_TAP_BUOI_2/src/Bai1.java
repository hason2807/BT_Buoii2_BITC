class Person {
    int namSinh;

    public int PredictAge() {
        return 2024 - namSinh;
    }
}

public class Bai1 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.namSinh = 2004;
        int tuoi = person1.PredictAge();
        System.out.println("So tuoi la: " + tuoi); // Output: So tuoi la: 20
    }
}
