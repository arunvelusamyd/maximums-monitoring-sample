package com.flexy.gateway;

import com.flexy.dto.Employee;
import io.crnk.client.CrnkClient;
import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Slf4j
public class EmployeeGateway {

    @Value("${gateway.employee.baseUrl}")
    private String employeeBaseUrl;

    @Autowired
    private CrnkClient crnkClient;

    public Employee getEmployee(int employeeId) {
        log.info("At Employee Gateway, getting info from employee service");
        ResourceRepository<Employee, Serializable> employeeRepo = crnkClient.getRepositoryForType(Employee.class);
        QuerySpec querySpec = new QuerySpec(Employee.class);
        Employee employee = employeeRepo.findOne(employeeId, querySpec);
        return employee;
    }

    @Bean
    CrnkClient crnkClient() {
        return new CrnkClient(employeeBaseUrl);
    }

}
