public class Volleyball implements playable {
    int minPlayer = 0;
    public void play(){
        System.out.println("Total Number of players in Volleyball are 11");
    }

    public static void main(String[] args) {

        //static members need not be overridden and no restriction
        int initialMax_Players = x;
        Volleyball v1= new Volleyball();
        int maxPlayers = v1.MaxPlayers;

        System.out.println(maxPlayers+" players will "+ playable.dribble());
        playable p1 = new Volleyball(); //Run Time polymorphism, interface ius" Who "+playable.dribble()+
        int minPlayer1 =  ((Volleyball) p1).minPlayer;// casting to get volleyball properties, ideally in code u can access
        //but it is not acccessible from user stand point if we don't cast it!
        int p1Maxplayers = p1.MaxPlayers;
        System.out.println("Overall minimum players in Volleyball are "+minPlayer1 +" and now " +
                "Maximum Players allowed to play are "+p1Maxplayers + " Who "+playable.dribble());
    /*    playable p1 = new playable() {
            @Override
            public void play() {

            }
        }; */

    }
}

