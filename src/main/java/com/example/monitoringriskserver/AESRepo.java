package com.example.monitoringriskserver;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AESRepo extends JpaRepository<AES, Integer> {
    AES findById(int id);


}


