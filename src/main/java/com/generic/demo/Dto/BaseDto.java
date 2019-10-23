package com.generic.demo.Dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Gamze on 21.10.2019
 *
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
@AllArgsConstructor
class BaseDto {

    private Long id;

    private Boolean isActive;

    private Date createdDate;

    private Long createdBy;

    private Date updatedDate;

    private Long updatedBy;

    BaseDto() {
        this.isActive = Boolean.TRUE;
        this.createdDate = Calendar.getInstance().getTime();
        this.createdBy = 0L;
    }
}
