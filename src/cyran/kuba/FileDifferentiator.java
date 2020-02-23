package cyran.kuba;

import java.util.HashSet;
import java.util.Set;

public class FileDifferentiator {
   private Set<String> handling_extensions = new HashSet<>(){{
       add("jpg");
       add("jpeg");
       add("gif");
       add("txt");
   }};

}
