package br.com.uesu.dentista;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.uesu.utils.BaseEntity;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_dentista")
@AttributeOverride(name = "id", column = @Column(name = "pk_id"))
public class DentistaEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = 1L;
	
	@NotNull
	@Size(min = 4, max = 120)
	@Column(name = "nome", length = 120, nullable = false)
	private String nome;
	
	@Size(min = 0, max = 50)
	@Column(name = "telefone", length = 80, nullable = true)
	private String telefone;
	
	@Size(min = 0, max = 50)
	@Column(name = "celular", length = 80, nullable = true)
	private String celular;
	
	@Size(min = 0, max = 80)
	@Column(name = "email", length = 80, nullable = true)
	private String email;
	
	@Size(min = 0, max = 80)
	@Column(name = "cro", length = 80, nullable = true)
	private String cro;
	
	@Size(min = 0, max = 80)
	@Column(name = "especialidade", length = 80, nullable = true)
	private String especialidade;
	
}