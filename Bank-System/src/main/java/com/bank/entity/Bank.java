package com.bank.entity;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Bank {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private String branch;

    private String address;
    
    
}
