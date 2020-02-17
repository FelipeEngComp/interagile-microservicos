package com.interagile.cliente.escola.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import lombok.NonNull;

@Entity
@Data
@Table(name ="tb_curso")
public class CursoDAO implements Serializable{
	
	private static final long serialVersionUID = -5203036138487050071L;

	public CursoDAO() {
	}
	
	@JsonInclude(Include.NON_NULL)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_curso")
	private long id;
	
	@Column(name = "codigo")
	@NonNull
	private String codigo;
	
	@Column(name = "nome")
	@NonNull
	private String nome;
	
	@Column(name = "semestres")
	private int semestres;
	
	@Column(name = "id_usr")
	@OneToMany(fetch = FetchType.LAZY)
	private List<UsuarioDAO> usuarios;
	
	@JoinColumn(name = "id_materia")
	@ManyToMany(fetch = FetchType.LAZY)
	private List<MateriaDAO> materias;
	
}
