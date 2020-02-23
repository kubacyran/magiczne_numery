package cyran.kuba;

public class TxtTester implements FileTester {
    @Override
    public boolean test(byte[] data) {
        for(byte b : data){
            if((int)b > 127 || (int)b<0)
                return false;
        }
        return true;
    }
}
