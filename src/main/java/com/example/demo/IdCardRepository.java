package com.example.demo;

import com.example.demo.model.IdCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IdCardRepository extends JpaRepository<IdCard, Long> {

    @Query("select ic from IdCard ic " +
            "left join fetch ic.human as h " +
            "left join fetch h.pets")
    IdCard find(Long id);
}
