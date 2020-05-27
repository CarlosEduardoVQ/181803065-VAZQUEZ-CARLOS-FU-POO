//CLASE AVISO

public class Aviso {

    //ATRIBUTOS O DATOS.
    int id;
    String tipoAviso, titulo, texto, resumen, nombre, estatusF;
    int diaP, mesP, yearP;
    int diaA, mesA, yearA;
    int diaB, mesB, yearB;

//METODOS
    public void vigencia(){
            
    }

    @Override
    public String toString() {
        return "\nAviso: " + id
             + "\nTipo de Aviso: " + tipoAviso
             + "\nTitulo: " + titulo
             + "\nTexto: " + texto
             + "\nResumen: " + resumen
             + "\nNombre: " + nombre
             + "\nEstatus: "+ estatusF
                
             + "\nFecha de Publicación: " + diaP  + "/" + mesP + "/" + yearP
             + "\nFecha de Alta; " + diaA + "/" + mesA + "/" + yearA
             + "\nFecha de Baja: " + diaB + "/" + mesB + "/" + yearB;
        
        
    }

}

/*
fecha de publicación (día, mes y año ),fecha de alta (día, mes y año ), fecha de baja (día, mes y año ), status de la fecha 
(Vigente o no Vigente) y el tipo de aviso que puede ser de beca, congreso, general, etc. 
         
Los avisos pueden cambiar de status y aunque estén vigentes dejarían de aparecer, también se necesita saber si un aviso esta vigente
o no con respecto a la fecha del día hoy.

Dar de alta los sigientes avisos:


AVISO 2

Titulo: CONFERENCIA DR. COSSARIZZA

Publicó: Kevin Meza Gonzalez

Texto del aviso :El Dr. Andrea Cossarizza, ofreció a la comunidad IMSS su conferencia “Clinical Applications of Advanced Cytometry” y aprovechó la presencia de investigadores y estudiantes del IMSS para compartir sus últimos resultados de investigación, aún no publicados, sobre VIH y el uso de citometría de flujo.

Además, invitó a nuestra comunidad a agregarse a la sociedad internacional sobre citometría: ISAC(International Society for the Advancement of Cytometry) y aprovechar los recursos que tienen como:

Programa de Liderazgo MARYLOU INGRAM SCHOLARS PROGRAM, de 5 años para formación de citomteristas
Iniciativa de innovación CYTO-Innovation apoya a las propuestas innovadoras que contemplan la conversión de ideas en productos comerciales de alto impacto para ayudar a nuevos empresarios a aprovechar la tecnología de citometría

Además en la ISAC tienen disponibles una serie de manuales e información de punta sobre la citometría para uso libre. El Dr. Cossarizza reiteró la invitación al personal IMSS a vincularse con la Universidad de Módena y su laboratorio aprovechando el prestigio que tiene el Laboratorio de Citometría de Flujo del Centro de Instrumentos del Centro Médico Nacional Siglo XXI.

Resumen: :Conferencia de Dr. Andrea Cossarizza del tema “Clinical Applications of Advanced Cytometry"

Fecha de publicación:02/03/2020

Fecha de alta:15/02/2020

Fecha de baja: 31/03/2020

Status: No Vigente

Tipo de aviso: Conferencia*/
