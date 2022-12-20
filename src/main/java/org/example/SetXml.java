package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class SetXml extends RecorderFile {

    @Override
    public void setFile(String text) {
        try (FileWriter writer = new FileWriter("file.xml", false)) {
            writer.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
