import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWrite 写入数据
 */
public class FileWriterTest {

    public static void main(String[] args) {

        FileWriter fw = null;
        try {

            fw = new FileWriter("demo.txt", true);
            for (int i = 0; i < 10; i++) {

                fw.write("abcd" + i + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {

                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
