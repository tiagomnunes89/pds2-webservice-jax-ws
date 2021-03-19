package br.edu.iftm.webservicejaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "br.edu.iftm.webservicejaxws.ExemploService")
public class ExemploServiceImpl implements ExemploService {

    @WebMethod
    public int calcula(int id) {
        return id+10;
    }
}