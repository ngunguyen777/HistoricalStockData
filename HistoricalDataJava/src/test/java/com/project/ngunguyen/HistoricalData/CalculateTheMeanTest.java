package com.project.ngunguyen.HistoricalData;

import com.project.ngunguyen.HistoricalData.service.DataService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculateTheMeanTest {

    public void calculateTheMean(Double[] testData, Double expectedResult){
        DataService dataService = new DataService();

        Double actualResult = dataService.calculateTheMean(testData);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void test1(){
        Double[] testData = {3d, 5d, 7d};
        Double expectedResult = 5d;
        calculateTheMean(testData, expectedResult);
    }

    @Test
    public void test2(){
        Double[] testData = {1d, 7d, 3d, 7d};
        Double expectedResult = 4.5d;
        calculateTheMean(testData, expectedResult);
    }

    @Test
    public void test3(){
        Double[] testData = {10d, 5d, 9d, 20d, 11d};
        Double expectedResult = 11d;
        calculateTheMean(testData, expectedResult);
    }

}
