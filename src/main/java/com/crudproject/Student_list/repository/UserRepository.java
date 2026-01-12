package com.crudproject.Student_list.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crudproject.Student_list.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
