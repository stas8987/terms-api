package com.reckue.terms.services;

import com.reckue.terms.models.Term;
import com.reckue.terms.repositories.TermsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TermsService {

    private final TermsRepository termsRepository;

    public List<Term> getAll() {
        return termsRepository.findAll();
    }
}
