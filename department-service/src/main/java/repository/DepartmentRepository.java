package repository;

import com.google.common.collect.Lists;
import model.Department;

import javax.inject.Singleton;
import java.util.List;
import java.util.Optional;

@Singleton
public class DepartmentRepository {

    private List<Department> repository = Lists.newArrayList();

    public Department add(Department department) {
        department.setId((long) (repository.size() + 1));
        repository.add(department);
        return department;
    }

    public Department findById(Long id) {
        Optional<Department> department = repository.stream().filter(d -> d.getId().equals(id)).findFirst();

        return department.orElseGet(Department::new);
    }

    public List<Department> findAll() {
        return repository;
    }
}
