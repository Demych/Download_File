import javax.xml.bind.SchemaOutputResolver;
import java.util.List;

/**
 * Created by Asus on 22.06.2017.
 */
public class XMLReader extends ReaderOfFile{


    void readerFile(String inputFile) {

        System.out.println("Reading XML...");
    }

    public XMLReader(String inputFile) {
        super(inputFile);
    }
}
