package com.youra.internship.platform.repository;

import com.youra.internship.platform.model.InternshipOffer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternshipOfferRepository extends JpaRepository<InternshipOffer, Long> {
}