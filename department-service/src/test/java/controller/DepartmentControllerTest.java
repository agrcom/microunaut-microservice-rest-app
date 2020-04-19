package controller;

import com.google.common.collect.Lists;
import io.micronaut.test.annotation.MicronautTest;
import model.Department;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest
class DepartmentControllerTest {

    @Inject
    DepartmentController controller;

    @Test
    public void add_department() {
        Department department = Department.builder()
                .name("name")
                .organizationId(123456L)
                .employees(Lists.newArrayList())
                .build();

        Department result = controller.add(department);

        Assertions.assertNotNull(result.getId());
    }

    @Test
    public void empty(){
        Assertions.assertTrue(true);
    }


}