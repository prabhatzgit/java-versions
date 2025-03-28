package jdk7.string;

public class CharInteger {
    public static void main(String[] args) {
        String string = "a:10;b:20";
        String[] stringArray = string.split(";");
        for(String str : stringArray){
            str.split(":");
        }
    }
}
