package com.doan.application.service;


import com.doan.application.model.dto.UserDTO;
import com.doan.application.model.request.ChangePasswordRequest;
import com.doan.application.model.request.CreateUserRequest;
import com.doan.application.model.request.UpdateProfileRequest;
import com.doan.application.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<UserDTO> getListUsers();

    Page<User> adminListUserPages(String fullName, String phone, String email, Integer page);

    User createUser(CreateUserRequest createUserRequest);

    void changePassword(User user, ChangePasswordRequest changePasswordRequest);

    User updateProfile(User user, UpdateProfileRequest updateProfileRequest);
}
