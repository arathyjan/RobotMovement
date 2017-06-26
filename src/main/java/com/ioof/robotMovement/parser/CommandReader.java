package com.ioof.robotMovement.parser;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CommandReader {

    private static final String INPUT_FILE_NAME = "input.txt";

    public static List<String> readInput() throws IOException, URISyntaxException {
        URL classpathUrl = ClassLoader.getSystemResource(INPUT_FILE_NAME);
        if(classpathUrl == null)
            throw new FileNotFoundException("Cannot read file with name" + INPUT_FILE_NAME);
        return Files.readAllLines(Paths.get(classpathUrl.toURI()));
    }
}
