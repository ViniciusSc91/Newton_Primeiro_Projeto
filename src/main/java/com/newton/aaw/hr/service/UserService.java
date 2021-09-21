package com.newton.aaw.hr.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;
import com.newton.aaw.hr.domain.entity.User;
import com.newton.aaw.hr.exception.NotFoundException;

@Service
public class UserService {

	
	// armazenar em memória os objetos
	private Map<String, User> users = new HashMap<String, User>();

	// C - CRUD
	public User create(User u) {
		
		u.setCreatedAt(LocalDateTime.now());
		u.setModifiedAt(LocalDateTime.now());

		users.put("", u);
		
		return u;
	}
	
	// u - CRUD
	public User update(String id, User u) {

		// recuperar para validar se existe
		var existing = get(id);

		// update
		existing.setName(u.getName());
		existing.setPassword(u.getPassword());
		existing.setEmail(u.getEmail());
		existing.setMobile(u.getMobile());
		
		existing.setModifiedAt(LocalDateTime.now());

		return existing;
	}
	
	// R - CRUD
	public User get(String id) {
		
		var user = users.get(id);
		
		if (user == null) {
			throw new NotFoundException("User with ID " + id + " not found");
		} 
		
		return user;
	}
	
	// R - CRUD
	public List<User> getAll() {
		return new ArrayList<>(users.values());
	}
	
	// D - CRUD
	public void delete(String id) {

		// recuperar para validar se existe
		get(id);
		
		users.remove(id);
	}
	
}