import java.io.*;

public class Driver
{
   public static void main(String[] args) throws IOException
   {
       //Byte Stream: reading/writting 1 byte
       ByteStreams bs = new ByteStreams();
       bs.inputOutputByByteStream();

       //Character Stream: reading/writting 2 byte
       CharacterStreams cs = new CharacterStreams();
       cs.readWriteByCharStreaming();

       //Standard Stream: reading/writting from standard input/output
       StandardStream ss = new StandardStream();
       ss.readWriteByStandardStream();
   }
}
