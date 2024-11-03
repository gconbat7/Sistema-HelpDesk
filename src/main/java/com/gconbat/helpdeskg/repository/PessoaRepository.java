package com.gconbat.helpdeskg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gconbat.helpdeskg.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

    

}
