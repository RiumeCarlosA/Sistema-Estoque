package br.com.varejonline.riume.model.enums;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;

@Getter
public enum Movimentos {

	ENTRADA(0, "ENTRADA"), SAIDA(1, "SAIDA"), SALDO_INICIAL(2, "SALDO_INICIAL"), AJUSTE_ENTRADA(3, "AJUSTE_ENTRADA"), AJUSTE_SAIDA(4, "AJUSTE_SAIDA");
	
	private Integer codigo;
	
	private String descricao;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "GMT")
	private Instant dataMovimentacao = Instant.now();
	
	private Integer qtd;
	
	private String motivo;
	
	private Movimentos(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
}
