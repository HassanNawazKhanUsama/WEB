import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileLockInterruptionException;

public class lab3e2{
    public static void main(String[] args) throws IOException {
        //accessing the wrong file using invalid path
        File ob=new File("/uiit/home");
        FileInputStream f1=new FileInputStream(ob);
        //causing FileNotFound exception
        System.out.println(f1.read(null, 0, 0));

    }
}

