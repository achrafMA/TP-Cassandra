package net.achraf.tpcassandra.repositories;

import net.achraf.tpcassandra.entities.User;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface UserRepository extends CassandraRepository<User, UUID> {
}
