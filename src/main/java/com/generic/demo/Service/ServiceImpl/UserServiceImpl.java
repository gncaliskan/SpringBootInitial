package com.generic.demo.Service.ServiceImpl;

import com.generic.demo.Dto.UserDto;
import com.generic.demo.Entity.User;
import com.generic.demo.Repository.UserRepository;
import com.generic.demo.Service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

/**
 * @author Gamze on 21.10.2019
 *
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public UserDto getUser(Long id) {
        Optional<User> user =userRepository.findById(id);
        return user.map(user1 -> modelMapper.map(user1, UserDto.class)).orElse(null);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }


    @Override
    public UserDto saveUser(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
       return modelMapper.map(userRepository.save(user), UserDto.class);
    }

    @Override
    public List<UserDto> list() {
        Type listType = new TypeToken<List<UserDto>>(){}.getType();
        return modelMapper.map(userRepository.findAll(),listType);
    }


}
