package com.verifix.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.verifix.models.ResRgMap;

@Repository
public interface ResrgMapRepository extends JpaRepository<ResRgMap, String>{

	@Query("SELECT p FROM ResRgMap p WHERE LOWER(p.resourceGroupId) = LOWER(:resgid)")
    public List<ResRgMap> findAllById(@Param("resgid") int resgid);
}
