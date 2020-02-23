package cyran.kuba;

import java.io.*;

public class JpgTester implements FileTester {
    @Override
    public boolean test(byte[] data) {
            String str = "";
            for(byte b : data){
                str += Integer.toHexString(b & 0xFF);
            }
            for(String s : ExtensionsAndMagicNumbers.extension_to_magic_nums.get(".jpg")){
                if(str.startsWith(s)){
                    return true;
                }
            }
            return false;
    }
}
