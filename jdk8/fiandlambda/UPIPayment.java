package jdk8.fiandlambda;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@FunctionalInterface
public interface UPIPayment {

    // abstract method will force to override in implementation class
    String doUpiPayment(String source, String destination);

    // default method won't force to override in implementation class
    default double getScratchCard(){
        return new Random().nextDouble();
    }

    // static method act as a utility class
    static String datePatterns(String patterns){
        SimpleDateFormat dateFormat = new SimpleDateFormat(patterns);
        return dateFormat.format(new Date());
    }
}
