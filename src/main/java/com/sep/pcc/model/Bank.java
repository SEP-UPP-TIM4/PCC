package com.sep.pcc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Bank {

    @Id
    private String id;

    @Setter
    private String name;

    @Setter
    private String url;
}
