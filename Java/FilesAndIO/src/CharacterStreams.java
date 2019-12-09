import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreams
{
    FileReader fr = null;
    FileWriter fw = null;

    public CharacterStreams()
    {

    }

    public void readWriteByCharStreaming() throws IOException, FileNotFoundException
    {

        try
        {
            fr = new FileReader("/home/smartbitpixel/Desktop/output1.txt");
            fw = new FileWriter("/home/smartbitpixel/Desktop/output5.txt");

            int c;
            while ((c = fr.read()) != -1)
            {
                fw.write(c);
            }
        }
        catch (Exception e)
        {
            System.out.println("1.1 e: " + e);
        }
       finally
        {
            if (fr != null)
            {
                fr.close();
            }

            if (fw != null)
            {
                fw.close();
            }
        }
    }

    public void readWriteByCharStreaming(FileReader fr, FileWriter fw) throws IOException, FileNotFoundException
    {

        try
        {
            fr = new FileReader("/home/smartbitpixel/Desktop/output1.txt");
            fw = new FileWriter("/home/smartbitpixel/Desktop/output3.txt");

            int c;
            while ((c = fr.read()) != -1)
            {
                fw.write(c);
            }
        }

        catch (Exception e)
        {
            System.out.println("1.1 e: " + e);
        }
       finally
        {
            if (fr != null)
            {
                fr.close();
            }

            if (fw != null)
            {
                fw.close();
            }
        }
    }
}
