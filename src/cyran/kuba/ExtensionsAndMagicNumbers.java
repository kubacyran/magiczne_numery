package cyran.kuba;

import java.util.HashMap;
import java.util.Map;

public class ExtensionsAndMagicNumbers {
   public static Map<String, String[]> extension_to_magic_nums = new HashMap<>(){{
        put("gif",new String[]{"474946383761","474946383961" });
        put("jpg", new String[]{"FFD8"});
        put("jpeg", new String[]{"FFD8"});
    }};
}
