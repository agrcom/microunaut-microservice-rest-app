import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                description = "Micronaut sample app Department service",
                title = "Department Module",
                version = "1.0"
        )
)
public class DepartmentApplication {
    public static void main(String[] args) {
        Micronaut.run(DepartmentApplication.class);
    }
}
