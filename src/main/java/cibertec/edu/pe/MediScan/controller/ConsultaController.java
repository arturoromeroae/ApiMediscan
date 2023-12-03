/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cibertec.edu.pe.MediScan.controller;

import cibertec.edu.pe.MediScan.entity.Consulta;
import cibertec.edu.pe.MediScan.service.ConsultaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author artur
 */
@RestController
@RequestMapping("/api/consulta")
@CrossOrigin(origins = "*")
public class ConsultaController {
    @Autowired
    ConsultaService consultaService;

    @GetMapping("/findAll")
    public List<Consulta> findAll() {
        return consultaService.findAll();
    }

    @GetMapping("/findById/{id}")
    public Consulta findById(@PathVariable Long id) {
        return consultaService.findById(id);
    }

    @GetMapping("/findByEmail/{usuarioEmail}")
    public Consulta findByUsuarioEmail(@PathVariable String usuarioEmail) {
        return consultaService.findByUsuarioEmail(usuarioEmail);
    }

    @PostMapping("/add")
    public Consulta add(@RequestBody Consulta consulta) {
        return consultaService.add(consulta);
    }

    @PutMapping("/update/{id}")
    public Consulta update(@PathVariable Long id, @RequestBody Consulta consulta) {
        return consultaService.update(id, consulta);
    }
    
    @DeleteMapping("/delete/{id}")
    public void update(@PathVariable Long id) {
        consultaService.delete(id);
    }
}
