package com.example.demo.MyContact.repository;

import com.example.demo.MyContact.entity.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
/*@Repository xác định interface hiện tại là một repository.
Về bản chất, chúng ta đang định nghĩa một bean có tên là contactRepository.*/

/*<Contact, Integer> chỉ ra kiểu dữ liệu của entity và entity ID.*/
public interface ContactRepository extends CrudRepository<Contact, Integer> {
    /*findByNameContaining(String term) tương ứng với query SELECT * FROM contact WHERE name LIKE %term%.*/
    List<Contact> findByNameContaining(String term);
}
