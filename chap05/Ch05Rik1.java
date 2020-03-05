package chap05;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Ch05Rik1 {
    public static void main(String... args) {
        var str = "となりのきゃくはよくきゃくくきゃくだ";
        var n = str.lastIndexOf("きゃく");
        System.out.println(n);

        System.out.printf("%sの気温は%.2f℃です。\n", "千葉", 17.256);

        var str2 = "彼女の名前は花子です。";
        System.out.println(str2.replace("彼女", "妻"));

        var dt = LocalDateTime.now();
        System.out.println(dt.plusDays(5).plusHours(6));
        System.out.println(dt.plus(Duration.parse("P5DT6H")));

        /*
         * 間違い var dt1 = LocalDate.of(2020, 3, 12).getDayOfYear(); var dt2 =
         * LocalDate.of(2020, 11, 5).getDayOfYear(); System.out.printf("%dヵ月%d日間\n",
         * (dt2 - dt1) / 31, (dt2 - dt1) % 31);
         */
        var dt1 = LocalDate.of(2020, 3, 12);
        var dt2 = LocalDate.of(2020, 11, 5);
        var period = Period.between(dt1, dt2);
        System.out.println(period.getMonths() + "ヵ月" + period.getDays() + "日間");
        
    }
}