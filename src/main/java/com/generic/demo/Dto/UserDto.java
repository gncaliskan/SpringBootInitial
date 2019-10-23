package com.generic.demo.Dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.generic.demo.Enum.EnumUserRole;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Gamze on 21.10.2019
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class UserDto extends BaseDto{
    private String username;

    private String email;

    private String password;

    private String token;

    private EnumUserRole userRole;

}
