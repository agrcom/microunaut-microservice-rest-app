package controller;

import client.EmployeeClient;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import lombok.extern.slf4j.Slf4j;
import model.Department;
import model.Employee;
import repository.DepartmentRepository;

import javax.inject.Inject;
import java.util.List;

@Slf4j
@Controller("/departments")
public class DepartmentController {

    @Inject
    DepartmentRepository repository;
    @Inject
    EmployeeClient employeeClient;


    @Get
    public Employee getById(Long id) {
        log.info("Return Employee with id {}", id);
        return new Employee();
    }

    @Post
    public Department add(@Body Department department) {
        log.info("Department add: {}", department);
        return repository.add(department);
    }

    @Get("/{id}")
    public Department findById(Long id) {
        log.info("Department find: id={}", id);
        return repository.findById(id);
    }

    @Get
    public List<Department> findAll() {
        log.info("Department find");
        return repository.findAll();
    }

}
