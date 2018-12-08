package br.unitins.unimetria.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.unimetria.model.Frequencia;
import br.unitins.unimetria.repository.FrequenciaRepository;

@Named
@ViewScoped
public class FrequenciaController extends Controller<Frequencia> {

	private static final long serialVersionUID = -4270221378549569000L;

	private String pesquisa;

	private List<Frequencia> listaFrequencia = null;

	public FrequenciaController() {
		super(null);
	}

	public void limpar() {
		setEntity(null);
		listaFrequencia = null;
	}

	public void pesquisar() {
		FrequenciaRepository repository = new FrequenciaRepository(getEntityManager());
		listaFrequencia = repository.getFrenquecias(pesquisa);
	}

	public List<Frequencia> getListaFrequencia() {
		if (listaFrequencia == null)
			listaFrequencia = new ArrayList<Frequencia>();
		return listaFrequencia;
	}

	@Override
	public Frequencia getEntity() {
		if (entity == null) {
			entity = new Frequencia();
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
