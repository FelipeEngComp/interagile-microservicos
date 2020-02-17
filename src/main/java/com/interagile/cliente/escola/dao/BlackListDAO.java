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
@Table(name = "tb_black_list")
public class BlackListDAO implements Serializable{
	
	private static final long serialVersionUID = -8130223220693787884L;
	
	@JsonInclude(Include.NON_NULL)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_blck_list")
	private Long id;
	
	@Column(name = "matricula")
	@NonNull
	private String matricula;
	
	@Column(name = "nome")
	@NonNull
	private String nome;
	
	@Column(name = "motivo")
	private String motivo;
	
	@Column(name = "dias_block")
	private int diasBloqueado;
	
	@Column(name = "qnt_blocks")
	private int qntBloqueios;
	
}
