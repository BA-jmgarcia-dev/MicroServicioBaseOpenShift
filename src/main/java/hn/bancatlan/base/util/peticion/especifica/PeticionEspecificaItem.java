/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.bancatlan.base.util.peticion.especifica;

import java.util.List;

import hn.bancatlan.base.util.common.estructura.CampoAdicional;
import lombok.Data;

/**
 *
 * @author jcruzm
 */
@Data
public class PeticionEspecificaItem {
    private int numeroItem;
    private String campoEspecifico1;
    private String campoEspecifico2;
    private String campoEspecifico3;
    private List<CampoAdicional> campoAdicionalColeccion;
}
