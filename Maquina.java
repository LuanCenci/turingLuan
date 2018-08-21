package turing;

import java.util.ArrayList;

public class Maquina {
	
	private ArrayList<Transicao> delta;
	private String fita;
	private String inicioFita;
	private String finalFita;
	private String estadoInicial;
	private String estadoFinal;
	
	public ArrayList<Transicao> getDelta() {
		return delta;
	}
	public void setDelta(ArrayList<Transicao> delta) {
		this.delta = delta;
	}
	public String getFita() {
		return fita;
	}
	public void setFita(String fita) {
		this.fita = fita;
	}
	public String getInicioFita() {
		return inicioFita;
	}
	public void setInicioFita(String inicioFita) {
		this.inicioFita = inicioFita;
	}
	public String getFinalFita() {
		return finalFita;
	}
	public void setFinalFita(String finalFita) {
		this.finalFita = finalFita;
	}
	public String getEstadoInicial() {
		return estadoInicial;
	}
	public void setEstadoInicial(String estadoInicial) {
		this.estadoInicial = estadoInicial;
	}
	public String getEstadoFinal() {
		return estadoFinal;
	}
	public void setEstadoFinal(String estadoFinal) {
		this.estadoFinal = estadoFinal;
	}
	
}
