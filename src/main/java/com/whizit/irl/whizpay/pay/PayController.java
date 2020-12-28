package com.whizit.irl.whizpay.pay;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pay")
public class PayController {

	private final PayService payService;

	public PayController(PayService service) {
		this.payService = service;
	}
	
	@GetMapping("/test")
    public String test(){
        return "Hello World";
    }

	@PostMapping("/success/")
	public String create(@RequestBody PayDto payDto){
		return payService.success(payDto);
	}

	@PostMapping("/fail/")
	public String fail(@RequestBody PayDto payDto){
		return payService.fail(payDto);
	}

	@PostMapping("/cancel/")
	public String cancel(@RequestBody PayDto payDto){
		return payService.cancel(payDto);
	}
}
