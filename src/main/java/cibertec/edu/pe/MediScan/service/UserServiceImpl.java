/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cibertec.edu.pe.MediScan.service;

import cibertec.edu.pe.MediScan.dao.UserRepository;
import cibertec.edu.pe.MediScan.entity.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author artur
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    
    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User add(User customer) {
        return userRepository.save(customer);
    }

    @Override
    public User update(Long id, User user) {
        User userDB = userRepository.findById(id).get();
        userDB.setName(user.getName());
        userDB.setEmail(user.getEmail());
        userDB.setPhone(user.getPhone());
        return userRepository.save(userDB);
    }

    @Override
    public void delete(Long id) {
        User userDB = userRepository.findById(id).get();
        userRepository.delete(userDB);
    }
}
