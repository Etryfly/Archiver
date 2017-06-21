package archiver;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * Created by etryfly on 20.06.17.
 */
public class Model {
    private File fileInput;
    private File fileOutput;


    public Model() {
    }



    public void archiveFile() throws IOException {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(fileOutput));
        FileInputStream fileInputStream = new FileInputStream(fileInput);
        ZipEntry entry = new ZipEntry(fileInput.getName());
        zipOutputStream.putNextEntry(entry);
        while (fileInputStream.available() > 0) {

            zipOutputStream.write(fileInputStream.read());
        }
        System.out.println("Archive");

        zipOutputStream.close();
        fileInputStream.close();


    }

    public void setFileInput(File fileInput) {
        this.fileInput = fileInput;
    }

    public void setFileOutput(File fileOutput) {
        this.fileOutput = fileOutput;
    }
}
