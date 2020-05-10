package com.interagile.cliente.escola.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import lombok.NonNull;

@Entity
@Data
@Table(name ="tb_materia")
public class MateriaDAO implements Serializable{
		
	
	private static final long serialVersionUID = 6264468496220393607L;

	public MateriaDAO(){
		
	}
	
	@JsonInclude(Include.NON_NULL)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_materia")
	private Long id;
	
	@Column(name = "nome")
	@NonNull
	private String nome;
	
	@Column(name = "horas")
	private int horas;
	
	@Column(name = "codigo")
	@NonNull
	private String codigo;
	
	@Column(name = "frequencia")
	private int frequencia;
	
	@Column(name = "cursada")
	private boolean cursada;
	
	@Column(name = "id_curso")
	@ManyToMany(fetch = FetchType.LAZY)
	@JsonIgnore
	private List<CursoDAO> cursoDao;
	
	@Column(name = "id_usr")
	@ManyToMany(fetch = FetchType.LAZY)
	@JsonIgnore
	private List<UsuarioDAO> usuarios;
	
}
