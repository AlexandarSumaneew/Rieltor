package runner;

import util.FileReaderTo;
import org.aeonbits.owner.ConfigFactory;
import util.PathProperty;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {
    public static void main(String[] args) {
        PathProperty cfg = ConfigFactory.create(PathProperty.class);
        FileReaderTo propertiesReader = new FileReaderTo();
        propertiesReader.loadProperty(cfg.filePathAportaments());

        System.out.println(propertiesReader.getProperties());



        ArrayList listOfTrait = new ArrayList<>();


                Pattern pattern = Pattern.compile("[^$|]+", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(propertiesReader.getProperties());

        while (matcher.find()) {
            String source = matcher.group();
        }
        System.out.println(listOfTrait);
    }}