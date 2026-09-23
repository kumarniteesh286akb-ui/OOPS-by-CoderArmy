package InputAndOutputStream;
import java.io.IOException;


public class InputStream {
    public static void main(String[] args) throws IOException {
 int x= System.in.read();
        System.out.println((char)x);
    }
}
