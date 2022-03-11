package com.example.demo.controller;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "aadhar_card" , uniqueConstraints = {
        @UniqueConstraint(columnNames = {"aadharId"}),
        @UniqueConstraint(columnNames = { "aadharNo" })
})
@Setter@Builder@AllArgsConstructor
@NoArgsConstructor@Getter
public class Aadhar {

    @Id
    private int aadharId;
    private String userName ;
    private String aadharNo ;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pan_no", referencedColumnName = "panId")
    @JsonManagedReference
    private PAN panCard ;
}
