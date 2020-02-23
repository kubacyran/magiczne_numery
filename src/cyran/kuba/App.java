package cyran.kuba;

import java.io.IOException;

public class App {
    public static void main(String[] args)throws IOException {
        FileDifferentiator fd = new FileDifferentiator();
        fd.differentFile("koles.txt");

    }
}
