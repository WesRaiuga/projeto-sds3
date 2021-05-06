package br.dev.wesraiuga.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.wesraiuga.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
