package com.boljshoj.Logistic.repo;

import com.boljshoj.Logistic.domain.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepo extends JpaRepository<Model, Long> {
}
