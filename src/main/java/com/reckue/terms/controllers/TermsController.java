package com.reckue.terms.controllers;

import com.reckue.terms.models.Term;
import com.reckue.terms.services.TermsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/terms")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class TermsController {

    private final TermsService termsService;

    @GetMapping("/")
    public List<Term> getAll() {
        return termsService.getAll();
    }

    @PostMapping("/")
    public Term postOne(@RequestBody Term term) {
        return termsService.postOne(term);
    }
}
