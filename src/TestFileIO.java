import java.io.File;
import java.io.IOException;

/**
 * Created by hongzhi on 2017/2/24.
 */
public class TestFileIO {
    public static void main(String[] args) throws IOException {
        File dir = new File("dir1");
        dir.mkdir();//  创建目录
        File file1 = new File(dir, "file1");//  目录加文件名
        File file2 = new File("dir1/file2");//  依次创建完整路径
        try {
            file1.createNewFile();//创建文件，若存在同名文件，不会覆盖
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
       deleteFile();
    }

    private static void deleteFile(){
        File file = new File("dir1/dir2");
        if (file.delete()){
            System.out.println(file.getName() + " was deleted!");
        } else {
            System.out.println("file is not delete!");
        }
    }

}
