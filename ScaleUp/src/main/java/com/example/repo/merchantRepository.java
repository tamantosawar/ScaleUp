package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.merchant;

@Repository
public interface merchantRepository extends JpaRepository<merchant,Long>{
	public Boolean existsByEmail(String email);
	@Query("Select x from merchant x where x.email='email' AND x.password='password'")
	public Boolean CheckEmailPass(String email,String password);
	
	
	public Boolean existsByEmailAndPassword(String email,String password);
	@Query("select y from merchant y where y.email='email' AND y.password='password'")
	public Boolean CheckEmailPassword(String email,String password);
}
