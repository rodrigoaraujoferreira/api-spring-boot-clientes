package com.estudos.clientes.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudos.clientes.model.ClientesModel;

@Repository
public interface ClientesRepository extends JpaRepository<ClientesModel, Long>{
	
}
