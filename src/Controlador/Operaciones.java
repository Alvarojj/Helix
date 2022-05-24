package Controlador;

public class Operaciones {

    // valida si es una cadena que se escribo
    public boolean Estexto(String cad) {
        boolean sw = true;
        int lc = cad.length(), i;
        i = 0;
        char simbolo;
        while ((i < lc) && (sw)) {
            simbolo = cad.charAt(i);
            if (!(Character.isLetter(simbolo) || Character.isWhitespace(simbolo))) {
                sw = false;
            }
            i++;
        }
        return (sw);
    }

    // valida si lo que se escribio es un numero
    public boolean Esnumero(String cadena) {
        if (cadena.matches("[0-9]+")) {
            return (true);
        } else {
            return (false);
        }
    }

    //Verifica si es un Número Decimal
    public boolean Esdecimal(String cad) {
        if (cad.matches("[0-9]*['.']?[0-9]*")) {
            return (true);
        } else {
            return (false);
        }
    }

    // valida si lo que se escribio es una contrasena
    public boolean EsContrasena(String cadena) {
        if (cadena.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$")) {
            return (true);
        } else {
            return (false);
        }
    }

    //Verifica si es una dirección
    public boolean Esdireccion(String cad) {
        String patron = "^(Autopista|Avenida|Avenida Calle|Avenida Carrera|Avenida|Carrera|Calle|Carrera|Circunvalar|Diagonal|Kilometro|Transversal|AUTOP|AV|AC|AK|CL|KR|CCV|DG|KM|TV|CRA)(\\s)?([a-zA-Z]{0,15}|[0-9]{1,3})(\\s)?[a-zA-Z]?(\\s)?(bis)?(\\s)?(Este|Norte|Occidente|Oeste|Sur)?(\\s)?(#(\\s)?[0-9]{1,2}(\\s)?[a-zA-Z]?(\\s)?(bis)?(\\s)?(Este|Norte|Occidente|Oeste|Sur)?(\\s)?(-)?(\\s)?[0-9]{1,3}(\\s)?(Este|Norte|Occidente|Oeste|Sur)?)?((\\s)?(Agrupación|Altillo|Apartamento|Apartamento Sótano|Barrio|Bloque|Bodega|Cabecera Municipal|Callejón|Camino|Carretera|Casa|Caserio|Célula|Centro|Centro Comercial|Centro Urbano|Circular|Condominio|Conjunto|Consultorio|Corregimiento|Deposito|Deposito |Sótano|Edificio|Entrada|Esquina|Etapa|Finca|Garaje|Garaje Sótano|Grada|Inferior|Inspección de Policia|Interior|Kilometro|Local|Local Mezzanine|Local Sótano|Lote|Manzana|Manzanita|Mejora|Mezzanine|Módulo|Municipio|Núcleo|Oficina|Oficina Sótano|Parcela|Parcelación|Pasaje|Penthouse|Piso|Porteria|Predio|Principal|Puente|Quebrada|Salon|Sector|Semisótano|Suite|Supermanzana|Terraza|Torre|Troncal|Unidad|Urbanización|Vereda|Via|Zona|AGN|AL|APTO|AS|BR|BL|BG|CM|CLJ|CN|CT|CA|CAS|CEL|CE|CECO|CEUR|CIR|CDM|CONJ|CS|CO|DP|DS|ED|EN|ESQ|ET|FCA|GJ|GS|GR|INF|IP|IN|KM|LC|LM|LS|LT|MZ|MZTA|MJ|MN|MD|MUN|NCO|OF|OS|PA|PCN|PSJ|PH|PI|PT|PD|PPAL|PN|QDA|SA|SEC|SS|SU|SMZ|TZ|TO|TRL|UN|URB|VDA|VIA|ZN)?(\\s)?[1-9][0-9]{0,3})*$";
        if (cad.matches(patron)) {
            return (true);
        } else {
            return (false);
        }
    }

    //Verifica si es un correo
    public boolean Escorreo(String cad) {
        if (cad.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
            return (true);
        } else {
            return (false);
        }
    }

}
