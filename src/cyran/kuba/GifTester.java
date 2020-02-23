package cyran.kuba;

import java.io.*;

public class GifTester implements FileTester {
    @Override
    public boolean test(File file) throws IOException{
        BufferedInputStream bufferedInputStream = null;
        byte[] data = null;
        try{
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            data = new byte[6];
            bufferedInputStream.read(data);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(bufferedInputStream != null){
                bufferedInputStream.close();
            }
        }
        if(data != null){
            String str = "";
            for(byte b : data){
                str += Integer.toHexString(b & 0xFF);
            }
            String fileName = file.getName().toLowerCase();
            String key = fileName.substring(fileName.indexOf('.'));
            for(String s : ExtensionsAndMagicNumbers.extension_to_magic_nums.get(key)){
                if(s.equals(str)){
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
