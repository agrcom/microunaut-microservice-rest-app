package controller;

import client.EmployeeClient;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import lombok.extern.slf4j.Slf4j;
import model.Department;
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


//    @Get("/employees/{id}")
//    public Employee getById(Long id) {
//        log.info("Return Employee with id {}", id);
//        return new Employee();
//    }

    @Post(consumes = MediaType.APPLICATION_JSON)
    public Department add(@Body Department department) {
        log.info("Department add: {}", department);
        return repository.add(department);
    }

    @Post(consumes = MediaType.APPLICATION_JSON)
    public Department test() {
        Department department = Department.builder().organizationId(123L).name("Daniel").build();
        log.info("Department add: {}", department);
        return repository.add(department);
    }

    @Get(value = "/{id}", produces = MediaType.APPLICATION_JSON)
    public HttpResponse<Department> findById(Long id) {
        log.info("Department find: id={}", id);
        try {
            return HttpResponse.ok(repository.findById(id));
        } catch (Exception e) {
            return HttpResponse.notFound();
        }
    }

    @Get
    public List<Department> findAll() {
        log.info("Department find");
        return repository.findAll();
    }

}
