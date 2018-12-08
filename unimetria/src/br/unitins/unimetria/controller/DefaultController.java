package br.unitins.unimetria.controller;

import java.io.Serializable;

import br.unitins.unimetria.application.Session;
import br.unitins.unimetria.application.Util;
import br.unitins.unimetria.model.Usuario;
import br.unitins.unimetria.validation.Validation;

public class DefaultController implements Serializable {

	private static final long serialVersionUID = 1007297527954376818L;
	
	private static final String userKey = "usuarioLogado";
	
	public Usuario getUsuarioLogado() {
		return (Usuario) Session.getInstance().getAttribute(userKey);
	}

	public void setUsuarioLogado(Usuario usuario) {
		Session.getInstance().setAttribute(userKey, usuario);
	}
	
	public void encerrarSessao() {
		Session.getInstance().invalidateSession();
		Util.redirect("login.xhtml");
	}
	
}
