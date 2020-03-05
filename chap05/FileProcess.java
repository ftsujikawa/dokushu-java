package chap05;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileProcess {
    public static void main(String... args) throws IOException {
        var fs = FileSystems.getDefault();
        var path1 = fs.getPath("/home/tsu/jtest/dokushu-java/chap05/data.log");

        System.out.println(Files.exists(path1));
        System.out.println(Files.isReadable(path1));
        System.out.println(Files.isWritable(path1));
        System.out.println(Files.isExecutable(path1));

        System.out.println(Files.size(path1));
        var path2 = Files.copy(path1, fs.getPath("/home/tsu/jtest/dokushu-java/chap05/copy.log"),
            StandardCopyOption.REPLACE_EXISTING);
        Files.move(path2, fs.getPath("/home/tsu/jtest/dokushu-java/chap05/sub/copy.log"),
            StandardCopyOption.REPLACE_EXISTING);
        var path3 = Files.move(path1, fs.getPath("/home/tsu/jtest/dokushu-java/chap05/sub/rename.log"),
            StandardCopyOption.REPLACE_EXISTING);
        Files.delete(path3);
        Files.deleteIfExists(path3);
    }
}
