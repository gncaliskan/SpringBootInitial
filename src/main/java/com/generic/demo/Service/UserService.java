package com.generic.demo.Service;

import com.generic.demo.Dto.UserDto;

import java.util.List;

/**
 * @author Gamze on 21.10.2019
 *
 */

public interface UserService {

    UserDto getUser(Long id);

    UserDto saveUser(UserDto userDto);

    void deleteUser(Long id);

    List<UserDto> list();
}
