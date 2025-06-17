/*package br.com.rezende.ecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_itemPedido")
public class ItemPedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "num_seq")
	private Integer numSeq;
	@Column(name = "valor_unitario")
	private double valorUnitario;
	@Column(name = "quantidade")
	private int quantidade;
	@Column(name = "valor_total")
	private double valorTotal;
	
	@ManyToOne
	@JoinColumn(name = "tbl_pedido_id_pedido")
	private Pedido pedido;
	
	@ManyToOne
	@JoinColumn(name = "tbl_variante_produto_id_variante")
	private Variante variante;
	
	
}*/
