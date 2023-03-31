package br.com.techgold.dto;

public record ContaDto(
		String nomeExibicao, String email, String statusCaixa, String tipoDeCaixa, String loginBloqueado,
		String statusMfa, String metodoPadraoMfa, String mfaCelular, String criacao, String alteracaoSenha,
		String ultimoLogin, String smtp, String aliases, String licenca, String qtdItens, String volumeCaixa,
		String statusArquivoMorto, String volumeArquivoMorto, String marcaRetencao, String statusAutoExpanssaoMorto,
		String cotaCaixa
		) {
}
