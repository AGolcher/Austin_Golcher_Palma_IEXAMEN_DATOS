/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ticket.service;

import com.ticket.entity.Concierto;
import java.util.List;

/**
 *
 * @author Golcher
 */
public interface IConciertoService {

    public List<Concierto> getAllConcierto();

    public Concierto getConciertoById(long id);

    public void saveConcierto(Concierto persona);

    public void delete(long id);

}
