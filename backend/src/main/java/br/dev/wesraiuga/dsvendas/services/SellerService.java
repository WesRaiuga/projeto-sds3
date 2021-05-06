package br.dev.wesraiuga.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.wesraiuga.dsvendas.dto.SellerDTO;
import br.dev.wesraiuga.dsvendas.entities.Seller;
import br.dev.wesraiuga.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll() {
		List<Seller> result = repository.findAll();
		
		return result.stream()
				.map(seller -> new SellerDTO(seller))
				.collect(Collectors.toList());
	}

}
