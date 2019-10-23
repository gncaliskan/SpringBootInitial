package com.generic.demo.Controller;

import com.generic.demo.Dto.UserDto;
import com.generic.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Gamze on 21.10.2019
 *
 */

@RestController
@RequestMapping(value="/user")
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping(value = "/get")
    public ResponseEntity<UserDto> getUser(@RequestParam("userId") Long userId) {
        return new ResponseEntity<>(userService.getUser(userId), HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<List<UserDto>> list(){
        return new ResponseEntity<>(userService.list(), HttpStatus.OK);
    }

    @GetMapping("/delete")
    public void delete(@RequestParam("userId") Long userId){
        userService.deleteUser(userId);
    }

    @PostMapping("/save")
    public ResponseEntity<UserDto> save(@RequestBody UserDto userDto){
        return new ResponseEntity<>(userService.saveUser(userDto), HttpStatus.OK);
    }
}
