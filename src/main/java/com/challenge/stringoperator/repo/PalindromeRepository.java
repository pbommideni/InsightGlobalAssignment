package com.challenge.stringoperator.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.challenge.stringoperator.model.Palindrome;


@Repository
public interface PalindromeRepository extends CrudRepository<Palindrome, Long> {

}
