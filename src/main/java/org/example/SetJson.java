package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SetJson extends RecorderFile {
    List<RecorderFile> files = new ArrayList<>();

    @Override
    public void setFile(String text) {
        try (FileWriter writer = new FileWriter("file.json", false)) {
            writer.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
