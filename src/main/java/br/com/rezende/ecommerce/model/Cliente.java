package br.com.rezende.ecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Integer id;
	@Column(name = "nome_cliente", length = 50, nullable = false)
	private String nome;
	@Column(name = "email_cliente", length = 100, nullable = false, unique = true)
	private String email;
	@Column(name = "telefone_cliente", length = 20, nullable = false,unique = true)
	private String telefone;
	@Column(name = "cep", length = 10, nullable = false)
	private String cep;
	@Column(name = "logradouro", length = 100, nullable = false)
	private String logradouro;
	@Column(name = "numero", length = 10, nullable = false)
	private String numero;
	@Column(name = "complemento", length = 45, nullable = false)
	private String complemento;
	@Column(name = "bairro", length = 50, nullable = false)
	private String bairro;
	@Column(name = "cidade", length = 45, nullable = false)
	private String cidade;
	@Column(name = "estado", length = 2, nullable = false)
	private String estado;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
