/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.bancatlan.base.dto.peticion.exposicion.especifica;

import hn.bancatlan.base.dto.peticion.exposicion.PeticionGeneral;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 *
 * @author jcruzm
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PeticionEspecifica extends PeticionGeneral {
    private List<PeticionEspecificaItem> peticionEspecificaColeccion;
}
