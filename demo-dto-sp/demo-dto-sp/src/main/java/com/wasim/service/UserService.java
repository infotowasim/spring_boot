package com.wasim.service;

import com.wasim.dto.UserLocationDTO;
import com.wasim.model.User;
import com.wasim.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserLocationDTO> getAllUsersLocations(){
            return userRepository
                    .findAll()
                    .stream()
                    .map(this::convertEntityToDTO)
                    .collect(Collectors.toList());

    }

    //convert UserEntity to UserLocationDTO
    private UserLocationDTO convertEntityToDTO(User user){
        UserLocationDTO userLocationDTO=new UserLocationDTO();
        userLocationDTO.setUserId(user.getId());
        userLocationDTO.setEmail(user.getEmail());
        userLocationDTO.setPlace(user.getLocation().getPlace());
        userLocationDTO.setLongitude(user.getLocation().getLongitude());
        userLocationDTO.setLatitude(user.getLocation().getLatitude());
        return userLocationDTO;
    }
}
