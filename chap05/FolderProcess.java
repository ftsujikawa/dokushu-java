package chap05;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FolderProcess {
    public static void main(String...strings) throws IOException {
        var fs = FileSystems.getDefault();
        var dir1 = fs.getPath("/home/tsu/jtest/dokushu-java/chap05/selflearn");
        var dir2 = fs.getPath("/var");
        Files.createDirectories(dir1);
        System.out.println(Files.exists(dir1));
        System.out.println(Files.isDirectory(dir1));

        var s = Files.list(dir2);
        s.filter(v -> v.getFileName().toString().endsWith(".log")).forEach(System.out::println);

        var dir3 = Files.copy(dir1, fs.getPath("/home/tsu/jtest/dokushu-java/chap05/selflearn/test"),
            StandardCopyOption.REPLACE_EXISTING);
        Files.move(dir3, fs.getPath("/home/tsu/jtest/dokushu-java/chap05/sub"),
            StandardCopyOption.REPLACE_EXISTING);
        Files.delete(fs.getPath("/home/tsu/jtest/dokushu-java/chap05/sub"));
        Files.deleteIfExists(fs.getPath("/home/tsu/jtest/dokushu-java/chap05/sub"));
    }
}
