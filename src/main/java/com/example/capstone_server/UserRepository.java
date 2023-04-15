package com.example.capstone_server;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

        @Query("SELECT u.timestamp from User u where u.name= 'Dog found in dumpster' AND u.object = 'dog'")
        List<Integer> findTimeStampByNameAndObject(); //select 문에 무엇을 출력할것인가에 따라 List<>뒤에 형식을 바꾸면 된다. => 전체 출력 시 User로

        @Query("SELECT u from User u where u.name= 'Dog found in dumpster' AND u.object = 'dog'")
        List<User> findByNameAndObject();

        @Query("SELECT u from User u")
        List<User> findAllData();


}



