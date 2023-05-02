package api.emscrud.controller;

import api.emscrud.exception.ResourceNotFoundException;
import api.emscrud.model.Employee;
import api.emscrud.service.EmployeeService;
import api.emscrud.service.EmployeeServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("api/v1")

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

 private EmployeeService employeeService;

    public EmployeeController(@Autowired EmployeeServiceimpl employeeService) {
        this.employeeService = employeeService;
    }

    //get employees
    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        List<Employee> employees= employeeService.FindAll();
        return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
    }

    //get employee by id
    @GetMapping("/find/{id}")
    ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId) throws ResourceNotFoundException {
        Employee result = employeeService.getEmployeeById(employeeId);
        return ResponseEntity.ok().body(result);
    }

    //save employee
    @PostMapping("/add")
    Employee createEmployee(@RequestBody Employee fromClient)
    {
        return employeeService.createEmployee(fromClient);
    }

    //update employee by id
    @PutMapping("/update/{id}")
    ResponseEntity<Employee> updateEmployee(@PathVariable(value="id") Long employeeId, @RequestBody Employee employeeDetails) throws ResourceNotFoundException {
        Employee result = employeeService.getEmployeeById(employeeId);

        result.setName(employeeDetails.getName());
        result.setUsername(employeeDetails.getUsername());
        result.setAddress(employeeDetails.getAddress());
        result.setAge(employeeDetails.getAge());
        result.setEmail(employeeDetails.getEmail());
        result.setDepartement(employeeDetails.getDepartement());
        return ResponseEntity.ok((Employee) employeeService.updateEmployee(result));
    }

    //delete employee by id
    @DeleteMapping("delete/{id}")
    Map<String, Boolean> deleteEmployee(@PathVariable(value="id")Long employeeId) throws ResourceNotFoundException {
        Employee employee = employeeService.getEmployeeById(employeeId);
        employeeService.deleteEmployee(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Deleted", Boolean.TRUE);
        return response;
    }

}
