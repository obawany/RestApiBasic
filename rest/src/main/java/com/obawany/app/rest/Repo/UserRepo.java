package com.obawany.app.rest.Repo;

import com.obawany.app.rest.controller.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    
}
