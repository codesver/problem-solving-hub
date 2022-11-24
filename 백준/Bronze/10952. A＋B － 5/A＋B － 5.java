import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    public static final StringBuilder result = new StringBuilder();

    private static void solution() throws IOException {
        while (true) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int numA = Integer.parseInt(tokenizer.nextToken());
            int numB = Integer.parseInt(tokenizer.nextToken());
            if (numA == 0 && numB == 0)
                break;
            result.append(numA + numB).append("\n");
        }
    }

    private static void finish() throws IOException {
        writer.write(result.toString());
        writer.flush();
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
        finish();
    }
}
