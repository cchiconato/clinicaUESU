package br.com.uesu.paciete;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.uesu.utils.BaseEntity;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_paciente")
@AttributeOverride(name = "id", column = @Column(name = "pk_id"))
public class PacienteEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = 201602010251L;
	
	public PacienteEntity() {
	}
	

	@NotNull
	@Size(min = 4, max = 120)
	@Column(name = "nome", length = 120, nullable = false)
	private String nome;

	@Column(name = "cpf", length = 120, nullable = true)
	private String cpf;	

	@Column(name = "rg", length = 120, nullable = true)
	private String rg;

	@Size(min = 0, max = 50)
	@Column(name = "telefone", length = 80, nullable = true)
	private String telefone;
	
	@Size(min = 0, max = 50)
	@Column(name = "celular", length = 80, nullable = true)
	private String celular;
	
	@Size(min = 0, max = 80)
	@Column(name = "email", length = 80, nullable = true)
	private String email;
	
	
	@Column(name = "data_nascimento", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	@Size(min = 0, max = 50)
	@Column(name = "sexo", length = 80, nullable = true)
	private String sexo;
	
	@Column(name = "cidade", length = 120, nullable = true)
	private String cidade;
	
	@Column(name = "estado", length = 120, nullable = true)
	private String estado;
	
	@Column(name = "rua", length = 120, nullable = true)
	private String rua;

	@Column(name = "bairro", length = 120, nullable = true)
	private String bairro;

	@Column(name = "numero", length = 120, nullable = true)
	private String numero;

	@Column(name = "cep", length = 50, nullable = true)
	private String cep;

	@Column(name = "complemento", length = 120, nullable = true)
	private String complemento;
	
	@Column(name = "estado_civil", length = 120, nullable = true)
	private String estadoCivil;

	@Column(name = "profissao", length = 120, nullable = true)
	private String profissao;
	
	@Column(name = "orgaoEmissor", length = 120, nullable = true)
	private String orgaoEmissor;
	
	@Column(name = "renda", length = 120, nullable = true)
	private double renda;

	
}
