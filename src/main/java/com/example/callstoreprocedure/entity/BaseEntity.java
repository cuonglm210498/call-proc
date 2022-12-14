package com.example.callstoreprocedure.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author CuongLM18
 * @created 07/11/2022 - 11:14 AM
 * @project call-store-procedure
 */
@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreatedDate
    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDate createdDate;

    @CreatedBy
    @Column
    private String createdBy;

    @LastModifiedDate
    @Column(insertable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDate modifiedDate;

    @LastModifiedBy
    @Column(insertable = false)
    private String modifiedBy;
}
