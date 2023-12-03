/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cibertec.edu.pe.MediScan.dao;

import cibertec.edu.pe.MediScan.entity.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author artur
 */
public interface ConsultaRepository extends JpaRepository<Consulta, Long>{
    Consulta findByUsuarioEmail(String usuarioEmail);
}
