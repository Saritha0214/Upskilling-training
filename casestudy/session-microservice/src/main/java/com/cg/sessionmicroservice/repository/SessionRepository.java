package com.cg.sessionmicroservice.repository;

import com.cg.sessionmicroservice.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
