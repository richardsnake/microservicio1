package pe.edu.upc.micro.business;

import java.util.List;

import pe.edu.upc.micro.beans.Student;

public interface StudentService {

	public List<Student> getAllStudents();
	
	public void saveStudent(Student student);
	
	public void updateStudent(Student student);
	
	public Long deleteStudent(Student student);
	
	public Student searchStudent(Long id);
	
}
