package com.bit.presentation.controller;

import com.bit.presentation.dto.ClientDTO;
import com.bit.service.interfaces.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private IClientService clientService;

    // Find all clients
    @GetMapping("/find")
    public ResponseEntity<List<ClientDTO>> findAll() {
        return new ResponseEntity<>(this.clientService.findAll(), HttpStatus.OK);
    }

    // Find client by id
    @GetMapping("/find/{id}")
    public ResponseEntity<ClientDTO> findById(@PathVariable Long id) {
        return new ResponseEntity<>(this.clientService.findById(id), HttpStatus.OK);
    }

    // Create client
    @PostMapping("/create")
    public ResponseEntity<ClientDTO> createClient(@RequestBody ClientDTO clientDTO) {
        return new ResponseEntity<>(this.clientService.createClient(clientDTO), HttpStatus.CREATED);
    }

    // Update client
    @PutMapping("/update/{id}")
    public ResponseEntity<ClientDTO> updateClient(@RequestBody ClientDTO clientDTO, @PathVariable Long id) {
        return new ResponseEntity<>(this.clientService.updateClient(clientDTO, id), HttpStatus.OK);
    }

    // Delete client
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteClient(@PathVariable Long id) {
        return new ResponseEntity<>(this.clientService.deleteClient(id), HttpStatus.NO_CONTENT);
    }
}
