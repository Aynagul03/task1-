package ru.netology.sqr;

public class SQRService {
    public int squareRoot(int limitMin, int limitMax) {
        int number = 0;
        for (int i = 10; i < 99; i++) {
            int x = i * i;
            if (x > limitMin) {
                if (x < limitMax) {
                    number++;
                }
            }
        }
        return number;
    }
}



