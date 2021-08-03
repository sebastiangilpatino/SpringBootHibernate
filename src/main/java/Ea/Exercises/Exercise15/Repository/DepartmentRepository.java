package Ea.Exercises.Exercise15.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Ea.Exercises.Exercise15.Domain.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
