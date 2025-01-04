package telran.employees.db;

import telran.employees.*;
import java.util.List;

public interface CompanyRepository {
    List<Employee> getEmployees();
}
