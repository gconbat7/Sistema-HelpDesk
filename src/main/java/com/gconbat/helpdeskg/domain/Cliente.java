package com.gconbat.helpdeskg.domain;

import java.util.*;

import com.gconbat.helpdeskg.domain.enums.Perfil;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Cliente extends Pessoa {

        private static final long serialVersionUID = 1L;

        @OneToMany(mappedBy = "cliente")
        private List<Chamado> chamados = new ArrayList<>();

        public Cliente() {
            super();
            addPerfil(Perfil.CLIENTE);
        }

        public Cliente(Integer id, String nome, String cpf, String email, String senha, Set<Integer> perfis) {
            super(id, nome, cpf, email, senha, perfis);
            addPerfil(Perfil.CLIENTE);

        }

        public static long getSerialversionuid() {
            return serialVersionUID;
        }

        public List<Chamado> getChamados() {
            return chamados;
        }

        public void setChamados(List<Chamado> chamados) {
            this.chamados = chamados;
        }

        
}
