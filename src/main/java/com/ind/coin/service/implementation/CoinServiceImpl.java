package com.ind.coin.service.implementation;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ind.coin.dto.CoinDto;
import com.ind.coin.repository.CoinRepo;
import com.ind.coin.service.CoinService;
import com.ind.coin.utils.CoinMappingUtil;

@Service
public class CoinServiceImpl implements CoinService {
	
	@Autowired
	private CoinRepo coinRepo;
	
	public List<CoinDto> getCoins(){
		return coinRepo.findAll().stream().map(coin -> CoinMappingUtil.mapToCoinDto(coin)).collect(Collectors.toList());
	}

	@Override
	public CoinDto addCoin(CoinDto coinDto) {
		// TODO Auto-generated method stub
		return CoinMappingUtil.mapToCoinDto(coinRepo.save(CoinMappingUtil.mapToCoin(coinDto)));
	}

	@Override
	public CoinDto updateCoin(CoinDto coinDto) {
		// TODO Auto-generated method stub
		CoinDto coinDto1 = null;
		if(coinRepo.findById(coinDto.getId()) != null) {
			coinDto1 = CoinMappingUtil.mapToCoinDto(coinRepo.save(CoinMappingUtil.mapToCoin(coinDto)));
		}
		return coinDto1;
	}

	@Override
	public CoinDto deleteCoin(int id) {
		// TODO Auto-generated method stub
		CoinDto coinDto = CoinMappingUtil.mapToCoinDto(coinRepo.findById(id));
		coinRepo.deleteById(id);
		return coinDto;
	}
	
}
