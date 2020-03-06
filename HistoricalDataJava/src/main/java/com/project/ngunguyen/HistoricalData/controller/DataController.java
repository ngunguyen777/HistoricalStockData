package com.project.ngunguyen.HistoricalData.controller;

import com.project.ngunguyen.HistoricalData.model.DataModel;
import com.project.ngunguyen.HistoricalData.model.RequestModel;
import com.project.ngunguyen.HistoricalData.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DataController {
    private DataService service;

    @Autowired
    public DataController(DataService service){
        this.service = service;
    }

    @RequestMapping(value = "/requestData", method = RequestMethod.POST)
    public ResponseEntity<?> requestData(@RequestBody RequestModel requestModel){
        DataModel[] data = service.requestDataFromEOD(requestModel);
        ResponseEntity<?> response = new ResponseEntity<>(data, HttpStatus.OK);
        return response;
    }
}
