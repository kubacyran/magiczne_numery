package cyran.kuba;

import java.util.Map;

public class FindExtensions {
    public String find(byte[] data){
        String extension = "nieznane";
        String str = "";
        for(byte b : data){
            str += Integer.toHexString(b & 0xFF);
        }
        for(Map.Entry<String, String> e : ExtensionsAndMagicNumbers.magic_nums_to_extensions.entrySet()){
            if(str.startsWith(e.getKey())) {
                extension = e.getValue();
                break;
            }
        }
        return extension;
    }
}
