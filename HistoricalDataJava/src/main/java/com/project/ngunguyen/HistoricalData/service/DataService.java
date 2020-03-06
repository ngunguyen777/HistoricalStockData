package com.project.ngunguyen.HistoricalData.service;

import com.project.ngunguyen.HistoricalData.model.DataModel;
import com.project.ngunguyen.HistoricalData.model.RequestModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DataService {

    public DataModel[] requestDataFromEOD(RequestModel requestModel) {
        String url = requestModel.toString();
        RestTemplate restTemplate = new RestTemplate();
        DataModel[] data = restTemplate.getForObject(url, DataModel[].class);

        Double[] adjustedCloseDouble = convertDataAdjustedCloseToDouble(new Double[data.length], data);
        Double mean = calculateTheMean(adjustedCloseDouble);
        Double result = calculateTheResult(adjustedCloseDouble, mean);

        data[0].setVariance(result);

        return data;
    }

    public Double calculateTheResult(Double[] adjustedCloseDouble, Double mean) {
        Double result = 0d;
        for(int i = 0; i < adjustedCloseDouble.length; i++){
            result += (Math.pow(adjustedCloseDouble[i] - mean, 2));
        }
        result /= (adjustedCloseDouble.length-1);
        result = Math.sqrt(result);
        return result;
    }

    public Double calculateTheMean(Double[] adjustedCloseDouble) {
        Double result = 0d;
        for(int i = 0; i < adjustedCloseDouble.length; i++){
            result += adjustedCloseDouble[i];
        }
        result = result/adjustedCloseDouble.length;
        return result;
    }

    private Double[] convertDataAdjustedCloseToDouble(Double[] adjustedCloseDouble, DataModel[] data) {
        for(int i = 0; i < data.length; i++){
            adjustedCloseDouble[i] = data[i].getAdjusted_close();
        }
        return adjustedCloseDouble;
    }


}
