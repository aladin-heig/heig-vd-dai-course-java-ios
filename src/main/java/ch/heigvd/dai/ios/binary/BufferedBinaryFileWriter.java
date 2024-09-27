package ch.heigvd.dai.ios.binary;

import ch.heigvd.dai.ios.Writable;

import java.io.*;

/**
 * A class that writes binary files. This implementation writes the file using a buffered output
 * stream. It manages the file output stream properly with a try-with-resources block.
 */
public class BufferedBinaryFileWriter implements Writable {
  OutputStream fos;
  BufferedOutputStream bos;

  @Override
  public void write(String filename, int sizeInBytes) {
    //throw new UnsupportedOperationException("Please remove this exception and implement this method.");
    try {
      fos = new FileOutputStream(filename);
      bos = new BufferedOutputStream(fos);
      for (int i = 0; i < sizeInBytes; i++) {
        bos.write('A');
      }
    } catch (FileNotFoundException e) {
      System.out.println("Exception: " + e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    } finally {
      if (bos != null) {
        try {
          bos.flush();
          bos.close();
        } catch (IOException e) {
          System.out.println("Exception in close writer " + e);
        }
      }
      if (fos != null) {
        try {
          fos.close();
        } catch (IOException e) {
          System.out.println("Exception in close writer " + e);
        }
      }
    }
  }
}
