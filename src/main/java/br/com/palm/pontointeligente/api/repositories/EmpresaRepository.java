package br.com.palm.pontointeligente.api.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.com.palm.pontointeligente.api.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	
	@Transactional(readOnly = true) //O readonly melhora o desempenho, pois como é apenas consulta, não precisa criar uma transação e bloquear o banco.
	Empresa findByCnpj(String cnpj);

}