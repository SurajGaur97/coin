package com.ind.coin.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ind.coin.entity.Coin;

public interface CoinRepo extends JpaRepository<Coin, Integer> {
	
	//@Query(value = "select * from coin", nativeQuery = true)
	List<Coin> findAll();
	
	Coin save(Coin coin);
	
	Coin findById(int id);
	
	void deleteById(int id);
}
