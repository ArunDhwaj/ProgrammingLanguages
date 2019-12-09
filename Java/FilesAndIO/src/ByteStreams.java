import java.io.*;

public class ByteStreams
{
    FileInputStream fi = null;
    FileOutputStream fo1 = null;
    FileOutputStream fo2 = null;

    public ByteStreams()
    {

    }

    public void inputOutputByByteStream() throws IOException, FileNotFoundException
    {

        try
        {
            fi = new FileInputStream("/home/smartbitpixel/Desktop/fileio.txt");
            fo1 = new FileOutputStream("/home/smartbitpixel/Desktop/output1.txt");
            fo2 = new FileOutputStream("/home/smartbitpixel/Desktop/output2.txt");

           int c;

           while ((c = fi.read()) != -1)
           {
               fo1.write(c);
               fo2.write(c);
           }

        }
        catch (Exception e)
        {
            System.out.println("1.1 e: " + e);
        }
        finally
        {
            if(fi != null)
            {
                fi.close();
            }

            if(fo1 != null)
            {
                fo1.close();
            }

            if(fo2 != null)
            {
                fo2.close();
            }
        }
    }
}
