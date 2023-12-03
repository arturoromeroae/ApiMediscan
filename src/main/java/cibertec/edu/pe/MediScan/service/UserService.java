/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cibertec.edu.pe.MediScan.service;

import cibertec.edu.pe.MediScan.entity.User;
import java.util.List;

/**
 *
 * @author artur
 */
public interface UserService {
    public List<User> findAll();
    public User findById(Long id);
    public User findByEmail(String email);
    public User add(User user);
    public User update(Long id, User user);
    public void delete(Long id);
}
