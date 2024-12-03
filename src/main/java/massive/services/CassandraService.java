package massive.services;


import lombok.RequiredArgsConstructor;
import massive.entities.Employee;
import massive.entities.EmployeePrimaryKey;
import massive.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CassandraService {
    private final EmployeeRepository employeeRepository;

    public void cas() {
        Employee employee1 = new Employee(
                new EmployeePrimaryKey("soul", "business", "key"),
                "010-2222-1111"
        );
        employeeRepository.save(employee1);

        Employee employee2 = new Employee(
                new EmployeePrimaryKey("soul", "business", "joy"),
                "010-2222-2222"
        );
        employeeRepository.save(employee2);

        final var result = employeeRepository.findByKeyLocationAndKeyDepartment(
                "soul", "business"
        );

        result.stream().map(employee -> String.format("location: %s, department: %s, name: %s, phoneNumber: %s",
                employee.key.getLocation(), employee.key.getDepartment(), employee.key.getName(), employee.phoneNumber)
        ).forEach(System.out::println);



    }
}
