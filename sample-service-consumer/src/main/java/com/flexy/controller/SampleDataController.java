package com.flexy.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.flexy.service.AggregatorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Slf4j
public class SampleDataController {

    @Autowired
    private AggregatorService aggregatorService;

    @RequestMapping(path = "/migrationdata", method = RequestMethod.GET)
    public Map<String, Object> migrationdata() throws JsonProcessingException {
        log.info("getting entire data from the system");
        return aggregatorService.getEntireDataToMigrate();
    }

}
