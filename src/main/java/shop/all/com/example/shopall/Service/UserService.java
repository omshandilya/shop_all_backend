package shop.all.com.example.shopall.Service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shop.all.com.example.shopall.Repository.UserRepository;
import shop.all.com.example.shopall.dto.UserDTO;
import shop.all.com.example.shopall.entities.UserEntity;
import shop.all.com.example.shopall.entities.OrderEntity;

import java.util.List;


@Service
public class UserService {

    private final UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;

    public UserDTO convertToUserDTO(UserEntity userEntity) {
        // Basic mapping for UserEntity to UserDTO
        UserDTO userDTO = modelMapper.map(userEntity, UserDTO.class);
        return userDTO;
    }

    public UserEntity convertToUserEntity(UserDTO userDTO) {
        // Basic mapping for UserDTO to UserEntity
        UserEntity userEntity = modelMapper.map(userDTO, UserEntity.class);
        return userEntity;
    }

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity registerUser(UserEntity user) {
        return userRepository.save(user);
    }

    public UserEntity getUserById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found with ID: " + userId));
    }

    public UserEntity updateUser(Long userId, UserEntity updatedUser) {
        UserEntity user = getUserById(userId);
        user.setName(updatedUser.getName());
        user.setEmail(updatedUser.getEmail());
        user.setContact(updatedUser.getContact());
        user.setAddress(updatedUser.getAddress());
        user.setPassword(updatedUser.getPassword());
        return userRepository.save(user);
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    public Long getUserIdByEmailAndPassword(String email, String password) {
        UserEntity user = userRepository.findByEmailAndPassword(email, password);
        return (user != null) ? user.getUserId() : null;
    }


}

