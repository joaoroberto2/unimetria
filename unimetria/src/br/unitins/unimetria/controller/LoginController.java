package br.unitins.unimetria.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.unitins.unimetria.application.Util;
import br.unitins.unimetria.factory.JPAFactory;
import br.unitins.unimetria.model.Usuario;
import br.unitins.unimetria.repository.UsuarioRepository;
import br.unitins.unimetria.validation.Validation;

@Named
@RequestScoped
public class LoginController extends DefaultController {
	private static final long serialVersionUID = -2482810615603773001L;

	private Usuario usuario;
	
	public String entrar() {
		UsuarioRepository repository = 
				new UsuarioRepository(JPAFactory.getEntityManager());
		Usuario usuarioValidado = repository
				.getUsuario(getUsuario().getEmail(), getUsuario().getSenha());
		
		if (usuarioValidado == null) {
			Util.addErroMessage("Usuario ou Senha invalido.");
			return null;
		}
		// setando o usuario na sessao
		setUsuarioLogado(usuarioValidado);
		
		return "cadastroaluno.xhtml";
	}

	public Usuario getUsuario() {
		if (usuario == null)
			usuario = new Usuario();
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	

}
