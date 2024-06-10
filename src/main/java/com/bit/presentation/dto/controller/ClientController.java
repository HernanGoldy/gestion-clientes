package com.bit.presentation.dto.controller;

import com.bit.presentation.dto.ClientDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    // Find all clients
    @GetMapping("/find")
    public ResponseEntity<List<ClientDTO>> findAll() {
        return null;
    }

    // Find client by id
    @GetMapping("/find/{id}")
    public ResponseEntity<ClientDTO> findById(@PathVariable Long id) {
        return null;
    }

    // Create client
    @PostMapping("/create")
    public ResponseEntity<ClientDTO> createClient(@RequestBody ClientDTO clientDTO) {
        return null;
    }

    // Update client
    @PutMapping("/update/{id}")
    public ResponseEntity<ClientDTO> updateClient(@RequestBody ClientDTO clientDTO, @PathVariable Long id) {
        return null;
    }

    // Delete client
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteClient(@PathVariable Long id) {
        return null;
    }
}
