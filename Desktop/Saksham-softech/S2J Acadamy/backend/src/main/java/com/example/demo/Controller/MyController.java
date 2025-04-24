package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ContactService;
import com.example.demo.Entity.Entity;
import com.example.demo.Service.ContactService;


@RestController
@RequestMapping("/contact")
public class MyController {
	@Autowired
	private ContactService ContactService;
	 @CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/save")
	public ResponseEntity<Entity> saveEmployee(@RequestBody ContactService contact){
		ContactService  emp=ContactService.savecontact(contact);
		return ResponseEntity.ok().body(emp) ;
	}
	
	@GetMapping("/get")
	public List<Employee> getEmployee()
	{
		return this.employeeService.getEmployee();
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return this.employeeService.saveEmployee(employee);
	}
	
	
	
	@DeleteMapping("/{mob}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long mob) {
		try {
			 this.employeeService.deleteEmployee(mob);
			 return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}








