package com.dio.projeto_gerenciamentopessoas.repository;

import com.dio.projeto_gerenciamentopessoas.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
