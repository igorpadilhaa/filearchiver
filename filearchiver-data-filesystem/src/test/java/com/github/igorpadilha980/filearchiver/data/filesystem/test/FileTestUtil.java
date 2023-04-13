package com.github.igorpadilha980.filearchiver.data.filesystem.test;

import com.github.igorpadilha980.filearchiver.data.FileDataSource;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileTestUtil {

    public static Path createTempFile() throws IOException {
        return Files.createTempFile("test-" + String.valueOf(System.currentTimeMillis()), null);
    }

    public static FileDataSource sourceFromString(String data) {
        return () -> new ByteArrayInputStream(data.getBytes());
    }

}
