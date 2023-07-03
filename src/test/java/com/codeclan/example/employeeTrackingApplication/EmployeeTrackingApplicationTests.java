package com.codeclan.example.employeeTrackingApplication;

import com.codeclan.example.employeeTrackingApplication.models.Employee;
import com.codeclan.example.employeeTrackingApplication.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeTrackingApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployee() {
		Employee alex = new Employee(30, "Alex Ofori", "SD404", "alex.ofori@thiscompany.com");
		Employee angel = new Employee(29, "Angel Gonzalez", "SD405", "angel.gonzalez@thiscompany.com");
		employeeRepository.save(alex);
		employeeRepository.save(angel);
	}

}
