
package api.emscrud.service;
import java.util.List;

import api.emscrud.exception.ResourceNotFoundException;
import api.emscrud.model.Employee;

public interface EmployeeService {
    List<Employee> FindAll() ;


    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long employeeId) throws ResourceNotFoundException;

    Employee createEmployee(Employee fromClient);

    Object updateEmployee(Employee result);

    void deleteEmployee(Employee employee);
}
