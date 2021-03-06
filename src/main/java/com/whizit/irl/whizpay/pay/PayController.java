package com.whizit.irl.whizpay.pay;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pay")
public class PayController {

	private final PayService payService;

	public PayController(PayService service) {
		this.payService = service;
	}

	@GetMapping("/test")
	public String test() {
		return "Hello World";
	}

	@RequestMapping(value = "/success/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public String success(PayDto payDto) {
		return payService.success(payDto);
	}

	@RequestMapping(value = "/fail/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public String fail(PayDto payDto) {
		return payService.fail(payDto);
	}

	@RequestMapping(value = "/cancel/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public String cancel(@RequestBody PayDto payDto) {
		return payService.cancel(payDto);
	}
}
