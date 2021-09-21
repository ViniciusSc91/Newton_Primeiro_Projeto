package com.newton.aaw.hr.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import com.newton.aaw.hr.domain.entity.Employee;
import com.newton.aaw.hr.domain.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeDto {
	
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

	
	public EmployeeDto(Employee employee) {
		this.id = employee.getId();
		this.gender = employee.getGender();
		this.firstName = employee.getFirstName();
		this.lastName = employee.getLastName();
		this.position = employee.getPosition();
		this.monthlySalary = employee.getMonthlySalary();
		this.hourSalary = employee.getHourSalary();
		this.dateOfBirth = employee.getDateOfBirth();
		this.starDate = employee.getStarDate();
		this.endDate = employee.getEndDate();
		this.createdAt = employee.getCreatedAt();
		this.modifiedAt = employee.getModifiedAt();
	}	
}
