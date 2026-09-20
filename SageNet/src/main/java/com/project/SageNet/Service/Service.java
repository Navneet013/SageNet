package com.project.SageNet.Service;

import com.project.SageNet.Models.User;

public interface Service {
    Object add_user(User user);

    Object find_user(String name);
}
