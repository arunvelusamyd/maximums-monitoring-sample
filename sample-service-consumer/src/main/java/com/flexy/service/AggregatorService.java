package com.flexy.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.flexy.dto.Employee;
import com.flexy.dto.Product;
import com.flexy.gateway.EmployeeGateway;
import com.flexy.gateway.ProductGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AggregatorService {

    @Autowired
    private EmployeeGateway employeeGateway;

    @Autowired
    private ProductGateway productGateway;

    public Map<String,Object> getEntireDataToMigrate() throws JsonProcessingException {
        Employee employee = employeeGateway.getEmployee(1);
        Map<String, List<Product>> productData = productGateway.getProducts();

        Map<String, Object> aggregatedData = new HashMap<>();
        aggregatedData.put("employees", employee);
        aggregatedData.put("products", productData);

        return aggregatedData;
    }

}
