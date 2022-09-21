package com.bank.repository;

import com.bank.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<Bank,Long> {
    @Query("Update Customer set amount=: amount where id=:id")
    void updateAmount(String amount, Long id);

    @Query("Update Customer set amount=: amount where id=:id")
    void fdOpening(String amount, Long id);
    @Query("Update Customer set amount=: amount where id=:id")
    void odOpening(String amount, Long id);
}
