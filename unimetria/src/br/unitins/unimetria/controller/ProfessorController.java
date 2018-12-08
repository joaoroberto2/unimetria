package br.unitins.unimetria.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.unimetria.model.Professor;
import br.unitins.unimetria.repository.ProfessorRepository;

@Named
@ViewScoped
public class ProfessorController extends Controller<Professor> {

	private static final long serialVersionUID = -4270221378549569000L;

	private String pesquisa;

	private List<Professor> listaProfessor = null;

	public ProfessorController() {
		super(null);
	}

	public void limpar() {
		setEntity(null);
		listaProfessor = null;
	}

	public void pesquisar() {
		ProfessorRepository repository = new ProfessorRepository(getEntityManager());
		listaProfessor = repository.getProfessores(pesquisa);
	}

	public List<Professor> getListaProfessor() {
		if (listaProfessor == null)
			listaProfessor = new ArrayList<Professor>();
		return listaProfessor;
	}

	@Override
	public Professor getEntity() {
		if (entity == null) {
			entity = new Professor();
		}
		return entity;
	}

	public String getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}

}
