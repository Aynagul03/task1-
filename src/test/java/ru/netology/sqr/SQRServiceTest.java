package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({
            "200,300,3",
            "100,300,7",
            "-100,100,0",
            "-300,-50,0",
            "200,30000,84",
            "30,102,1"
    })

    public void MustFindASpecificRangeOfNumbers (int min, int max, int expected) {

        SQRService service = new SQRService();
        int actual = service.squareRoot(min, max);

        Assertions.assertEquals (expected, actual);
    }
}


