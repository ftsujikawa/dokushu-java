package chap05;

import java.util.regex.Pattern;

public class Ch05Ren521 {
    public static void main(String... args) {
        var str = "住所は〒160-0000 新宿南町0-0-0です。\nあなたの住所は〒210-9999 川崎市北町1-1-1ですね";
//        var ptn = Pattern.compile("[0-9]{3}-[0-9]{4}");//間違い
        var ptn = Pattern.compile("\\d{3}-\\d{4}");
        var match = ptn.matcher(str);
        while (match.find()) {
            System.out.println(match.group());
        }
    }
}
