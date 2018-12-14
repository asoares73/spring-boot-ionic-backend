package com.asoares.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.asoares.cursomc.domain.Categoria;
import com.asoares.cursomc.domain.Cidade;
import com.asoares.cursomc.domain.Cliente;
import com.asoares.cursomc.domain.Endereco;
import com.asoares.cursomc.domain.Estado;
import com.asoares.cursomc.domain.ItemPedido;
import com.asoares.cursomc.domain.Pagamento;
import com.asoares.cursomc.domain.PagamentoComBoleto;
import com.asoares.cursomc.domain.PagamentoComCartao;
import com.asoares.cursomc.domain.Pedido;
import com.asoares.cursomc.domain.Produto;
import com.asoares.cursomc.domain.enums.EstadoPagamento;
import com.asoares.cursomc.domain.enums.TipoCliente;
import com.asoares.cursomc.repositories.CategoriaRepository;
import com.asoares.cursomc.repositories.CidadeRepository;
import com.asoares.cursomc.repositories.ClienteRepository;
import com.asoares.cursomc.repositories.EnderecoRepository;
import com.asoares.cursomc.repositories.EstadoRepository;
import com.asoares.cursomc.repositories.ItemPedidoRepository;
import com.asoares.cursomc.repositories.PagamentoRepository;
import com.asoares.cursomc.repositories.PedidoRepository;
import com.asoares.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{


	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
