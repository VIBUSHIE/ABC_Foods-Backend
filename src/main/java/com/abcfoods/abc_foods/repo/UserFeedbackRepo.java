package com.abcfoods.abc_foods.repo;

import com.abcfoods.abc_foods.entity.UserFeedback;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserFeedbackRepo extends JpaRepository<UserFeedback,Integer>{

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM user_feedback WHERE id = ?1", nativeQuery = true)
    void deleteFeedbackById (int Id);

}
