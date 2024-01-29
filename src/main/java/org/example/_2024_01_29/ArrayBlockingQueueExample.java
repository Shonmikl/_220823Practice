package org.example._2024_01_29;

import com.github.javafaker.Faker;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueExample {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(4);

        Thread producer = new Thread(() -> {
            String[] strings = new String[10];
            for (int i = 0; i < strings.length; i++) {
                strings[i] = new Faker().name().title();
            }

            for (int i = 0; i < strings.length && !Thread.interrupted(); i++) {
                try {
                    Thread.sleep(2200);
                    queue.put(strings[i]);
                    System.out.println("Producer put: " + strings[i] + " || Number: " + queue.size());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread consumer = new Thread(() -> {
            StringBuilder sb = new StringBuilder();
            while (!Thread.interrupted()) {
                try {
                    sb.setLength(0);
                    Thread.sleep(5100);
                    sb.append(queue.take());
                    System.out.println("Consumer get: " + sb.reverse() + " || Number: " + queue.size());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        producer.start();
        consumer.start();
    }
}