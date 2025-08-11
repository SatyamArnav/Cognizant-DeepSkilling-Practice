package com.cognizant.orm_learn.repository;

import com.cognizant.orm_learn.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    // match countries containing 'ou' (case-insensitive)
    @Query("select c from Country c where lower(c.name) like lower(concat('%', :namePart, '%'))")
    List<Country> searchByPartialName(@Param("namePart") String namePart);

    // match countries containing 'ou', sorted ascending
    @Query("select c from Country c where lower(c.name) like lower(concat('%', :namePart, '%')) order by c.name asc")
    List<Country> searchByPartialNameSorted(@Param("namePart") String namePart);

    // match countries starting with a letter (case-insensitive)
    @Query("select c from Country c where lower(c.name) like lower(concat(:initial, '%'))")
    List<Country> searchByStartingLetter(@Param("initial") String initial);
}