class TimeConversionAPP {
    public int covertHoursToMinutes(int hours) {
        return hours * 60;
    }

    public int covertDaysToMinutes(int days) {
        return days * 24 * 60;
    }
}
public class Bai4 {
    public static void main(String[] args) {
        TimeConversionAPP timeConversionAPP = new TimeConversionAPP();
        int covertHoursToMinute = timeConversionAPP.covertHoursToMinutes(2);
        System.out.println(covertHoursToMinute); // Output: 120
        int covertDaysToMinute = timeConversionAPP.covertDaysToMinutes(3);
        System.out.println(covertDaysToMinute); // Output: 4320
    }
}
