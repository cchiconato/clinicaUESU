package br.com.uesu.agenda;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import br.com.uesu.dentista.DentistaEntity;
import br.com.uesu.paciete.PacienteEntity;
import br.com.uesu.utils.BaseEntity;

@Entity
@Table(name = "tb_agenda")
@AttributeOverride(name = "id", column = @Column(name = "pk_id"))
	public class AgendaEntity extends BaseEntity<Long>{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "horario", nullable = false)
	@Temporal(TemporalType.TIME)
	private Date horario;
	
	@Column(name = "data", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date data;
	
	@ManyToOne
	@JoinColumn(name ="paciente_fk" , nullable= false)
	private PacienteEntity paciente;
	
	@ManyToOne
	@JoinColumn(name = "dentista_fk", nullable= false)
	private DentistaEntity dentista;
	
	@Size(min = 0, max = 180)
	@Column(name = "motivo", length = 180, nullable = false)
	private String motivo;

	
}
