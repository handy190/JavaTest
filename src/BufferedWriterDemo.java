import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

    public static void main(String[] args) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("FileWriterDemo.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (int i = 0; i < 5; i++) {
                bufferedWriter.write("写入数据--->" + i);
                bufferedWriter.newLine();//写入换行符
                bufferedWriter.flush();//刷新缓冲区
            }
            fileWriter.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
