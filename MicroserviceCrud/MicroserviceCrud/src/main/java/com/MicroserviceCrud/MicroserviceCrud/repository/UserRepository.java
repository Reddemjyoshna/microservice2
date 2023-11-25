package com.MicroserviceCrud.MicroserviceCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MicroserviceCrud.MicroserviceCrud.entity.User;

public interface UserRepository extends JpaRepository<User, Long>   {

}
