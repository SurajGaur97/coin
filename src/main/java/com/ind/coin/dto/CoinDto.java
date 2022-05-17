package com.ind.coin.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class CoinDto {
	private int id;
	private String name;
	private int value;
	private String shape;
}
