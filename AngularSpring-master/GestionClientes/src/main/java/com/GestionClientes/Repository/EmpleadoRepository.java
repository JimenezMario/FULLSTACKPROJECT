package com.GestionClientes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GestionClientes.model.empleados;

@Repository
public interface EmpleadoRepository  extends JpaRepository<empleados, Long>{

}
