package com.example.Nxtseries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface myrepo extends JpaRepository<moviesentity,Long>{
    
}
