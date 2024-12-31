import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String[] fileNames = {"d://test/file.txt"}; // Add file names here

        ArrayList<Integer> numbers = new ArrayList<>();

        for (String fileName : fileNames) {
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = br.readLine()) != null) {
                    try {
                        int num = Integer.parseInt(line);
                        numbers.add(num);
                    } catch (NumberFormatException e) {
                        System.err.println("Skipping non-integer value in file: " + fileName);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Sort the numbers
        Collections.sort(numbers);
          int count=0;
        // Print the sorted contents
        for (int num : numbers) {
            System.out.println(num);

            count++;
        }
        System.out.println("total count is : "+count);
    }
}
