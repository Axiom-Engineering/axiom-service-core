package com.axiom.core.repository;

import com.axiom.core.domain.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<BaseEntity, Long> {
    // Data access for users
}
