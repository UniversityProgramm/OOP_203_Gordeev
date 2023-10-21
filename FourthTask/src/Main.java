import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> equations = Parser.parse();
            String content = equations[0];
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(equations);
        }
    }