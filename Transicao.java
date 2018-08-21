package turing;

public class Transicao {
	
	private String direcao;
	private String lido;
	private String escrito;
	private String vem;
	private String para;
	
	public Transicao() {
		this.direcao = "";
		this.lido = "";
		this.escrito = "";
		this.vem = "";
		this.para = "";
	}

	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

	public String getLido() {
		return lido;
	}

	public void setLido(String lido) {
		this.lido = lido;
	}

	public String getEscrito() {
		return escrito;
	}

	public void setEscrito(String escrito) {
		this.escrito = escrito;
	}

	public String getVem() {
		return vem;
	}

	public void setVem(String vem) {
		this.vem = vem;
	}

	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}
}
