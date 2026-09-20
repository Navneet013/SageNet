package com.project.SageNet.Service;

import com.project.SageNet.Models.User;
import com.project.SageNet.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@org.springframework.stereotype.Service
public class Implementation implements Service {

    @Autowired
    private Repository repo;

    @Override
    public Object add_user(User user) {
        return repo.save(user);
    }

    @Override
    public Object find_user(String name) {
        User guy = repo.findByName(name);

        if(guy == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return guy;
    }
}
