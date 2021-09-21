package com.newton.aaw.hr.domain.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import com.newton.aaw.hr.api.EmployeeDto;
import com.newton.aaw.hr.domain.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
	@Id
	private String id;
	private Gender gender;
	private String firstName;
	private String lastName;
	private String area;
	private String position;
	private Float monthlySalary;
	private Float hourSalary;
	private LocalDate dateOfBirth;
	private LocalDate starDate;
	private LocalDate endDate;
	private LocalDateTime createdAt;
	private LocalDateTime modifiedAt;

	
	public Employee(EmployeeDto e) {
		this.id = e.getId();
		this.area = e.getArea();
		this.gender = e.getGender();
		this.firstName = e.getFirstName();
		this.lastName = e.getLastName();
		this.position = e.getPosition();
		this.monthlySalary = e.getMonthlySalary();
		this.hourSalary = e.getHourSalary();
		this.dateOfBirth = e.getDateOfBirth();
		this.starDate = e.getStarDate();
		this.endDate = e.getEndDate();
		this.createdAt = e.getCreatedAt();
		this.modifiedAt = e.getModifiedAt();
	}	
}