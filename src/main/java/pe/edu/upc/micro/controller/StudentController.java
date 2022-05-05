package pe.edu.upc.micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.micro.beans.Student;
import pe.edu.upc.micro.business.StudentService;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
	
	@Autowired
	private StudentService service;
	

	@GetMapping(value = "/students")
	public ResponseEntity<Object> getStudents()
	{
		return new ResponseEntity<>(service.getAllStudents(), HttpStatus.OK);
	}
	
	@PostMapping(value = "/students")
	public ResponseEntity<Object> postStudent(@RequestBody Student student){
		service.saveStudent(student);
		return new ResponseEntity<>("ok", HttpStatus.OK);
		
	}
	
}
