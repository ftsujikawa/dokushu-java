package chap05;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Ch05Rik3 {
    public static void main(String... args) {
        var charset = Charset.forName("Windows-31J");
        try (var writer = Files.newBufferedWriter(Paths.get("data.dat"), charset, StandardOpenOption.APPEND)) {
            writer.write(String.join(",", args));
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
