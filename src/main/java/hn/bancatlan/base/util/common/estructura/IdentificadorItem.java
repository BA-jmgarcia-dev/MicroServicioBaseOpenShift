/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.bancatlan.base.util.common.estructura;

import lombok.Data;

/**
 *
 * @author jcruzm
 */
@Data
public class IdentificadorItem {
    private String idProceso;
    private String referenciaBus;
    private String numeroTransaccion;
    private String tipoTransaccion;
}