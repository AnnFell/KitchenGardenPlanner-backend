package com.example.KitchenGardenPlanner.repository;

import com.example.KitchenGardenPlanner.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Account, Long> {
}
