package br.com.agendaNova.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Negocio {
	public void processa(HttpServletRequest request, HttpServletResponse response);
}
