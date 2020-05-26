
public class JuegoMain {
    public static void main(String[] args) {
        Ak bronce =new Ak();
       
        bronce.tipo="bronce";
        bronce.cargador=5;
        bronce.precision=65;
        bronce.velocidadCarga=5;
        bronce.precio=1000;
        bronce.dano= 10;
        bronce.velocidadDisparo=10;
        
        System.out.println(bronce.toString());
        
        Ak plata = new Ak();
        
        plata.tipo="plata";
        plata.cargador=8;
        plata.velocidadCarga=4.5;
        plata.precision=70;
        plata.dano=11;
        plata.precio=2300;
        plata.velocidadDisparo=9.8;
        
        System.out.println(plata.toString());
        
        Ak oro = new Ak();
        
        oro.tipo="oro";
        oro.cargador=10;
        oro.precision=85;
        oro.velocidadCarga=4.3;
        oro.precio=2500;
        oro.dano=13;
        oro.velocidadDisparo=10;
        
        System.out.println(oro.toString());
        
        Ak diamante = new Ak();
        
        diamante.tipo="diamante";
        diamante.cargador=20;
        diamante.precision=95;
        diamante.velocidadCarga=3;
        diamante.precio=4000;
        diamante.dano=20;
        diamante.velocidadDisparo=10;
        
        System.out.println(diamante.toString());
        
        Ak adamantium = new Ak();
        
        adamantium.tipo="adamantium";
        adamantium.cargador=20;
        adamantium.precision=95;
        adamantium.velocidadCarga=3;
        adamantium.precio=4000;
        adamantium.dano=20;
        adamantium.velocidadDisparo=10;
        
        System.out.println(adamantium.toString());
        
        
    }
    
}

