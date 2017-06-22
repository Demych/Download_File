import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Asus on 22.06.2017.
 */
public class Start_Download {

  private   String inputFile;
   private String outputFile;

    public Start_Download(String inputFile, String outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }

    public String getInputFile() {
        return inputFile;
    }
    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }

    public String getOutputFile() {
        return outputFile;
    }
    public void setOutputFile(String outputFile) {
        this.outputFile = outputFile;
    }
    BufferedInputStream in = null;
    public void start_download(String inputFile, String outputFile) {

                try ( BufferedOutputStream fout = new BufferedOutputStream(new FileOutputStream(outputFile)) ) {

                      URL remoteFile = new URL(inputFile);
                            URLConnection fileStream = remoteFile.openConnection();
                             in = new BufferedInputStream( fileStream.getInputStream());
                             int data;

            while ((data = in.read()) != -1) {
                fout.write(data);

            }
             } catch (IOException e) {
                    e.printStackTrace();
                }
                finally {
            System.out.println(inputFile + "has benn downloaded");
        }
        try{
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }