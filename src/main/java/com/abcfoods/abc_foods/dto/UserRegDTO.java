package com.abcfoods.abc_foods.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserRegDTO {
    private int Id;
    private String Name;
    private String Email;
    private String Mobile;
    private String Password;
}
