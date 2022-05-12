package co.za.flash.sqlsanitizer.repository;

import co.za.flash.sqlsanitizer.entities.Words;
import org.springframework.data.jpa.repository.JpaRepository;


public interface WordsRepository extends JpaRepository<Words, Integer> {


}
