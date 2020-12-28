package com.whizit.irl.whizpay.pay;

import java.math.BigDecimal;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PayDto {
	private Integer isConsentPayment = 0;
	private Integer mihpayid;
	private String mode;
	private String status;
	private String unmappedstatus;
	private String key;
	private String txnid;
	private BigDecimal amount = BigDecimal.ZERO;
	private String addedon;
	private String productinfo;
	private String firstname;
	private String lastname;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String country;
	private Integer zipcode;
	private String email;
	private String phone;
	private String udf1;
	private String udf2;
	private String udf3;
	private String udf4;
	private String udf5;
	private String udf6;
	private String udf7;
	private String udf8;
	private String udf9;
	private String udf10;
	private String hash;
	private String field1;
	private String field2;
	private String field3;
	private String field4;
	private String field5;
	private String field6;
	private String field7;
	private String field8;
	private String field9;
	private String giftCardIssued;
	private String PG_TYPE; 
	private String encryptedPaymentId; 
	private String bank_ref_num; 
	private String bankcode; 
	private String error; 
	private String error_Message;
	private String name_on_card;
	private String cardnum;
	private List<Split> amount_split;
	private String payuMoneyId;
	private String net_amount_debit;
}
