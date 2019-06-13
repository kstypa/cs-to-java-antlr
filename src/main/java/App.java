import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        if (args.length > 0) {
            String testCodeFromFile = readFromFile(args[0]);

            String[] splitName = args[0].split("[.]");
            String name = splitName[0];

            BufferedWriter bufferedWriter;
            try {
                bufferedWriter = prepareOutput(name + ".java");
            } catch (IOException ex) {
                System.out.println("Problem z plikiem wyjściowym");
                return;
            }

            /*Compiler.compileCode(testCode, bufferedWriter);*/
            Compiler.compileCode(testCodeFromFile, bufferedWriter);

            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("Brak pliku wejściowego");
        }
    }

    private static BufferedWriter prepareOutput(String path) throws IOException {
        FileWriter writer = new FileWriter(path);
        return new BufferedWriter(writer);
    }

    private static String readFromFile(String fileName) {
        final StringBuilder builder = new StringBuilder();
        try (Stream<String> stream = Files.lines(Paths.get(fileName), StandardCharsets.UTF_8)) {
            stream.forEach(s -> builder.append(s).append("\n"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return builder.toString();
    }
}