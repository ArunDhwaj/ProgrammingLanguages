import java.io.*;

public class StandardStream
{
    //InputStreamReader isr = null;

    public StandardStream()
    {

    }

    public void readWriteByStandardStream() throws IOException, FileNotFoundException
    {
        InputStreamReader isr = null;

        FileOutputStream fw = null;

        try
        {
            isr = new InputStreamReader(System.in);

            fw = new FileOutputStream("/home/smartbitpixel/Desktop/output4.txt");

            System.out.println("Enter charactes, 'q' to quit");

            char c;

            do
            {
                c = (char) isr.read();

                fw.write(c);

               // System.out.println(c);

            }
            while (c != 'q');

        }
        catch(Exception e)
        {
            System.out.println("readWriteByStandardStream: Exception: " + e);
        }

        finally
        {
            if (isr != null)
            {
                isr.close();
            }

            if (fw != null)
            {
                fw.close();
            }

        }

    }
}
