/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cibertec.edu.pe.MediScan.dao;

import cibertec.edu.pe.MediScan.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author artur
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
}
