/* copy one file data to another */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
class copyFile
{
    public static void main(String[] args) throws IOException {

        FileInputStream r=new FileInputStream("C:\\Users\\Abhi Gupta\\downloads\\UP.txt");
        FileOutputStream w=new FileOutputStream("C:\\Users\\Abhi Gupta\\downloads\\OP.txt");

        int i;
        while((i=r.read())!=-1)
        {
            w.write((char)i);
        }
        System.out.println("Data Copied Successfully");
    }
}
