package at.htl.exam01.compress;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class StringCompress {

    private static final String FILE_NAME = "sample.txt";

    StringCompress stringCompress = new StringCompress();

    //    * und die Methoden des Objekts werden aufgerufen


    public static void main(String[] args) {
        final String FILE = "sample.txt";
        int number = getNoOfLines(FILE);
        String[] stringArray = readFromFile(FILE, number);
        print(stringArray);

    }

    public static String readFile(String filename) {
        StringBuilder sb = new StringBuilder();

        try (Scanner scanner = new Scanner(new FileReader(filename))) {
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine());
                sb.append("\n");
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return sb.toString();
    }


    public static String[] readFromFile(String file, int number) {
        String[] stringArray = new String[number];
        int count = 0;
        char letter;
        String letterString = "";
        int zahl = 0;


        try (Scanner scanner = new Scanner(new FileReader(file))) {
            while (scanner.hasNextLine()) {
                stringArray[count] = scanner.nextLine();
                letter = stringArray[count].charAt(0);
                letterString = "" + letter;
                String[] parts = stringArray[count].split(letterString);
                zahl = Integer.valueOf(parts[1]);
                for (int i = 0; i < zahl; i++) {
                    if (i == 0) {
                        stringArray[count] = letterString;
                    }
                    else {
                        stringArray[count] += letterString;
                    }
                }
                count++;
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return stringArray;
    }

    public static void print(String[] lines) {
        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);
        }
    }

    public static int getNoOfLines(String fileName) {
        int number = 0;
        try (Scanner scanner = new Scanner(new FileReader(fileName))) {
            while (scanner.hasNextLine()) {
                number++;
                scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }

        return number;
    }
}
