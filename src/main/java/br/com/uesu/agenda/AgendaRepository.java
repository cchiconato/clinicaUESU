package br.com.uesu.agenda;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepository extends JpaRepository<AgendaEntity, Long>{
	
	public AgendaEntity findById(Long id);
}
