package cyran.kuba;

import java.util.HashMap;
import java.util.Map;

public class ExtensionsAndMagicNumbers {
   public static Map<String, String[]> extension_to_magic_nums = new HashMap<>(){{
        put(".gif",new String[]{"474946383761","474946383961" });
        put(".jpg", new String[]{"FFD8"});
    }};

   public static Map<String, String> magic_nums_to_extensions = new HashMap<>(){{
       put("474946383761",".gif");
       put("474946383961",".gif");
       put("FFD8", ".jpg/jpeg");
   }};
}
