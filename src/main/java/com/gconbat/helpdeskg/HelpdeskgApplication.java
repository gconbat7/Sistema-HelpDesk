package com.gconbat.helpdeskg;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gconbat.helpdeskg.domain.Chamado;
import com.gconbat.helpdeskg.domain.Cliente;
import com.gconbat.helpdeskg.domain.Tecnico;
import com.gconbat.helpdeskg.domain.enums.Perfil;
import com.gconbat.helpdeskg.domain.enums.Prioridade;
import com.gconbat.helpdeskg.domain.enums.Status;
import com.gconbat.helpdeskg.repository.ChamadoRepository;
import com.gconbat.helpdeskg.repository.ClienteRepository;
import com.gconbat.helpdeskg.repository.TecnicoRepository;

@SpringBootApplication
public class HelpdeskgApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HelpdeskgApplication.class, args);
	}

	@Autowired
	private TecnicoRepository tecnicoRepository;

	@Autowired 
	private ClienteRepository clienteRepository;

	@Autowired 
	private ChamadoRepository chamadoRepository;

	@Override
	public void run(String... args) throws Exception {

		//REALIZANDO OS CADASTROS
		Tecnico tecnico = new Tecnico(null, "Gildo", "12345678900", "gil@email.com", "123");
		tecnico.addPerfil(Perfil.ADMIN);

		Cliente cliente = new Cliente(null, "José", "123456789", "jose@email.com", "1234");

		Chamado chamado = new Chamado(null, Prioridade.BAIXA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tecnico, cliente);

		tecnicoRepository.saveAll(Arrays.asList(tecnico));
		clienteRepository.saveAll(Arrays.asList(cliente));
		chamadoRepository.saveAll(Arrays.asList(chamado));
		
	}

}
