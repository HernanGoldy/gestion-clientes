package com.bit.service.implementation;

import com.bit.persistence.dao.interfaces.IClientDAO;
import com.bit.persistence.entity.ClientEntity;
import com.bit.presentation.dto.ClientDTO;
import com.bit.service.interfaces.IClientService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    private IClientDAO clientDAO;

    // Find all clients
    @Override
    public List<ClientDTO> findAll() {
        ModelMapper modelMapper = new ModelMapper();

        return this.clientDAO.findAll()
                .stream()
                .map(entity -> modelMapper.map(entity, ClientDTO.class))
                .collect(Collectors.toList());
    }

    // Find client by id
    @Override
    public ClientDTO findById(Long id) {
        Optional<ClientEntity> clientEntity = this.clientDAO.findById(id);

        if (clientEntity.isPresent()) {
            ModelMapper modelMapper = new ModelMapper();
            ClientEntity currentClient = clientEntity.get();
            return modelMapper.map(currentClient, ClientDTO.class);
        } else {
            return new ClientDTO();
        }
    }

    // Create client
    @Override
    public ClientDTO createClient(ClientDTO clientDTO) {

        try {
            ModelMapper modelMapper = new ModelMapper();
            ClientEntity clientEntity = modelMapper.map(clientDTO, ClientEntity.class);
            this.clientDAO.createClient(clientEntity);
            return clientDTO;
        } catch (Exception e) {
            throw new UnsupportedOperationException("Error al crear el cliente.");
        }
    }

    // Update client
    @Override
    public ClientDTO updateClient(ClientDTO clientDTO, Long id) {
        // Necesitamos extraer el cliente para saber existe o no
        Optional<ClientEntity> clientEntity = this.clientDAO.findById(id);

        if (clientEntity.isPresent()) {
            ClientEntity currentClientEntity = clientEntity.get();
            currentClientEntity.setFechaAlta(clientDTO.getFechaAlta());
            currentClientEntity.setNumeroCliente(clientDTO.getNumeroCliente());
            currentClientEntity.setNumeroDocumento(clientDTO.getNumeroDocumento());
            currentClientEntity.setApellido(clientDTO.getApellido());
            currentClientEntity.setNombres(clientDTO.getNombres());
            currentClientEntity.setNombreCalle(clientDTO.getNombreCalle());
            currentClientEntity.setNumeroCalle(clientDTO.getNumeroCalle());
            currentClientEntity.setPiso(clientDTO.getPiso());
            currentClientEntity.setDepartamento(clientDTO.getDepartamento());
            currentClientEntity.setNombreEdificio(clientDTO.getNombreEdificio());
            currentClientEntity.setManzana(clientDTO.getManzana());
            currentClientEntity.setCasa(clientDTO.getCasa());
            currentClientEntity.setEntreCalle1(clientDTO.getEntreCalle1());
            currentClientEntity.setEntreCalle2(clientDTO.getEntreCalle2());
            currentClientEntity.setSobreCalle(clientDTO.getSobreCalle());
            currentClientEntity.setDescripcionCasa(clientDTO.getDescripcionCasa());
            currentClientEntity.setBarrio(clientDTO.getBarrio());
            currentClientEntity.setCiudad(clientDTO.getCiudad());
            currentClientEntity.setProvincia(clientDTO.getProvincia());
            currentClientEntity.setPais(clientDTO.getPais());
            currentClientEntity.setCoordenadasGoogleMaps(clientDTO.getCoordenadasGoogleMaps());
            currentClientEntity.setTelefonoFijo(clientDTO.getTelefonoFijo());
            currentClientEntity.setTelefonoMovil1(clientDTO.getTelefonoMovil1());
            currentClientEntity.setTelefonoMovil2(clientDTO.getTelefonoMovil2());
            currentClientEntity.setEmail(clientDTO.getEmail());
            currentClientEntity.setInstagram(clientDTO.getInstagram());
            currentClientEntity.setFacebook(clientDTO.getFacebook());

            this.clientDAO.updateClient(currentClientEntity);

            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(currentClientEntity, ClientDTO.class);
        } else {
            throw new IllegalArgumentException("El cliente no existe.");
        }
    }

    // Delete client
    @Override
    public String deleteClient(Long id) {
        Optional<ClientEntity> clientEntity = this.clientDAO.findById(id);

        if (clientEntity.isPresent()) {
            ClientEntity currentClientEntity = clientEntity.get();
            this.clientDAO.deleteClient(currentClientEntity);
            return "El cliente con ID " + id + " ha sido eliminado exitosamente.";
        } else {
            return "El cliente con ID " + id + " no existe en la base de datos.";
        }
    }
}
