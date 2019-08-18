import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

class Refactorings {
    public static final String TXT = "txt";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("input." + TXT));
        BufferedReader reader = bufferedReader;
        ArrayList<String> lines = new ArrayList<String>();
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();
        String[] array = lines.toArray(new String[lines.size()]);
        Arrays.sort(array);
        print(array);
    }


    private static void print(String[] array) {

        for (String s : array) {
            System.out.println(s);
        }
    }
}