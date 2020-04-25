import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileWriterDemo {
    public static void main(String[] args) throws Exception {
        Map<Integer,String> collection = new HashMap<Integer,String>();
        collection.put(10,"Tom");
        collection.put(11,"Peter");
        collection.put(12,"Jason");
        collection.put(13,"Mary");
        File file = new File("C:\\Users\\kseni\\Desktop\\Java\\SchoolManagementSystem\\Databases\\StudentsDatabase.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(String.valueOf(collection));
        bufferedWriter.close();
    }
}
