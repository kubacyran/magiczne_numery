package cyran.kuba;

public class TesterProvider {
    public FileTester provide(String str){
        if(str.equals(".gif")){
            return new GifTester();
        }
        else if(str.equals(".jpg") || str.equals(".jpeg")){
            return new JpgTester();
        }
        else if(str.equals(".txt")){
            return new TxtTester();
        }
        return  null;
    }
}
