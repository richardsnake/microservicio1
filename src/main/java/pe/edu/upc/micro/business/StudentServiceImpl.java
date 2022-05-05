package pe.edu.upc.micro.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.micro.beans.Student;
import pe.edu.upc.micro.data.StudentRepository;

@Service
public class StudentServiceImpl implements  StudentService{

	
	@Autowired
	private StudentRepository repository;
	
	@Override
	public List<Student> getAllStudents() {
		return repository.findAll();
	}

	@Override
	public void saveStudent(Student student) {
		repository.save(student);
		
	}

	@Override
	public void updateStudent(Student student) {
		if(repository.existsById(student.getCode()))
		{
			repository.save(student);
		}
		
	}

	@Override
	public Long deleteStudent(Student student) {
		repository.delete(student);
		return student.getCode();
	}

	@Override
	public Student searchStudent(Long id) {
		// TODO Auto-generated method stub
		return repository.getById(id);
	}

}
