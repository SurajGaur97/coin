package com.ind.coin.utils;

import com.ind.coin.dto.CoinDto;
import com.ind.coin.entity.Coin;
import com.ind.coin.request.CoinRequest;
import com.ind.coin.response.CoinResponse;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CoinMappingUtil {
	
	public CoinDto mapToCoinDto(CoinRequest coinRequest) {
		return CoinDto.builder().id(coinRequest.getId()).name(coinRequest.getName()).shape(coinRequest.getShape())
				.value(coinRequest.getValue()).build();
	}
	
	public CoinResponse mapToCoinResponce(CoinDto coinDto) {
		return CoinResponse.builder().id(coinDto.getId()).name(coinDto.getName()).shape(coinDto.getShape())
				.value(coinDto.getValue()).build();
	}
	
	public Coin mapToCoin(CoinDto coinDto) {
		return Coin.builder().id(coinDto.getId()).name(coinDto.getName()).shape(coinDto.getShape())
				.value(coinDto.getValue()).build();
	}
	
	public CoinDto mapToCoinDto(Coin coin) {
		return CoinDto.builder().id(coin.getId()).name(coin.getName()).shape(coin.getShape())
				.value(coin.getValue()).build();
	}
}
