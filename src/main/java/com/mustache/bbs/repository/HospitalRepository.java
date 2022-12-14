package com.mustache.bbs.repository;

import com.mustache.bbs.domain.entity.Hospital;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
    List<Hospital> findByBusinessTypeNameInAndRoadNameAddressLike(List<String> businessTypes, String roadNameAddress);

    Page<Hospital> findByRoadNameAddressContaining(String keyword, Pageable pageable);
}
