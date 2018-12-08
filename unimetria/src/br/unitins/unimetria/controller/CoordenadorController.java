package br.unitins.unimetria.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.unimetria.model.Coordenador;
import br.unitins.unimetria.repository.CoordenadorRepository;

@Named
@ViewScoped
public class CoordenadorController extends Controller<Coordenador> {

	private static final long serialVersionUID = -4270221378549569000L;

	private String pesquisa;

	private List<Coordenador> listaCoordenador = null;

	public CoordenadorController() {
		super(null);
	}

	public void limpar() {
		setEntity(null);
		listaCoordenador = null;
	}

	public void pesquisar() {
		CoordenadorRepository repository = new CoordenadorRepository(getEntityManager());
		listaCoordenador = repository.getCoordenadores(pesquisa);
	}

	public List<Coordenador> getListaCoordenador() {
		if (listaCoordenador == null)
			listaCoordenador = new ArrayList<Coordenador>();
		return listaCoordenador;
	}

	@Override
	public Coordenador getEntity() {
		if (entity == null) {
			entity = new Coordenador();
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
