package cyran.kuba;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingData {
    public byte[] read(String path) throws IOException {
        BufferedInputStream bufferedInputStream = null;
        FileInputStream fileInputStream = null;
        byte[] data = null;
        try{
            fileInputStream = new FileInputStream(path);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            data = new byte[1000];
            bufferedInputStream.read(data);
        } finally {
            if(bufferedInputStream != null){
                bufferedInputStream.close();
                fileInputStream.close();
            }
        }
        return data;
    }
}
