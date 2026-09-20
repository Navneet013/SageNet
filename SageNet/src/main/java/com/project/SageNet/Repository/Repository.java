package com.project.SageNet.Repository;


import com.project.SageNet.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<User, Integer> {

    User findByName(String name);
}
