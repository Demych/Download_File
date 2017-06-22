import java.io.*;

import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Asus on 22.06.2017.
 */
public class Main {
    public static void main(String[] args) {

        Start_Download start_download = new Start_Download(args[0], args[1]);
        start_download.start_download(start_download.getInputFile(), start_download.getOutputFile());
    }
    }
