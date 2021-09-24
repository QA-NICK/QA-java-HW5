package ru.netology.sqr;

public class SQRService {
    public int sqrInRange(int lowBound, int upperBound) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i >= lowBound) && (i * i <= upperBound)) {
                counter = counter + 1;
            }

        }
        System.out.println(counter);
        return counter;

    }

}
