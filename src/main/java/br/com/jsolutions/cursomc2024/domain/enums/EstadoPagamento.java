package br.com.jsolutions.cursomc2024.domain.enums;

public enum EstadoPagamento {

	PENDENTE(1, "Pendente"), QUITADO(2, "Quitado"), CANCELADO(3, "Cancelado");

	private int cod;
	private String descricao;

	private EstadoPagamento(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public static EstadoPagamento toEnum(Integer cod) {

		if (cod == null) {
			return null;
		}
		for (EstadoPagamento tc : EstadoPagamento.values()) {
			if (cod.equals(tc.getCod())) {
				return tc;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
