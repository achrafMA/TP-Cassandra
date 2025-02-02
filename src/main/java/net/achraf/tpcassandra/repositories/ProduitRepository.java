package net.achraf.tpcassandra.repositories;

import net.achraf.tpcassandra.entities.Produit;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface ProduitRepository extends CassandraRepository<Produit, UUID> {
}
