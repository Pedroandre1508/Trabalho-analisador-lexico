package gui;

import classes.LanguageParser;

public class Main {

//    public static void main(String[] args) throws ParseException {
public static void main(String[] args) {
    App.main(args);
    new LanguageParser(System.in);
}
}
