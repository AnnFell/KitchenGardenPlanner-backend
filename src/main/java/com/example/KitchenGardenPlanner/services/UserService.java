package com.example.KitchenGardenPlanner.services;

import com.example.KitchenGardenPlanner.model.Account;
import com.example.KitchenGardenPlanner.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class UserService {
    final UserRepository userRepository;

    public Optional<Account> findUser(Account user) {
        return userRepository.findFirstByUserNameAndPassword(user.getUserName(), user.getPassword());
    }

    public Account register(Account user) {
        return userRepository.save(user);
    }
}
