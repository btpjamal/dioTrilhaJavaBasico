public class controleRemoto {
    public static void main(String[] args) {
        smartTv smarttv= new smartTv();

        smarttv.diminuirVolume();
        smarttv.diminuirVolume();
        smarttv.diminuirVolume();
        smarttv.aumentarVolume();

        System.out.println("tv ligada? "+ smarttv.ligada); // primeiramente estava como false
        System.out.println("canal atual: "+ smarttv.canal);
        System.out.println("volume: "+ smarttv.volume);

        smarttv.ligar();
        System.out.println("tv ligada? "+ smarttv.ligada); // o método passa o parametro como true
        smarttv.desligar();
        System.out.println("tv ligada? "+ smarttv.ligada); // o método que passa novamente para false


        System.out.println("canal atual: "+ smarttv.canal);
        smarttv.mudarCanal(13);
        System.out.println("novo canal: "+ smarttv.canal);
    }
}
