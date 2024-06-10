package com.bit.service.implementation;

import com.bit.presentation.dto.ClientDTO;
import com.bit.service.interfaces.IClientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements IClientService {

    // Find all clients
    @Override
    public List<ClientDTO> findAll() {
        return null;
    }

    // Find client by id
    @Override
    public ClientDTO findById(Long id) {
        return null;
    }

    // Create client
    @Override
    public ClientDTO createClient(ClientDTO clientDTO) {
        return null;
    }

    // Update client
    @Override
    public ClientDTO updateClient(ClientDTO clientDTO, Long id) {
        return null;
    }

    // Delete client
    @Override
    public String deleteClient(Long id) {
        return null;
    }
}
