package com.victorjr.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.victorjr.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}