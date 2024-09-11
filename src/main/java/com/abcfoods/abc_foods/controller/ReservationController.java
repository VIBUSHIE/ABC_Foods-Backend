package com.abcfoods.abc_foods.controller;

import com.abcfoods.abc_foods.dto.ReservationDTO;
import com.abcfoods.abc_foods.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/reservation")
@CrossOrigin
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @GetMapping("/getReservations")
    public List<ReservationDTO> getReservations(){
        return reservationService.getAllReservations();
    }

    @PostMapping("/saveReservation")
    public ReservationDTO saveReservation(@RequestBody ReservationDTO reservationDTO){
        return reservationService.saveReservation(reservationDTO);
    }

    @PutMapping("/updateReservation")
    public ReservationDTO updateReservation(@RequestBody ReservationDTO reservationDTO){
        return reservationService.updateReservation(reservationDTO);
    }

    @DeleteMapping("/deleteReservation/{Id}")
    public boolean deleteResById(@PathVariable int Id){
        return reservationService.deleteResById(Id);
    }
}

