package com.example.demo.MyContact.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity     /* @Entity xác định lớp hiện tại là một entity.*/
@Table(name = "contact") /*@Table xác định tên bảng CSDL.*/
public class Contact {
    @Id     /*@Id xác định thuộc tính hiện tại là ID của bảng CSDL.*/
    @GeneratedValue(strategy = GenerationType.AUTO) /*@GeneratedValue xác định cơ chế sinh khóa chính, ở đây là AUTO_INCREMENT.*/
    @Column(name = "id", nullable = false)  /*@Column xác định thuộc tính hiện tại là một cột của bảng CSDL.*/
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;
}
