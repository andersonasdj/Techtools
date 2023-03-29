package br.com.techgold.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.techgold.dto.ContaDto;

@Entity
@Table(name = "Conta")
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	@Column(name = "statusCaixa", length = 30)
	private String statusCaixa;
	@Column(name = "tipoDeCaixa", length = 30)
	private String tipoDeCaixa;
	@Column(name = "loginBloqueado", length = 30)
	private String loginBloqueado;
	private String statusMfa;
	private String metodoPadraoMfa;
	private String mfaCelular;
	private String criacao;
	private String alteracaoSenha;
	private String ultimoLogin;
	private String smtp;
	private String aliases;
	private String licenca;
	private String qtdItens;
	private String volumeCaixa;
	private String statusArquivoMorto;
	private String volumeArquivoMorto;
	private String marcaRetencao;
	private String statusAutoExpanssaoMorto;
	private String cotaCaixa;

	public Conta() {
	}

	public Conta(Long id, String nome, String email, String statusCaixa, String tipoDeCaixa, String loginBloqueado,
			String statusMfa, String metodoPadraoMfa, String mfaCelular, String criacao, String alteracaoSenha,
			String ultimoLogin, String smtp, String aliases, String licenca, String qtdItens, String volumeCaixa,
			String statusArquivoMorto, String volumeArquivoMorto, String marcaRetencao, String statusAutoExpanssaoMorto,
			String cotaCaixa) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.statusCaixa = statusCaixa;
		this.tipoDeCaixa = tipoDeCaixa;
		this.loginBloqueado = loginBloqueado;
		this.statusMfa = statusMfa;
		this.metodoPadraoMfa = metodoPadraoMfa;
		this.mfaCelular = mfaCelular;
		this.criacao = criacao;
		this.alteracaoSenha = alteracaoSenha;
		this.ultimoLogin = ultimoLogin;
		this.smtp = smtp;
		this.aliases = aliases;
		this.licenca = licenca;
		this.qtdItens = qtdItens;
		this.volumeCaixa = volumeCaixa;
		this.statusArquivoMorto = statusArquivoMorto;
		this.volumeArquivoMorto = volumeArquivoMorto;
		this.marcaRetencao = marcaRetencao;
		this.statusAutoExpanssaoMorto = statusAutoExpanssaoMorto;
		this.cotaCaixa = cotaCaixa;
	}

	public Conta(ContaDto dados) {
		this.nome = dados.nome();
		this.email = dados.email();
		this.statusCaixa = dados.statusCaixa();
		this.tipoDeCaixa = dados.tipoDeCaixa();
		this.loginBloqueado = dados.loginBloqueado();
		this.statusMfa = dados.statusMfa();
		this.metodoPadraoMfa = dados.metodoPadraoMfa();
		this.mfaCelular = dados.mfaCelular();
		this.criacao = dados.criacao();
		this.alteracaoSenha = dados.alteracaoSenha();
		this.ultimoLogin = dados.ultimoLogin();
		this.smtp = dados.smtp();
		this.aliases = dados.aliases();
		this.licenca = dados.licenca();
		this.qtdItens = dados.qtdItens();
		this.volumeCaixa = dados.volumeCaixa();
		this.statusArquivoMorto = dados.statusArquivoMorto();
		this.volumeArquivoMorto = dados.volumeArquivoMorto();
		this.marcaRetencao = dados.marcaRetencao();
		this.statusAutoExpanssaoMorto = dados.statusAutoExpanssaoMorto();
		this.cotaCaixa = dados.cotaCaixa();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatusCaixa() {
		return statusCaixa;
	}

	public void setStatusCaixa(String statusCaixa) {
		this.statusCaixa = statusCaixa;
	}

	public String getTipoDeCaixa() {
		return tipoDeCaixa;
	}

	public void setTipoDeCaixa(String tipoDeCaixa) {
		this.tipoDeCaixa = tipoDeCaixa;
	}

	public String getLoginBloqueado() {
		return loginBloqueado;
	}

	public void setLoginBloqueado(String loginBloqueado) {
		this.loginBloqueado = loginBloqueado;
	}

	public String getStatusMFA() {
		return statusMfa;
	}

	public void setStatusMFA(String statusMfa) {
		this.statusMfa = statusMfa;
	}

	public String getMetodoPadraoMFA() {
		return metodoPadraoMfa;
	}

	public void setMetodoPadraoMFA(String metodoPadraoMfa) {
		this.metodoPadraoMfa = metodoPadraoMfa;
	}

	public String getMfaCelular() {
		return mfaCelular;
	}

	public void setMfaCelular(String mfaCelular) {
		this.mfaCelular = mfaCelular;
	}

	public String getCriacao() {
		return criacao;
	}

	public void setCriacao(String criacao) {
		this.criacao = criacao;
	}

	public String getAlteracaoSenha() {
		return alteracaoSenha;
	}

	public void setAlteracaoSenha(String alteracaoSenha) {
		this.alteracaoSenha = alteracaoSenha;
	}

	public String getUltimoLogin() {
		return ultimoLogin;
	}

	public void setUltimoLogin(String ultimoLogin) {
		this.ultimoLogin = ultimoLogin;
	}

	public String getSmtp() {
		return smtp;
	}

	public void setSmtp(String smtp) {
		this.smtp = smtp;
	}

	public String getAliases() {
		return aliases;
	}

	public void setAliases(String aliases) {
		this.aliases = aliases;
	}

	public String getLicenca() {
		return licenca;
	}

	public void setLicenca(String licenca) {
		this.licenca = licenca;
	}

	public String getQtdItens() {
		return qtdItens;
	}

	public void setQtdItens(String qtdItens) {
		this.qtdItens = qtdItens;
	}

	public String getVolumeCaixa() {
		return volumeCaixa;
	}

	public void setVolumeCaixa(String volumeCaixa) {
		this.volumeCaixa = volumeCaixa;
	}

	public String getStatusArquivoMorto() {
		return statusArquivoMorto;
	}

	public void setStatusArquivoMorto(String statusArquivoMorto) {
		this.statusArquivoMorto = statusArquivoMorto;
	}

	public String getVolumeArquivoMorto() {
		return volumeArquivoMorto;
	}

	public void setVolumeArquivoMorto(String volumeArquivoMorto) {
		this.volumeArquivoMorto = volumeArquivoMorto;
	}

	public String getMarcaRetencao() {
		return marcaRetencao;
	}

	public void setMarcaRetencao(String marcaRetencao) {
		this.marcaRetencao = marcaRetencao;
	}

	public String getStatusAutoExpanssaoMorto() {
		return statusAutoExpanssaoMorto;
	}

	public void setStatusAutoExpanssaoMorto(String statusAutoExpanssaoMorto) {
		this.statusAutoExpanssaoMorto = statusAutoExpanssaoMorto;
	}

	public String getCotaCaixa() {
		return cotaCaixa;
	}

	public void setCotaCaixa(String cotaCaixa) {
		this.cotaCaixa = cotaCaixa;
	}

}
