package br.com.uesu.paciete;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PacineteRepository extends JpaRepository<PacienteEntity, Long> {
	

	public PacienteEntity findById(Long id);
}
