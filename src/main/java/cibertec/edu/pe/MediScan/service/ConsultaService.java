/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cibertec.edu.pe.MediScan.service;

import cibertec.edu.pe.MediScan.entity.Consulta;
import java.util.List;

/**
 *
 * @author artur
 */
public interface ConsultaService {
    public List<Consulta> findAll();
    public Consulta findById(Long id);
    public Consulta findByUsuarioEmail(String usuarioEmail);
    public Consulta add(Consulta consulta);
    public Consulta update(Long id, Consulta consulta);
    public void delete(Long id);
}
