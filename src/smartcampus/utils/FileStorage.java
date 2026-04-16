package smartcampus.utils;

import java.io.*;

public class FileStorage {

    public static void save(String data) {
        try (FileWriter fw = new FileWriter("data.txt", true)) {
            fw.write(data + "\n");
        } catch (IOException e) {
            System.out.println("File write error");
        }
    }

    public static void read() {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File read error");
        }
    }
}