package com.abcfoods.abc_foods.service;

import com.abcfoods.abc_foods.dto.PaymentDetailsDTO;
import com.abcfoods.abc_foods.entity.PaymentDetails;
import com.abcfoods.abc_foods.repo.PaymentDetailsRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PaymentDetailsService {
    @Autowired
    private PaymentDetailsRepo paymentDetailsRepo;

    @Autowired
    private ModelMapper modelMapper;

    public PaymentDetailsDTO savePayment(PaymentDetailsDTO paymentDetailsDTO){
        paymentDetailsRepo.save(modelMapper.map(paymentDetailsDTO, PaymentDetails.class));
        return paymentDetailsDTO;
    }

    public List<PaymentDetailsDTO> getAllPayments(){
        List<PaymentDetails> paymentsList=paymentDetailsRepo.findAll();
        return modelMapper.map(paymentsList, new TypeToken<List<PaymentDetailsDTO>>(){}.getType());
    }

    public PaymentDetailsDTO updatePayment(PaymentDetailsDTO paymentDetailsDTO){
        paymentDetailsRepo.save(modelMapper.map(paymentDetailsDTO, PaymentDetails.class));
        return paymentDetailsDTO;
    }

    public boolean deletePaymentById(int Id){
        paymentDetailsRepo.deletePaymentById(Id);
        return true;
    }
}
