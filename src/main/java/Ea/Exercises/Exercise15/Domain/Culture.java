package Ea.Exercises.Exercise15.Domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/*SELECT TOP (1000) [CultureID]
      ,[Name]
      ,[ModifiedDate]
  FROM [AdventureWorks2019].[Production].[Culture]*/

@Data
@Entity
@Table(name = "[AdventureWorks2019].[Production].[Culture]")
public class Culture {
	@Id
	private String cultureId;

	private String name;
	private LocalDate modifiedDate;
}
