package cyran.kuba;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FileDifferentiator {
   private Set<String> handling_extensions = new HashSet<>(){{
       add(".jpg");
       add(".jpeg");
       add(".gif");
       add(".txt");
   }};

   public boolean differentFile(String path) throws IOException {
       String extension = path.substring(path.indexOf('.')).toLowerCase();

       if(!handling_extensions.contains(extension)){
           throw new IllegalArgumentException();
       }

       FileTester fileTester = new TesterProvider().provide(extension);
       boolean isCorrect = false;
       byte[] data = new ReadingData().read(path);
       if(fileTester != null) {
           isCorrect = fileTester.test(data);

           if (isCorrect) {
               System.out.println("Prawidlowe rozszerzenie pliku");
           } else {
               String ext = new FindExtensions().find(data);
               System.out.println("Nieprawidlowe rozszerzenie "+ extension +" podczas gdy plik ma "+ext);
           }
       }
       return isCorrect;
   }
}
