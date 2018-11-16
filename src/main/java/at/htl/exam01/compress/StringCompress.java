//package at.htl.exam01.compress;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.util.Scanner;
//
//public class StringCompress {
//
//    private static final String FILE_NAME = "sample.txt";
//
//    StringCompress stringCompress = new StringCompress();
//
//    //    * und die Methoden des Objekts werden aufgerufen
//
//
//    public static void main(String[] args) {
//        StringCompress sc = new StringCompress();
//        String[] text = sc.readFromFile(FILE_NAME);
//        sc.print(text);
//
//        int counter = 0;
//        String[] liste = new String{};
//        liste [counter]= readFile("sample.txt");
//
//    }
//
//    public static String readFile(String filename){
//        StringBuilder sb = new StringBuilder();
//
//        try (Scanner scanner = new Scanner(new FileReader(filename))){
//            while (scanner.hasNextLine()){
//                sb.append(scanner.nextLine());
//                System.out.println("");
//            }
//        }catch (FileNotFoundException e){
//            System.err.println(e.getMessage());
//        }
//        return sb.toString();
//    }
//
//    public String[] readFromFile(String fileName) {
//        for (int i = 0; i < fileName.length(); i++) {
//            if()
//        }
//
//        return null;
//    }
//
//
//    /**
//     * Der Inhalt des String-Arrays wird zeilenweise auf der Console ausgegeben
//     *
//     *
//     * @param lines String-Array
//     */
//    public void print(String[] lines) {
//
//    }
//
//    /**
//     * Die Anzahl der Zeilen der übergebenen Textdatei wird bestimmt
//     *
//     * @param fileName
//     * @return Anzahl der Zeilen in der Textdatei
//     */
//    public int getNoOfLines(String fileName) {
//
//
//        return -1;
//    }
//}
