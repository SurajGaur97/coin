package com.ind.coin.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class CoinRequest {
	private int id;
	private String name;
	private int value;
	private String shape;
}
