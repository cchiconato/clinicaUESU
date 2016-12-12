package br.com.uesu.dentista;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DentistaRepository extends JpaRepository<DentistaEntity, Long>{

	public DentistaEntity findById(Long id);
}
