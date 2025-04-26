package com.example.startspring.user

import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Long>