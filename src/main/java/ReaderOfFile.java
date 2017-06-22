import java.util.List;

/**
 * Created by Asus on 22.06.2017.
 */
abstract public class ReaderOfFile {

   private String inputFile;

    public String getInputFile() {
        return inputFile;
    }

    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }

    public ReaderOfFile(String inputFile) {

        this.inputFile = inputFile;
    }

    abstract void readerFile(String inputFile);
}
