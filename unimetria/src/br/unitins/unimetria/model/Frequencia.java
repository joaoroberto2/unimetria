package br.unitins.unimetria.model;

import java.util.Date;

import javax.persistence.Entity;
@Entity
public class Frequencia extends DefaultEntity<Frequencia>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8099700626863306419L;
	private Date data;
	private Date hora;
	private Aluno aluno;
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	
}
