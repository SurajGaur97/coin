package com.ind.coin.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class CoinResponse {
	private int id;
	private String name;
	private int value;
	private String shape;
}