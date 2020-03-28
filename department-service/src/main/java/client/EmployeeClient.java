package client;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import model.Employee;

import java.util.List;

@Client(id = "employee-service", path = "/employees")
public interface EmployeeClient {

    @Get("/department/{departmentId}")
    List<Employee> findByDepartment(Long departmentId);

}
