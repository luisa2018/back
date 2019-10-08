package com.miproyecto.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miproyecto.demo.dao.UserRepository;
import com.miproyecto.demo.model.User;

@Service
public class UserServiceImple implements UserService {

	@Autowired
	protected UserRepository userRepository;

	@Override
	public User save(User user) {
		return this.userRepository.save(user);
	}
}
