package com.interagile.cliente.escola.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.interagile.cliente.escola.dao.RegistroDAO;

@Repository
public interface IRegistroRepository extends JpaRepository<RegistroDAO, Long>{
	
	@Query("select r from RegistroDAO r where r.cpf =:cpf")
	RegistroDAO findRegistroByCpf(String cpf);
}
