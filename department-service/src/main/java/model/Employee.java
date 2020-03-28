package model;

import lombok.Data;

import java.util.List;

@Data
public class Employee {

    private Long id;
    private Long organizationId;
    private String name;
    private List<Employee> employees;
}
