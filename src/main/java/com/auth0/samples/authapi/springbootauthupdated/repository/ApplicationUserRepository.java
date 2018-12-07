package com.auth0.samples.authapi.springbootauthupdated.repository;

import com.auth0.samples.authapi.springbootauthupdated.user.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}
