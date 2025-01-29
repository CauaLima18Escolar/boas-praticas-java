package br.com.alura.service;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.domain.Abrigo;
import br.com.alura.domain.Pet;

import java.net.http.HttpResponse;

import static org.mockito.Mockito.mock;

public class PetServiceTest {
    private ClientHttpConfiguration client = mock(ClientHttpConfiguration.class);
    private PetService abrigoService = new PetService(client);
    private HttpResponse<String> response = mock(HttpResponse.class);
    private Pet pet = new Pet("CACHORRO", "Rex", 5, 10.5, "Poodle","Marrom");
}
