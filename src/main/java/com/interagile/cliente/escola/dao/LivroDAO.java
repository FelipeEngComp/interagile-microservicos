package com.interagile.cliente.escola.dao;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "tb_materia")
public class LivroDAO implements Serializable{

	private static final long serialVersionUID = -5661017260069954083L;
	
	public LivroDAO(){
		
	}
	
	@JsonInclude(Include.NON_NULL)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_livro")
	private Long id;
	
	@Column(name = "titulo")
	@NonNull
	private String titulo;
	
	@Column(name = "codigo")
	@NonNull
	private String codigo;
	
	@Column(name = "qnt_disponivel")
	private int qntDisponiveis;
	
	@Column(name = "data_emp")
	@NonNull
	private Date dataEmprestimo;
	
	@Column(name = "dias_emprestimo")
	private int diasDeEmprestimo;
	

}
