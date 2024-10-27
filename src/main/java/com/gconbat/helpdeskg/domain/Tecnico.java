package com.gconbat.helpdeskg.domain;

import org.hibernate.mapping.Set;

import com.gconbat.helpdeskg.domain.enums.Perfil;

public class Tecnico extends Pessoa {

    private static final long serialVersionUID = 1L;

     public Tecnico() {
            super();
            addPerfil(Perfil.TECNICO);
        }

        public Tecnico(Integer id, String nome, String cpf, String email, String senha, Set<Integer> perfis) {
            super(id, nome, cpf, email, senha, perfis);
            addPerfil(Perfil.TECNICO);

        }

}
