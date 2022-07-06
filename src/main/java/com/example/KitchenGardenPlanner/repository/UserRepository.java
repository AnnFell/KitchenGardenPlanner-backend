package com.example.KitchenGardenPlanner.repository;

import com.example.KitchenGardenPlanner.model.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<Account, Long> {
    Optional<Account> findFirstByUserNameAndPassword(String userName, String password);
}
