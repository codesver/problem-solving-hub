import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < 10; i++)
            set.add(Integer.parseInt(reader.readLine()) % 42);

        System.out.println(set.size());
    }
}