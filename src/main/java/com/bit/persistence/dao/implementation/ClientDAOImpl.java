package com.bit.persistence.dao.implementation;

import com.bit.persistence.dao.interfaces.IClientDAO;
import com.bit.persistence.entity.ClientEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientDAOImpl implements IClientDAO {

    // Find all clients
    @Override
    public List<ClientEntity> findAll() {
        return null;
    }

    // Find client by id
    @Override
    public Optional<ClientEntity> findById(Long id) {
        return Optional.empty();
    }

    // Create client
    @Override
    public void createClient(ClientEntity clientEntity) {

    }

    // Update client
    @Override
    public void updateClient(ClientEntity clientEntity) {

    }

    // Delete client
    @Override
    public void deleteClient(ClientEntity clientEntity) {

    }
}
