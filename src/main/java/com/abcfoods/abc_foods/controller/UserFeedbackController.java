package com.abcfoods.abc_foods.controller;

import com.abcfoods.abc_foods.dto.UserFeedbackDTO;
import com.abcfoods.abc_foods.service.UserFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/feedback")
@CrossOrigin
public class UserFeedbackController {
    @Autowired
    private UserFeedbackService userFeedbackService;

    @GetMapping("/getFeedbacks")
    public List<UserFeedbackDTO> getFeedbacks(){
        return userFeedbackService.getAllFeedbacks();
    }

    @PostMapping("/saveFeedback")
    public UserFeedbackDTO saveFeedbacks(@RequestBody UserFeedbackDTO userFeedbackDTO){
        return userFeedbackService.saveFeedback(userFeedbackDTO);
    }

    @PutMapping("/updateFeedback")
    public UserFeedbackDTO updateFeedback(@RequestBody UserFeedbackDTO userFeedbackDTO){
        return userFeedbackService.updateFeedback(userFeedbackDTO);
    }

    @DeleteMapping("/deleteFeedback/{Id}")
    public boolean deleteFeedbackById(@PathVariable int Id){
        return userFeedbackService.deleteFeedbackById(Id);
    }
}
