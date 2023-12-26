package com.example.springmvc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface modayRepo extends JpaRepository<monday,String> {
    
}
