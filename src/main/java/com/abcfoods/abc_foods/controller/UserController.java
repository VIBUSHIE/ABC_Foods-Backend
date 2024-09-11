package com.abcfoods.abc_foods.controller;

import com.abcfoods.abc_foods.dto.UserRegDTO;
import com.abcfoods.abc_foods.service.UserRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserRegService userRegService;

    @GetMapping("/getusers")
    public List<UserRegDTO> getUser(){
            return userRegService.getAllUsers();
    }

    @PostMapping("/saveuser")
    public UserRegDTO saveUser(@RequestBody UserRegDTO userRegDTO){
        return userRegService.saveUser(userRegDTO);
    }

    @PutMapping("/updateuser")
    public UserRegDTO updateUser(@RequestBody UserRegDTO userRegDTO){
        return userRegService.updateUser(userRegDTO);
    }

    @DeleteMapping("/deleteuser")
    public boolean deleteUser(@RequestBody UserRegDTO userRegDTO){
        return userRegService.deleteUser(userRegDTO);
    }

    @GetMapping("/getUserById/{userId}")
    public UserRegDTO getUserById(@PathVariable String userId){
        return userRegService.getUserById(userId);
    }

    @GetMapping("/getEmailAndPassword/{email}/{password}")
    public UserRegDTO getEmailAndPassword(@PathVariable String email,@PathVariable String password){
        return userRegService.getEmailAndPassword(email, password);
    }

    @DeleteMapping("/deleteuser/{userId}")
    public boolean deleteUsrById(@PathVariable int userId){
        return userRegService.deleteUsrById(userId);
    }

}
