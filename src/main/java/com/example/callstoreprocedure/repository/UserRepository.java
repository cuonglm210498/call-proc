package com.example.callstoreprocedure.repository;

import com.example.callstoreprocedure.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author CuongLM18
 * @created 07/11/2022 - 11:17 AM
 * @project call-store-procedure
 */
@Repository
public interface UserRepository extends BaseRepository<User, Long> {

    @Query(value = "CALL GET_USER(:id)", nativeQuery = true)
    List<User> getAll(Long id);

//    DELIMITER $$
//    CREATE PROCEDURE `GET_USER`(IN user_id BIGINT(20))
//    BEGIN
//            SELECT
//		*
//    FROM `user` u
//    WHERE u.id = user_id;
//    END$$
//            DELIMITER ;
//
//    call GET_USER(1);
}
