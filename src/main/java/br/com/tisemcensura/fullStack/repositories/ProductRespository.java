package br.com.tisemcensura.fullStack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tisemcensura.fullStack.entities.Product;

public interface ProductRespository extends JpaRepository<Product, Long>{

}
