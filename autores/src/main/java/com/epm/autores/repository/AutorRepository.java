package com.epm.autores.repository;

import com.epm.autores.model.AutorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<AutorModel, Long> {
}
