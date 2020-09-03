package com.reckue.terms.repositories;

import com.reckue.terms.models.Term;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TermsRepository extends MongoRepository<Term, String> {
}
