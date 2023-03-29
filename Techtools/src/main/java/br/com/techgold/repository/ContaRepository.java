package br.com.techgold.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.techgold.model.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long> {

}
