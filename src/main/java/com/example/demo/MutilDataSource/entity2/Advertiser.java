package com.example.demo.MutilDataSource.entity2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Advertisers")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Advertiser implements Serializable {
    private static final long serialVersionUID = 746237126088051312L;

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long id;

    @Column(name = "Name", length = 255, nullable = false)
    private String name;
}
