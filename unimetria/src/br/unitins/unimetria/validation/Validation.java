package br.unitins.unimetria.validation;

import br.unitins.unimetria.application.ValidationException;

public interface Validation<T> {
	public void validate(T t) throws ValidationException;
}