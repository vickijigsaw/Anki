import java.util.Arrays;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class AnkiScreens {
    public static void main(String[] agrs) {
        String DIR_PATH = "/home/vicki/Personal_Projects/drivers-anki/";

        try {
            PrintWriter writer = new PrintWriter("AnkiFile.txt");
           
            // Page loop
            for (int i = 0; i < 2000; i++) {
                // Question loop
                for (int x = 0; x < 2; x++) {
                    String questionName = "page_" + i + "_question_" + x + ".png";
                    String answerName = "page_" + i + "_answer_" + x + ".png";
                    File questionFile = new File(DIR_PATH + questionName);
                    File answerFile = new File(DIR_PATH + answerName);
                    // System.out.println("Question " + questionName);
                    // System.out.println("Answer " + answerName);
                    if (!questionFile.exists() || !answerFile.exists()) {
                        continue;
                    }
                    writer.print("<img src=\"" + questionName + "\">;" + "<img src=\"" + answerName + "\">\n");
                }
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
