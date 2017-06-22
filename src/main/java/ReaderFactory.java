/**
 * Created by Asus on 22.06.2017.
 */
public class ReaderFactory  {


    private String inputFile;



    public String getInputFile() {
        return inputFile;
    }
    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }


    public ReaderFactory(StringBuffer sb, String outputFile) {
        this.inputFile = outputFile;
    }

    public ReaderOfFile getReader(String inputFile) {
        int i = inputFile.length();
        String fileType = inputFile.substring((i - 3));
        if (fileType.equalsIgnoreCase("XML")) {
            return new XMLReader( inputFile);}
        else if (fileType.equalsIgnoreCase("CSV")) {
            return new CSVReader( inputFile);}
        else if (fileType.equalsIgnoreCase("SON")) {
                return new JSONReader(inputFile);
        }else throw new RuntimeException(fileType + "is not supperted");
    }
}

