package com.generic.demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Gamze on 21.10.2019
 *
 */

@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_by", nullable = false)
    private Long createdBy;
    @Column(name = "updated_by")
    private Long updatedBy;
    @Column(name = "created_date", nullable = false)
    private Date createdDate;
    @Column(name = "updated_date")
    private Date updatedDate;
    private boolean active;

    public BaseEntity() {
        this.active = Boolean.TRUE;
        this.createdDate = Calendar.getInstance().getTime();
        this.createdBy = 0L;
    }

}
