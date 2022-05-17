package com.ind.coin.service;

import java.util.List;

import com.ind.coin.dto.CoinDto;
import com.ind.coin.entity.Coin;

public interface CoinService {

	List<CoinDto> getCoins();
	
	CoinDto addCoin(CoinDto coinDto);
	
	CoinDto updateCoin(CoinDto coinDto);
	
	CoinDto deleteCoin(int id);
}
