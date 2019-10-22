package com.hosseinramon.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hosseinramon.apirest.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
