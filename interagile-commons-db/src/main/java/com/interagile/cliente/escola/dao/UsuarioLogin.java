package com.interagile.cliente.escola.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import lombok.NonNull;

@Entity
@Data
@Table(name="tb_usuario_login")
public class UsuarioLogin implements Serializable{
	
	private static final long serialVersionUID = -3939672072897853265L;
	
	@JsonInclude(Include.NON_NULL)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_login")
	private Long id;
	
	@Column(name = "matricula")
	@NonNull
	private String matricula;
	
	@Column(name = "cpf")
	@NonNull
	private String cpf;
	
	@Column(name = "senha")
	private int senha;

}
