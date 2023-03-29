/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.bancatlan.base.util.peticion.especifica;

import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import hn.bancatlan.base.util.peticion.PeticionGeneral;

/**
 *
 * @author jcruzm
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PeticionEspecifica extends PeticionGeneral {
    private List<PeticionEspecificaItem> peticionEspecificaColeccion;
}
