interface  playable {

    void play(); // no need to add abstract for methods in interface
    static int x = 15;
    int MaxPlayers = x-1;

    static String dribble(){

        String drib = "Dribble As frequently as possbile";
        return drib;
    }
}
