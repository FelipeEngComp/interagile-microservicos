package com.interagile.cliente.escola.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import lombok.NonNull;

@Entity
@Data
@Table(name = "tb_registro")
public class RegistroDAO implements Serializable{
	
	public RegistroDAO(){
		
	}
	
	private static final long serialVersionUID = 2275332031995342513L;
	
	@JsonInclude(Include.NON_NULL)
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "id_registro")
	private Long id;
	
	@Column(name = "matricula")
	@NonNull
	private String matricula;
	
	@Column(name = "cpf")
	@NonNull
	private String cpf;
	
	@Column(name = "tipo_usuario")
	private int tipoUsuario;

}
