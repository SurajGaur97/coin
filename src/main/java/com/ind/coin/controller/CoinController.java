package com.ind.coin.controller;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ind.coin.request.CoinRequest;
import com.ind.coin.response.CoinResponse;
import com.ind.coin.service.CoinService;
import com.ind.coin.utils.CoinMappingUtil;

@RestController
@RequestMapping("/ind/coin")
public class CoinController {
	
	@Autowired
	private CoinService coinService;
	
	@GetMapping("/getCoin")
	public List<CoinResponse> getCoins() {
		return coinService.getCoins().stream().map(coinDto -> CoinMappingUtil.mapToCoinResponce(coinDto))
		.collect(Collectors.toList());
	}
	
	@PostMapping("/inserCoin")
	public CoinResponse addCoin(@RequestBody CoinRequest coinRequest) {
		return CoinMappingUtil.mapToCoinResponce(coinService.addCoin(CoinMappingUtil.mapToCoinDto(coinRequest)));
	}
	
	@DeleteMapping("/removeCoin/{id}")
	public CoinResponse deleteCoin(@PathVariable int id) {
		return CoinMappingUtil.mapToCoinResponce(coinService.deleteCoin(id));
	}
	
	@PutMapping("/updateCoin")
	public CoinResponse updateCoin(@RequestBody CoinRequest coinRequest) {
		return CoinMappingUtil.mapToCoinResponce(coinService.updateCoin(CoinMappingUtil.mapToCoinDto(coinRequest)));
	}
}
