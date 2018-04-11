import java.io.FileReader;
import java.io.IOException;

/**
 *
 *  FileReader  读取一个文本文件中的数据。
 *ØØØØ
 *  返回 -1  标志读到结尾
 */

public class FileReaderTest {

    public static void main(String[] args){

       Demo1();
       System.out.println("=======华丽分界线=======");
       Demo2();

    }

    private static void Demo2() {

        FileReader fileReader = null;

        try {
            fileReader = new FileReader("demo.txt");

            //  自定义缓冲区
            char[] buf = new char[1024];

            while (fileReader.read(buf) != -1){
                System.out.println(new String(buf).trim());//去尾
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void Demo1() {

        FileReader fr = null;
        try {
            fr = new FileReader("demo.txt");
            while (fr.read() != -1){
                System.out.println(fr.read());
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {

            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
