package com.devsuperior.dslearnbds.services.exceptions;

//LANÇADA QUANDO O USUÁRIO NÃO POSSUI UM TOKEN VÁLIDO
public class UnauthorizedException extends RuntimeException{

	
	private static final long serialVersionUID = 1L;
	
	public UnauthorizedException(String msg) {
		super(msg);
	}
}
