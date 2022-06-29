/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ticket.service;

import com.ticket.entity.Concierto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ticket.repository.ConciertoRepository;

/**
 * 
 * @author Golcher
 */
@Service
public class ConciertoService implements IConciertoService {

    @Autowired
    private ConciertoRepository conciertoRepository;

    @Override
    public List<Concierto> getAllConcierto() {
        return (List<Concierto>) conciertoRepository.findAll();
    }

    @Override
    public Concierto getConciertoById(long id) {
        return conciertoRepository.findById(id).orElse(null);
    }

    @Override
    public void saveConcierto(Concierto persona) {
        conciertoRepository.save(persona);
    }

    @Override
    public void delete(long id) {
        conciertoRepository.deleteById(id);
    }

}
