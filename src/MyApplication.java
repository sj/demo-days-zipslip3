package src;

import java.io.File;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

class MyApplication {    
    public static void main(final String[] argv) throws Exception {
        System.out.println("Hello world!");
    }

    private static void extractZip() throws Exception {
        ZipInputStream zipstream = new ZipInputStream(
            new FileInputStream(new File("my-zip-file.zip")));
        
        
        ZipEntry entry;
        while ((entry = zipstream.getNextEntry()) != null){
            // Get the name of the file inside the zip archive
            String filename = entry.getName();

            // My manager wants all filenames to be lowercase
            String loweredFilename = filename.toLowerCase();

            // TODO: I think we need to do something with a FileOutputStream?
        }
    }
}