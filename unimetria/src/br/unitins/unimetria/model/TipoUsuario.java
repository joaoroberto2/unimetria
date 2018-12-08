package br.unitins.unimetria.model;

import java.util.Arrays;
import java.util.List;

public enum TipoUsuario {
	
	ADMINSTRADOR(0, "Adminstrador", 
			Arrays.asList("cadastrocoordenador.xhtml", "cadastroaluno.xhtml", "cadastroprofessor.xhtml","cadastrousuario.xhtml")),
	USUARIO_COMUM(1, "Professor", Arrays.asList("cadastroaluno.xtml"));
	
	
	private int id;
	private String label;
	private List<String> pages;
	
	private TipoUsuario(int id, String label, List<String> pages) {
		this.id = id;
		this.label = label;
		this.pages = pages;
		
	}
	
	public int getId() {
		return id;
	}
	
	public String getLabel() {
		return label;
	}

	public List<String> getPages() {
		return pages;
	}
	
}
