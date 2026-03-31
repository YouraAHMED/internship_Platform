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


    @GetMapping("/{id}")
    public InternshipOffer getOfferById(@PathVariable Long id) {
        return internshipOfferRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Offer not found with id: " + id));
    }

    @PostMapping
    public InternshipOffer createOffer(@RequestBody InternshipOffer offer) {
        return internshipOfferRepository.save(offer);
    }

    @DeleteMapping("/{id}")
    public void deleteOffer(@PathVariable Long id) {
        internshipOfferRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public InternshipOffer updateOffer(@PathVariable Long id, @RequestBody InternshipOffer updatedOffer) {

        InternshipOffer offer = internshipOfferRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Offer not found with id: " + id));

        offer.setTitle(updatedOffer.getTitle());
        offer.setCompany(updatedOffer.getCompany());
        offer.setCity(updatedOffer.getCity());
        offer.setDescription(updatedOffer.getDescription());
        offer.setTechnology(updatedOffer.getTechnology());
        offer.setType(updatedOffer.getType());

        return internshipOfferRepository.save(offer);
    }
}