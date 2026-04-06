package com.Dhruv.BillingSystem.services;


import com.Dhruv.BillingSystem.DTO.user.UserDTO;
import com.Dhruv.BillingSystem.entities.User;
import com.Dhruv.BillingSystem.repos.UserRepository;
import com.Dhruv.BillingSystem.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CommonUtils commonUtils;

    public User createUser(UserDTO userDTO) {
        User user = new User();
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(user.getLastName());
        user.setRole(userDTO.getRole());
        user.setPhoneNumber(user.getPhoneNumber());
        user.setEmail(user.getEmail());
        user.setPassword(user.getPassword());
        user.setTimeOfCreation(commonUtils.getCurrentDateAndTime());
        user.setTimeOfUpdate(commonUtils.getCurrentDateAndTime());
        user.setDeleted(false);

        userRepository.save(user);
        return user;
    }

    public User getUserById(Long userId) {
        Optional<User> opt = userRepository.findById(userId);
        return opt.orElse(null);
    }

    public User updateUser(Long userId, UserDTO userDTO) {
        User user = getUserById(userId);
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(user.getLastName());
        user.setRole(userDTO.getRole());
        user.setPhoneNumber(user.getPhoneNumber());
        user.setEmail(user.getEmail());
        user.setPassword(user.getPassword());
        user.setTimeOfCreation(commonUtils.getCurrentDateAndTime());
        user.setTimeOfUpdate(commonUtils.getCurrentDateAndTime());
        user.setDeleted(false);

        userRepository.save(user);
        return user;
    }

    public String deleteUserByUserId(Long userId) {
        User user = getUserById(userId);
        user.setTimeOfUpdate(commonUtils.getCurrentDateAndTime());
        user.setDeleted(true);
        userRepository.save(user);

        return "Deleted Successfully";
    }
}
