package br.unitins.unimetria.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.unimetria.model.Aluno;
import br.unitins.unimetria.repository.AlunoRepository;

@Named
@ViewScoped
public class AlunoController extends Controller<Aluno> {

	private static final long serialVersionUID = -4270221378549569000L;

	private String pesquisa;

	private List<Aluno> listaAluno = null;

	public AlunoController() {
		super(null);
	}

	public void limpar() {
		setEntity(null);
		listaAluno = null;
	}

	public void pesquisar() {
		AlunoRepository repository = new AlunoRepository(getEntityManager());
		listaAluno = repository.getAlunos(pesquisa);
	}

	public List<Aluno> getListaAluno() {
		if (listaAluno == null)
			listaAluno = new ArrayList<Aluno>();
		return listaAluno;
	}

	@Override
	public Aluno getEntity() {
		if (entity == null) {
			entity = new Aluno();
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
