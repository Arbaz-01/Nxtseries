package com.example.Nxtseries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import jakarta.transaction.Transactional;

@Repository
public interface MyRepo extends JpaRepository<MoviesEntity, Long> {

    @Transactional
    @Modifying
    @Query("UPDATE MoviesEntity m SET m.title = :newTitle WHERE m.title = :oldTitle")
    void updateTitle(@Param("oldTitle") String oldTitle, @Param("newTitle") String newTitle);
}
