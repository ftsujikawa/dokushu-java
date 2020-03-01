package chap05;

public class Ch05Ren522 {
    public static void main(String... args) {
        var str = "お問合わせはsupport@example.comまで";
        var rep = "[a-z_0-9]+([-+.][a-z_0-9]+)*@[a-z_0-9]+([-.][a-z_0-9]+)*\\.[a-z_0-9]+([-.][a-z_0-9]+)*";
        System.out.println(str.replaceAll(rep, "<a href=\"mailto:$0\">$0</a>"));
    }
}
