package br.com.uesu.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

	public UserEntity findByEmail(String email);

	public List<UserEntity> findByEmailOrName(String email, String name);
	
	public UserEntity findById(Long id);

}
