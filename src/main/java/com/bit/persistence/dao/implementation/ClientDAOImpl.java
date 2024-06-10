package com.bit.persistence.dao.implementation;

import com.bit.persistence.dao.interfaces.IClientDAO;
import com.bit.persistence.entity.ClientEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientDAOImpl implements IClientDAO {

    @PersistenceContext
    private EntityManager em;

    // Find all clients
    @Override
    @Transactional(readOnly = true)
    public List<ClientEntity> findAll() {
        return this.em.createQuery("SELECT c FROM ClientEntity c").getResultList();
    }

    // Find client by id
    @Override
    @Transactional(readOnly = true)
    public Optional<ClientEntity> findById(Long id) {
        return Optional.ofNullable(this.em.find(ClientEntity.class, id));
    }

    // Create client
    @Override
    @Transactional
    public void createClient(ClientEntity clientEntity) {
        this.em.persist(clientEntity);
        this.em.flush(); // nos aseguramos de que todos los datos se sincronicen con la BD
    }

    // Update client
    @Override
    @Transactional
    public void updateClient(ClientEntity clientEntity) {
        this.em.merge(clientEntity);
    }

    // Delete client
    @Override
    @Transactional
    public void deleteClient(ClientEntity clientEntity) {
        this.em.remove(clientEntity);
    }
}
