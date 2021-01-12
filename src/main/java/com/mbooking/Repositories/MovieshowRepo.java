package com.mbooking.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbooking.Entities.Movieshow;
public interface MovieshowRepo extends JpaRepository<Movieshow, Integer > {

}
