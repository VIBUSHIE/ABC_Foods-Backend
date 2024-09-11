package com.abcfoods.abc_foods.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReservationDTO {
    private int Id;
    private String Name;
    private String Phone;
    private String Persons_count;
    private String Date;
    private String Time;
    private String Massege;
}




