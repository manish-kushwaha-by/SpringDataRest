package com.spring.data.rest.springdatarest.Repository;

import com.spring.data.rest.springdatarest.Entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
public interface PlayerRepository extends JpaRepository<Player, Integer>
{


}