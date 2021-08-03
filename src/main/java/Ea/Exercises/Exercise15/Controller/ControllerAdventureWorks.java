package Ea.Exercises.Exercise15.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Ea.Exercises.Exercise15.Domain.Culture;
import Ea.Exercises.Exercise15.Domain.Department;
import Ea.Exercises.Exercise15.Service.ServiceAdventureWorks;

@RestController
public class ControllerAdventureWorks {

	@Autowired
	private ServiceAdventureWorks serviceAdventureWorks;

	@GetMapping("/departments")
	public List<Department> getAllDepartments() {
		return serviceAdventureWorks.getAllDepartments();
	}

	@GetMapping("/cultures")
	public ResponseEntity<?> getAllCultures() {
		return new ResponseEntity<List<Culture>>(serviceAdventureWorks.getAllCultures(), HttpStatus.OK);
	}
}
