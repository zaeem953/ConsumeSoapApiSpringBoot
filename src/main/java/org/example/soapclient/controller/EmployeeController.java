package org.example.soapclient.controller;

import org.example.soapclient.client.SoapClient;
import org.example.soapclient.consumeApi.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private SoapClient client;

    @PostMapping("/addEmployee")
    public AddEmployeeResponse addEmployee(@RequestBody AddEmployeeRequest request){
        System.out.println(request.toString());
        return client.addEmployee(request);
    }

    @PostMapping("/updateEmployee")
    public UpdateEmployeeResponse updateEmployee(@RequestBody UpdateEmployeeRequest request){
        System.out.println(request.toString());
        return client.updateEmployee(request);
    }

    @PostMapping("/deleteEmployee")
    public DeleteEmployeeResponse deleteEmployee(@RequestBody DeleteEmployeeRequest request){
        System.out.println(request.toString());
        return client.deleteEmployee(request);
    }

    @PostMapping("/getEmployeeById")
    public GetEmployeeByIdResponse getEmployeeById(@RequestBody GetEmployeeByIdRequest request){
        System.out.println(request.toString());
        return client.getByIdEmployee(request);
    }
}
