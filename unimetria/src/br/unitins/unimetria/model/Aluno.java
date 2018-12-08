package br.unitins.unimetria.model;

import javax.persistence.Entity;

@Entity
public class Aluno extends Pessoa {

	private static final long serialVersionUID = -1379440588015917768L;
	
	
	private long matricula;
	private byte[] biometria;
	
	
	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	public byte[] getBiometria() {
		return biometria;
	}
	public void setBiometria(byte[] biometria) {
		this.biometria = biometria;
	}
	
	
	
	

}
