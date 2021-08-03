package Ea.Exercises.Exercise15.Domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/*SELECT TOP (1000) [DepartmentID]
      ,[Name]
      ,[GroupName]
      ,[ModifiedDate]
  FROM [AdventureWorks2019].[HumanResources].[Department]*/

@Data
@Entity
@Table(name = "[AdventureWorks2019].[HumanResources].[Department]")
public class Department {

	@Id
	private Integer departmentId;

	private String name;
	private String groupName;
	private LocalDate modifiedDate;
}
