package jdk8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        // it has type that enables parallel processing of elements
        // allowing multiple threads to process parts of the stream simultaneously
        // this can significantly improve to performance for large data sets
        // workload is distributed across multiple threads

        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(2000).toList();
        List<Long> factorialList = list.stream().map(ParallelStream::factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with sequential stream: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        factorialList = list.stream().map(ParallelStream::factorial).toList();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with parallel stream: " + (endTime - startTime) + "ms");

        // Parallel streams are most effective for CPU-intensive
        // or large datasets where tasks are independent
        // They may add overhead for simple tasks or small datasets

        // cumulative sum
        // [1,2,3,4,5] -> [1,3,6,10,15]

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        // to achieve thread safety in cumulative addition use this AtomicInteger
        AtomicInteger sum = new AtomicInteger(0);
        // no need to write this below code if we use AtomicInteger
        /*numbers.stream().map(x -> {
        int i = x + sum;
        sum = i;
        return i;
        });*/
        // lambda expression
        //List<Integer> cumulativeSumLE = numbers.stream().map(x -> sum.addAndGet(x)).toList();
        // method reference
        List<Integer> cumulativeSumME = numbers.stream().map(sum::addAndGet).toList();
        System.out.println("Expected cumulative sum: [1,3,6,10,15]");
        // stream guarantee on order of execution. So, the output is expected as desired
        System.out.println("Actual cumulative sum : " + cumulativeSumME);

        // parallel stream doesn't guarantee on order of execution. So, the output is not expected as desired
        List<Integer> cumulativeSumParallelStreamME = numbers.parallelStream().map(sum::addAndGet).toList();
        System.out.println("Expected cumulative sum using parallel stream : [1,3,6,10,15]");
        System.out.println("Actual cumulative sum : " + cumulativeSumParallelStreamME);

        List<Integer> parallelStreamWithSequential = numbers.parallelStream().map(sum::addAndGet).sequential().toList();
        System.out.println("Expected cumulative sum using parallel stream with sequential : [1,3,6,10,15]");
        System.out.println("Actual cumulative sum : " + parallelStreamWithSequential);

        // Stream and Parallel stream
        List<String> listOfLanguages = Arrays.asList("React", "Java", "Python", "JavaScript", "C++", "C#", "Go");
        System.out.println("print list of languages using stream");
        // print sequence
        Long startTimeForStream = System.currentTimeMillis();
        listOfLanguages.stream().forEach(language -> System.out.println(language + "-"+Thread.currentThread()));
        Long endTimeForStream = System.currentTimeMillis();
        System.out.println("Time taken for stream: " + (endTimeForStream - startTimeForStream) + "ms");

        // parallel stream
        // when you create a parallel stream from a collection, the stream automatically splits data into
        // smaller chunks. This splitting is automatically done recursively until each chunk is small enough
        // to process efficiently or until a certain threshold is reached
        List<String> listOfFrameworks = Arrays.asList("SpringBoot", "DJango", "Junit&Mockito", "Micronaut", "JEST");
        System.out.println("print list of frameworks using stream");
        Long startTimeForParallelStream = System.currentTimeMillis();
        listOfFrameworks.parallelStream().forEach(framework -> System.out.println(framework + "-"+Thread.currentThread()));
        Long endTimeForParallelStream = System.currentTimeMillis();
        System.out.println("Time taken for parallel stream: " + (endTimeForParallelStream - startTimeForParallelStream) + "ms");
        // Processing: Once stream is divided in smaller chunks then it will assign all the chunks to multiple threads
        // to process the operations. Multiple thread managed by Fork join pool which is responsible for creating
        // threads dynamically.
        // no guarantee which element will execute and print first

    }

    private static long factorial(int x) {
        long result = 1;
        for (int i = 2; i <= x; i++) {
            result *= i;
        }
        return result;
    }
}
