package telran.employees.db;

import telran.employees.*;
import java.util.List;

public interface CompanyRepository {
    List<Employee> getEmployees();

    void insertEmployee(Employee empl);

    Employee findEmployee(long id);

    Employee removeEmployee(long id);

    List<Employee> getEmployeesByDepartment(String department);

    List<String> findDepartments();
}
