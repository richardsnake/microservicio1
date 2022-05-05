package pe.edu.upc.micro.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.micro.beans.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
