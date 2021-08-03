package Ea.Exercises.Exercise15.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import Ea.Exercises.Exercise15.Domain.Culture;

@Repository
@Transactional
public interface CultureRepository extends JpaRepository<Culture, String> {

}
