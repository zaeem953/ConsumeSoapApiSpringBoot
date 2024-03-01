package org.example.soapclient.clinet;

import org.example.soapclient.consumeApi.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class SoapClinet {

	@Autowired
	private Jaxb2Marshaller marshaller;

	private WebServiceTemplate template;


	public AddEmployeeResponse addEmployee(AddEmployeeRequest request) {
		template = new WebServiceTemplate(marshaller);
		AddEmployeeResponse ServiceStatusResponce = (AddEmployeeResponse) template.marshalSendAndReceive("http://localhost:8080/allService",
				request);
		return ServiceStatusResponce;
	}

	public DeleteEmployeeResponse deleteEmployee(DeleteEmployeeRequest request) {
		template = new WebServiceTemplate(marshaller);
		DeleteEmployeeResponse deleteEmployeeResponse = (DeleteEmployeeResponse) template.marshalSendAndReceive("http://localhost:8080/allService",
				request);
		return deleteEmployeeResponse;
	}

	public UpdateEmployeeResponse updateEmployee(UpdateEmployeeRequest request) {
		template = new WebServiceTemplate(marshaller);
		UpdateEmployeeResponse updateEmployeeResponse = (UpdateEmployeeResponse) template.marshalSendAndReceive("http://localhost:8080/allService",
				request);
		return updateEmployeeResponse;
	}

	public GetEmployeeByIdResponse getByIdEmployee(GetEmployeeByIdRequest request) {
		template = new WebServiceTemplate(marshaller);
		GetEmployeeByIdResponse getEmployeeByIdResponse = (GetEmployeeByIdResponse) template.marshalSendAndReceive("http://localhost:8080/allService",
				request);
		return getEmployeeByIdResponse;
	}
}
