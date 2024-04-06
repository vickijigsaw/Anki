import java.util.Arrays;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class AnkiScreens {
    public static void main(String[] agrs) {
        File folder = new File("/home/vicki/Pictures/Screenshots");
        File[] listOfFiles = folder.listFiles();

        try {
            PrintWriter writer = new PrintWriter("AnkiFile.txt");

            Arrays.sort(listOfFiles, (a, b) -> a.getName().compareTo(b.getName()));
            for (int i = 0; i < listOfFiles.length; i++) {
                writer.print("<img src=\"" + listOfFiles[i] + "\">");
                if (i % 2 == 0) {
                    writer.print(";");
                } else {
                    writer.print("\n");
                }
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
