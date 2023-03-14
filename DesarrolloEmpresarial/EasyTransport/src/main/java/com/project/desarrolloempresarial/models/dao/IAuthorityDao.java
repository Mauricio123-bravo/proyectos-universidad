package com.project.desarrolloempresarial.models.dao;

import com.project.desarrolloempresarial.entities.Authority;
import org.springframework.data.repository.CrudRepository;

public interface IAuthorityDao extends CrudRepository<Authority, Long> {
}
