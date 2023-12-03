/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cibertec.edu.pe.MediScan.service;

import cibertec.edu.pe.MediScan.dao.ConsultaRepository;
import cibertec.edu.pe.MediScan.entity.Consulta;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author artur
 */
@Service
public class ConsultaServiceImp implements ConsultaService{
    @Autowired
    private ConsultaRepository consultaRepository;

    @Override
    public List<Consulta> findAll() {
        return (List<Consulta>) consultaRepository.findAll();
    }

    @Override
    public Consulta findById(Long id) {
        return consultaRepository.findById(id).orElse(null);
    }

    @Override
    public Consulta findByUsuarioEmail(String usuarioEmail) {
        return consultaRepository.findByUsuarioEmail(usuarioEmail);
    }

    @Override
    public Consulta add(Consulta consulta) {
        return consultaRepository.save(consulta);
    }

    @Override
    public Consulta update(Long id, Consulta consulta) {
        Consulta consultaDB = consultaRepository.findById(id).get();
        consultaDB.setResultadoConsulta(consulta.getResultadoConsulta());
        consultaDB.setUsuarioEmail(consulta.getUsuarioEmail());
        return consultaRepository.save(consultaDB);
    }

    @Override
    public void delete(Long id) {
        Consulta consultaDB = consultaRepository.findById(id).get();
        consultaRepository.delete(consultaDB);
    }
    
}
