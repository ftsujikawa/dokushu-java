package chap05;

import java.time.LocalDate;
import java.time.Period;

public class Ch05Ren532 {
    public static void main(String... args) {
        var d = LocalDate.now();
        var period = Period.ofDays(20);
        System.out.println("20日後は、" + d.plus(period));
        System.out.println(d.plusDays(20));
    }
}