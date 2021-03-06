package com.flexy.domain.service;

import com.flexy.domain.model.Employee;
import com.flexy.domain.store.EmployeeStore;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class EmployeeService {

    private static final String employeeServie = "employee-service";

    @Autowired
    private EmployeeStore employeeStore;

    public List<Employee> getAllEmployees() {
        List<Employee> employeeList = employeeStore.findAllEmployee();
        /*List<Employee> employeeList = (List<Employee>) getOrstoreInCache("employeeInfo", "allEmployee", null);
        if(employeeList == null) {
            employeeList = employeeStore.findAllEmployee();
            getOrstoreInCache("employeeInfo", "allEmployee", employeeList);
        }*/
        return employeeList;
    }

    public Employee getEmployee(int employeeId) {
        return employeeStore.findEmployee(employeeId);
    }


    //TODO: You can create an aspect & move the below.
    /*private Object getOrstoreInCache(String cacheName, String cacheKey, Object object) {
        Config hazelCastConfig = new ClasspathXmlConfig("config/emp-hazelcast.xml");
        hazelCastConfig.setInstanceName(employeeServie );
        hazelCastConfig.setProperty("hazelcast.jmx", "true");

        GroupConfig groupConfig = new GroupConfig();
        groupConfig.setName(employeeServie);
        groupConfig.setPassword(employeeServie);

        hazelCastConfig.setGroupConfig(groupConfig);
        HazelcastInstance hazelcastInstance = Hazelcast.getOrCreateHazelcastInstance(hazelCastConfig);

        IMap<Object, Object> iCacheMap = hazelcastInstance.getMap(cacheName);
        Object cachedObject = iCacheMap.get(cacheKey);
        if(cachedObject != null) {
            log.info("Returning object from cache");
            return cachedObject;
        } else {
            if (object != null) {
                iCacheMap.set(cacheKey, object);
            }
            return null;
        }
    }*/

}
