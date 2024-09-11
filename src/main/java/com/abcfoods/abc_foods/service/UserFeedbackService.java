package com.abcfoods.abc_foods.service;

import com.abcfoods.abc_foods.dto.UserFeedbackDTO;
import com.abcfoods.abc_foods.entity.UserFeedback;
import com.abcfoods.abc_foods.repo.UserFeedbackRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserFeedbackService {
    @Autowired
    private UserFeedbackRepo userFeedbackRepo;

    @Autowired
    private ModelMapper modelMapper;

    public UserFeedbackDTO saveFeedback(UserFeedbackDTO userFeedbackDTO){
        userFeedbackRepo.save(modelMapper.map(userFeedbackDTO, UserFeedback.class));
        return userFeedbackDTO;
    }
    public List<UserFeedbackDTO> getAllFeedbacks() {
        List<UserFeedback> feedbacksList = userFeedbackRepo.findAll();
        return modelMapper.map(feedbacksList, new TypeToken<List<UserFeedbackDTO>>() {}.getType());
    }

    public UserFeedbackDTO updateFeedback(UserFeedbackDTO userFeedbackDTO){
        userFeedbackRepo.save(modelMapper.map(userFeedbackDTO, UserFeedback.class));
        return userFeedbackDTO;
    }

    public boolean deleteFeedbackById(int Id){
        userFeedbackRepo.deleteFeedbackById(Id);
        return true;
    }
}
