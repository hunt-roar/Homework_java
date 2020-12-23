package HW6;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Create {
        static String ABC = "Loremipsumdolorsitamet";

        public static void main(String[] args) {
            createFile("1.txt",createText(100));
            createFile("2.txt",createText(100));
        }
        public static String createText(int len){
            StringBuilder sb = new StringBuilder(len);
            for (int i = 0; i < len; i++){
                sb.append(ABC.charAt(ABC.length()));
            }
            return sb.toString();
        }

        public static void createFile(String fileName, String text){
            try{
                PrintWriter pw = new PrintWriter(fileName);
                pw.write(text);
                pw.close();

            } catch (FileNotFoundException e){
                e.printStackTrace();
            }
        }
}
