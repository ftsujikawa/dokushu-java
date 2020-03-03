package chap05;

import java.time.LocalDateTime;

public class Ch05Ren531 {
    public static void main(String... args) {
        var dt = LocalDateTime.now();
        System.out.println(dt.getMonthValue() + "月 " + dt.getMinute() + "分");
    }
}
