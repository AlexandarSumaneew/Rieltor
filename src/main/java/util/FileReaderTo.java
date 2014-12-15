package util;

import org.aeonbits.owner.ConfigFactory;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FileReaderTo {

    public Properties properties = new Properties();


    public void loadProperty(String name) {
        try {
            properties.load(new InputStreamReader(new FileInputStream(System.getProperty("user.dir") +
                    name), "UTF-8"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }




   public String getProperties() {
        StringBuilder listOfElements = new StringBuilder();

        for (String line : properties.stringPropertyNames()) {
            try {
                listOfElements.append(line);
            } catch (IllegalArgumentException e) {
                System.err.println("[IllegalArgumentException]: Not enough arguments in " + line.toUpperCase() +
                        ". Plane will not be loaded");
            }
        }
        return listOfElements.toString();
    }




    public List<String> getNameColumn(String reg, String key) {

        /*TreeMap listOfElements = new TreeMap<String, List<String>>();*/
        ArrayList listOfTrait = new ArrayList<>();


        Pattern pattern = Pattern.compile(reg, Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(key);
        while (matcher.find()) {
            String source = matcher.group();
            listOfTrait.add(source);
        }
        return listOfTrait;


    }






}