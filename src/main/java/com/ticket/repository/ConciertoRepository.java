/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ticket.repository;

import com.ticket.entity.Concierto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Golcher
 */
@Repository
public interface ConciertoRepository extends CrudRepository<Concierto, Long> {

}
