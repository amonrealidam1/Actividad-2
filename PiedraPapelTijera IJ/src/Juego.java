package ende;

/**
 * Simula el juego de Piedra, Papel o tijera
 */


public class Juego 
{
    public static void main(String args[])
    {
        Jugador p1=new Jugador();
        Jugador p2=new Jugador();
        boolean finJuego=false;
        int rondasJugadas = 0;    // Número de rondas jugadas
        int exitosJugador1=p1.getExitos();
        int exitosJugador2=p2.getExitos();
        int empates = 0;
        String opcionJugador1, opcionJugador2;
        
        // Bucle de juego
        do
        {
            System.out.println("***** Ronda: " + rondasJugadas+" *********************\n");
            System.out.println("Numero de empates: "+ empates + "\n");
            opcionJugador1=p1.opcionAlAzar();
            System.out.println("Jugador 1: " + opcionJugador1+"\t Jugador 1 - Partidas ganadas: " + exitosJugador1);
            opcionJugador2 = p2.opcionAlAzar();
            System.out.println("Jugador 2: " + opcionJugador2+"\t Jugador 2 - Partidas ganadas: " + exitosJugador2);
            
            if((opcionJugador1.equals("piedra"))&&(opcionJugador2.equals("papel")))
            {
                System.out.println("Jugador 2 GANA");
                exitosJugador2 = p2.getExitos() + 1;
                
            }
            else if((opcionJugador1.equals("papel"))&&(opcionJugador2.equals("piedra")))
            {
                exitosJugador1 = p1.getExitos() + 1;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcionJugador1.equals("piedra"))&&(opcionJugador2.equals("tijeras")))
            {
                exitosJugador1 = p1.getExitos() + 1;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcionJugador1.equals("tijeras"))&&(opcionJugador2.equals("piedra")))
            {
                exitosJugador2 = p2.getExitos() + 1;
                System.out.println("Jugador 2 GANA");
            }
            else if((opcionJugador1.equals("tijeras"))&&(opcionJugador2.equals("papel")))
            {
                exitosJugador1 = p1.getExitos() + 1;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcionJugador1.equals("papel"))&&(opcionJugador2.equals("tijeras")))
            {
                exitosJugador2 = p2.getExitos() + 1;
                System.out.println("Jugador 2 GANA");
            }
            if(opcionJugador1==opcionJugador2)
            {
                empates++;
                System.out.println("\n\t\t\t Empate \n");
            }
            rondasJugadas++;
            if((p1.getExitos()>=3)||(p2.getExitos()>=3))
            {
                finJuego=true;
                System.out.println("FIN DEL JUEGO!!");
            }
            System.out.println();
        } while(finJuego!=true);
    }
}
/**
 *
 */
class Jugador{
   
    /**
     * Escoge piedra, papel o tijera al azar
     */
    public String opcionAlAzar()
    {
        String opcion="";
        int c = (int)(Math.random()*3);
        switch(c){
            case 0:
            	opcion=("piedra");
                break;
            case 1:
            	opcion=("papel");
                break;
            default:
            	opcion=("tijeras");
        }
        return opcion;
    }
    public void setExitos()
    {
        exitos++;
    }
    public int getExitos()
    {
        return exitos;
    }
    
    private int exitos;      // número de partidas ganadas
    private int winTotal;
}
