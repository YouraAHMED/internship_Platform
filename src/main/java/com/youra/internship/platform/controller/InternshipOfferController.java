package com.youra.internship.platform.controller;

import com.youra.internship.platform.model.InternshipOffer;
import com.youra.internship.platform.repository.InternshipOfferRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/offers")
public class InternshipOfferController {

    private final InternshipOfferRepository internshipOfferRepository;

    public InternshipOfferController(InternshipOfferRepository internshipOfferRepository) {
        this.internshipOfferRepository = internshipOfferRepository;
    }

    @GetMapping
    public List<InternshipOffer> getAllOffers() {
        return internshipOfferRepository.findAll();
    }
}