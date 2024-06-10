package com.bit.persistence.dao.interfaces;

import com.bit.persistence.entity.ClientEntity;

import java.util.List;
import java.util.Optional;

public interface IClientDAO {

    // Find all clients
    List<ClientEntity> findAll();

    // Find client by id
    Optional<ClientEntity> findById(Long id);

    // Create client
    void createClient(ClientEntity clientEntity);

    // Update client
    void updateClient(ClientEntity clientEntity);

    // Delete client
    void deleteClient(ClientEntity clientEntity);
}
