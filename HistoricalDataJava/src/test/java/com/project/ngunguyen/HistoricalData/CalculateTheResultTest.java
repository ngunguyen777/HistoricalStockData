package com.project.ngunguyen.HistoricalData;

import com.project.ngunguyen.HistoricalData.service.DataService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculateTheResultTest {
    public void calculateSampleMean(Double[] testData, Double expectedResult){
        DataService dataService = new DataService();
        Double mean = dataService.calculateTheMean(testData);

        Double actualResult = dataService.calculateTheResult(testData, mean);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void test1(){
        Double[] testData = {3d, 5d, 7d};
        Double expectedResult = 2d;
        calculateSampleMean(testData, expectedResult);
    }

    @Test
    public void test2(){
        Double[] testData = {4d, 2d, 6d, 7d};
        Double expectedResult = 2.217355782608345d;
        calculateSampleMean(testData, expectedResult);
    }

    @Test
    public void test3(){
        Double[] testData = {1d, 9d, 4d, 3d, 9d};
        Double expectedResult = 3.63318042491699d;
        calculateSampleMean(testData, expectedResult);
    }
}
