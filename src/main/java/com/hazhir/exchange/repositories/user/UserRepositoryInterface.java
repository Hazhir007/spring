package com.hazhir.exchange.repositories.user;

import com.hazhir.exchange.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepositoryInterface extends CrudRepository<User, Integer>
{

}
