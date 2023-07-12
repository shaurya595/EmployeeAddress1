package com.geekster.Employee.Method;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id ;

    private String firstname;

    private String lastName;

    private Address address;
}
