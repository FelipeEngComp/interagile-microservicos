package com.interagile.cliente.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.interagile.cliente.escola.dao.UsuarioDAO;

@Repository
public interface IUsuarioRepository extends JpaRepository<UsuarioDAO, Long>{

}
