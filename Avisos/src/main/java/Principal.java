
public class Principal {
    public static void main(String[] args) {
        
        
        //INSTANCIAR UN OBJETO (CREAR UN OBJETO)
        Aviso aviso1 = new Aviso();
        
        aviso1.id=1;
        
        aviso1.tipoAviso="General";
        aviso1.titulo="Insumos y bienes muebles de laboratorio disponibles";
        aviso1.texto="La Coordinación de Control Técnico de Insumos (COCTI) de la Dirección de Prestaciones Médicas, pone a disposición del personal que realiza investigación el inventario adjunto.";
        aviso1.resumen="Insumos y bienes muebles de laboratorio disponibles por la Coordinación de Control Técnico de Insumos (COCTI)";
        aviso1.nombre="Eduardo Flores Díaz";
        aviso1.estatusF="Vigente";
        
        aviso1.diaP=02;
        aviso1.mesP=02;
        aviso1.yearP=2020;
        
        aviso1.diaA=02;
        aviso1.mesA=02;
        aviso1.yearA=2020;
        
        aviso1.diaB=02;
        aviso1.mesB=02;
        aviso1.yearB=2021;
        
        System.out.println(aviso1);
        
        Aviso aviso2 = new Aviso();
        
        aviso2.id=2;
        
        aviso2.tipoAviso="Conferencia";
        aviso2.titulo="CONFERENCIA DR. COSSARIZZA";
        aviso2.texto="El Dr. Andrea Cossarizza, ofreció a la comunidad IMSS su conferencia “Clinical Applications of Advanced Cytometry” y aprovechó la presencia de investigadores y estudiantes del IMSS para compartir sus últimos resultados de investigación, aún no publicados, sobre VIH y el uso de citometría de flujo.\n" +
"\n" +
"Además, invitó a nuestra comunidad a agregarse a la sociedad internacional sobre citometría: ISAC(International Society for the Advancement of Cytometry) y aprovechar los recursos que tienen como:\n" +
"\n" +
"Programa de Liderazgo MARYLOU INGRAM SCHOLARS PROGRAM, de 5 años para formación de citomteristas\n" +
"Iniciativa de innovación CYTO-Innovation apoya a las propuestas innovadoras que contemplan la conversión de ideas en productos comerciales de alto impacto para ayudar a nuevos empresarios a aprovechar la tecnología de citometría\n" +
"\n" +
"Además en la ISAC tienen disponibles una serie de manuales e información de punta sobre la citometría para uso libre. El Dr. Cossarizza reiteró la invitación al personal IMSS a vincularse con la Universidad de Módena y su laboratorio aprovechando el prestigio que tiene el Laboratorio de Citometría de Flujo del Centro de Instrumentos del Centro Médico Nacional Siglo XXI.";
        
        aviso2.resumen="Conferencia de Dr. Andrea Cossarizza del tema “Clinical Applications of Advanced Cytometry\"";
        aviso2.nombre="Kevin Meza Gonzalez";
        aviso2.estatusF="No Vigente";
        
        aviso2.diaP=02;
        aviso2.mesP=03;
        aviso2.yearP=2020;
        
        aviso2.diaA=15;
        aviso2.mesA=02;
        aviso2.yearA=2020;
        
        aviso2.diaB=31;
        aviso2.mesB=03;
        aviso2.yearB=2020;
       
        System.out.println(aviso2);
        
    }
    
}
