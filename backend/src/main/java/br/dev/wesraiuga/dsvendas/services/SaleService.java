package br.dev.wesraiuga.dsvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.dev.wesraiuga.dsvendas.dto.SaleDTO;
import br.dev.wesraiuga.dsvendas.dto.SaleSuccessDTO;
import br.dev.wesraiuga.dsvendas.dto.SaleSumDTO;
import br.dev.wesraiuga.dsvendas.entities.Sale;
import br.dev.wesraiuga.dsvendas.repositories.SaleRepository;
import br.dev.wesraiuga.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		
		Page<Sale> result = repository.findAll(pageable);
		
		return result.map(sale -> new SaleDTO(sale));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller() {
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller() {
		return repository.successGroupedBySeller();
	}

}
