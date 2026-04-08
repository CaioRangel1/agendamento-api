package com.rangel.agendamento_api.service;

import com.rangel.agendamento_api.dto.ClientRequestDTO;
import com.rangel.agendamento_api.dto.ClientResponseDTO;
import com.rangel.agendamento_api.entity.Client;
import com.rangel.agendamento_api.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientResponseDTO create(ClientRequestDTO dto){
        if (clientRepository.existsByEmail(dto.getEmail())){
            throw new RuntimeException("CLiente ja cadastrado");
        }
        Client client = new Client();
        client.setEmail(dto.getEmail());
        client.setName(dto.getName());
        client.setPhone(dto.getPhone());

        clientRepository.save(client);

        return new ClientResponseDTO(client.getId(), client.getName(), client.getEmail(), client.getPhone());
    }

    public ClientResponseDTO findAll(ClientRequestDTO dto){
    return null;
    }
}
