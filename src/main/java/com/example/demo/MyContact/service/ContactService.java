package com.example.demo.MyContact.service;

import com.example.demo.MyContact.entity.Contact;

import java.util.List;
import java.util.Optional;

public interface ContactService {
    Iterable<Contact> findAll();

    List<Contact> search(String term);

    Optional<Contact> findUserById(Integer id);

    void save(Contact contact);

    void delete(Integer id);
}
