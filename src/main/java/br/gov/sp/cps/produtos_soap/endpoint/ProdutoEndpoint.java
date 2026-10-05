package br.gov.sp.cps.produtos_soap.endpoint;

import br.gov.sp.cps.produtos_soap.model.ConsultarProdutoRequest;
import br.gov.sp.cps.produtos_soap.model.ConsultarProdutoResponse;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ProdutoEndpoint {

    private static final String NAMESPACE = "http://cps.sp.gov.br/produtos";

    @PayloadRoot( namespace = NAMESPACE, localPart = "consultarProdutoRequest"  )
    @ResponsePayload
    public ConsultarProdutoResponse consultarProduto( @RequestPayload ConsultarProdutoRequest request) {

        ConsultarProdutoResponse response =  new ConsultarProdutoResponse();

        if (request.getCodigo() == 1) {

            response.setNome("Iogurte");
            response.setDescricao("Sabor Morango"  );
            response.setMarca("Danone");
            response.setQuantidade(5);

        } if (request.getCodigo() == 2) {
        	 response.setNome("Iogurte");
             response.setDescricao("Sabor Salada de Frutas"  );
             response.setMarca("Danone");
             response.setQuantidade(9);
        	
        } if (request.getCodigo() == 3) {
       	 response.setNome("Barra de Chocolate");
         response.setDescricao("Amargo"  );
         response.setMarca("Nestle");
         response.setQuantidade(16);
    	
        } if (request.getCodigo() == 4) {
        	response.setNome("Refrigerante");
        	response.setDescricao("Sabor Cola"  );
        	response.setMarca("Coca Cola");
        	response.setQuantidade(19);
	
        } else {

            response.setNome( "Produto não encontrado!" );
            response.setDescricao("-");
        }

        return response;
    }
}