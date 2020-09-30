package com.example.cadmus.cannonBolt.DaoLayer;

import com.example.cadmus.cannonBolt.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> { }
