package br.dev.wesraiuga.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.wesraiuga.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
