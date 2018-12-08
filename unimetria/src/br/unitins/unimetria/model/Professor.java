package br.unitins.unimetria.model;

import javax.persistence.Entity;

@Entity
public class Professor extends Pessoa {
	
	private static final long serialVersionUID = -4888942052695164136L;
	
	private String matricula;
	private String biometria;
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getBiometria() {
		return biometria;
	}
	
	public void setBiometria(String biometria) {
		this.biometria = biometria;
	}
	
}
