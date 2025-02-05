package io.github.kayquesanmartin.clientesapi.controller;

import io.github.kayquesanmartin.clientesapi.model.Cliente;
import io.github.kayquesanmartin.clientesapi.repository.ClienteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/clientes")
public class ClienteController {


    private final ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @PostMapping
    public Cliente salvarCliente(@RequestBody Cliente cliente) {
        System.out.println("Cliente salvo com sucesso! \n" + cliente);

        return clienteRepository.save(cliente);
    }

    @GetMapping("/{id}")
    public Cliente buscarClientePorId(@PathVariable UUID id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @GetMapping("/buscar")
    public List<Cliente> buscarClientes(@RequestParam("nome") String nome) {
        return clienteRepository.findByNome(nome);
    }

    @GetMapping
    public List<Cliente> listarClientes(){
        return clienteRepository.findAll();
    }

    @PutMapping("/{id}")
    public void atualizarCliente(@PathVariable("id") UUID id, @RequestBody Cliente cliente) {
        System.out.println("Cliente atualizado com sucesso! \n" + cliente);

        cliente.setId(id);

        clienteRepository.save(cliente);
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable("id") UUID id) {
        System.out.println("Cliente deletado com sucesso! \n" + id);
        clienteRepository.deleteById(id);
    }

}
