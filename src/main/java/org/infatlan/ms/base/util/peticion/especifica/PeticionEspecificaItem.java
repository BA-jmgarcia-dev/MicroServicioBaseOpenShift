/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.infatlan.ms.base.util.peticion.especifica;

import java.util.List;
import lombok.Data;
import org.infatlan.ms.base.util.common.estructura.CampoAdicional;

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
