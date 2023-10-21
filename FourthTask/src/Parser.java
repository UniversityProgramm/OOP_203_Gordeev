import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
public class Parser {
    public static List<String> parse() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("D:\\OOP\\OOP_203_Gordeev\\FourthTask\\src\\resource\\tasks.txt"), StandardCharsets.UTF_8);
        return lines;
    }
}
