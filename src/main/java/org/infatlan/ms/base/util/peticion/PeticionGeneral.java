/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.infatlan.ms.base.util.peticion;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.infatlan.ms.base.util.common.estructura.CampoAdicional;
import org.infatlan.ms.base.util.common.estructura.IdentificadorItem;

/**
 *
 * @author jcruzm
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PeticionGeneral {
    private String servicioId;
    private String aplicacionId;
    private String paisId;
    private String institucionId;
    private String regionId;
    private String motorId;
    private String idioma;
    private String version;
    private String llaveSesion;
    private String usuarioId;
    private String clienteCoreId;
    private String dispositivoId;
    private String paso;
    private String ambiente;
    private String mandante;
    private String codigoPeticionUnica;
    private String codigoCore;
    private String codigoAgencia;
    private String codugoSucursal;
    private String usuarioAplicacion;
    private String direccionIp;
    private String tipoProcesamiento;
    
    private IdentificadorItem identificadorItem;
    private List<CampoAdicional> campoAdicionalColeccion;
    
}
