package cyran.kuba;

import java.io.IOException;

public class App {
    public static void main(String[] args)throws IOException {
        if(args.length > 0){
            FileDifferentiator fd = new FileDifferentiator();
            for(String str : args) {
                fd.differentFile(str);
            }
        }
        else{
            System.out.println("Nie podales zadnej sciezki pliku");
        }

    }
}
