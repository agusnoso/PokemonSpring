package com.SpringDocker.SpringDocker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringDocker.SpringDocker.Model.Card;

public interface CardRepository extends JpaRepository<Card, Long> {

}
