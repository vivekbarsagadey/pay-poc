package com.whizit.irl.whizpay.pay;

import org.springframework.stereotype.Service;

@Service
public class PayService {

	public String success(PayDto payDto) {
		
		return payDto.getStatus();
	}

	public String fail(PayDto payDto) {
		return payDto.getStatus();
	}

	public String cancel(PayDto payDto) {
		return payDto.getStatus();
	}

}
