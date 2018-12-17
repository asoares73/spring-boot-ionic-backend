package com.asoares.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.asoares.cursomc.domain.Pedido;

public interface EmailService {

		void sendOrderConfirmationEmail(Pedido obj);

		void sendEmail(SimpleMailMessage msg);
}
