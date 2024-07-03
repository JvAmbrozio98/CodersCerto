package com.example.CodersCerto.repositories;

import com.example.CodersCerto.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserModelRepository extends JpaRepository <UserModel , UUID> {
     Optional <UserModel> findByUserName (String userName);
}
