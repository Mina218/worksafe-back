package api.emscrud;

import api.emscrud.model.Employee;
import api.emscrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WkCrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WkCrudApplication.class, args);
	}
	@Autowired
	private EmployeeRepository EmployeeRepository;

	@Override
	public void run(String...args) throws Exception {
		this.EmployeeRepository.save(new Employee("Ramesh", "Fadatare", "ramesh@gmail.com",15,"24801014 rtyt","info"));
	}
}
