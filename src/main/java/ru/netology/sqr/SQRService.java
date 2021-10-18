package ru.netology.sqr;

public class SQRService {

    public int numberOfSquares(int number) {
        int minLimit = 200;
        int maxLimit = 300;
        int counter = 0;
        for (int i = 10; i <= number; i++) {
            if (i * i >= minLimit && i *i <= maxLimit) {
                counter++;
            }
        }
        return counter;
    }
}
