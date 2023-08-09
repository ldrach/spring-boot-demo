package com.springdemo.springdemo.repositories;

import com.springdemo.springdemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
