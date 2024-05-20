package com.openf.premierpas.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.openf.premierpas.model.Bill;
@RepositoryRestResource
public interface BillRepository extends JpaRepository<Bill,Long> {

}
