package Ea.Exercises.Exercise15.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Ea.Exercises.Exercise15.Domain.Culture;
import Ea.Exercises.Exercise15.Domain.Department;
import Ea.Exercises.Exercise15.Repository.CultureRepository;
import Ea.Exercises.Exercise15.Repository.DepartmentRepository;

@Service
@Transactional
public class ServiceAdventureWorks {

	@Autowired
	private CultureRepository cultureRepository;

	@Autowired
	private DepartmentRepository departmentRepository;

	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}

	public List<Culture> getAllCultures() {
		return cultureRepository.findAll();
	}
}
