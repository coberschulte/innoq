public class Spielfeld {
    public static final String color_RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\033[0;97m";;
    public static void zeichne_spielfeld(char spielfeld[][],int zug, int am_zug, int auswahl_gegner)
    {

        int[][] farbig = Spieler.getfarbfeld();

        System.out.println(BLACK + "|---------------------------|");
        System.out.println("| 1 | 2 | 3 | 4 | 5 | 6 | 7 |");
        for(int i = 0; i<6; i++)
        {
            System.out.println(BLACK + "|---------------------------|");
            System.out.print("|");
            for(int j = 0; j<7; j++)
            {


                int farbe = farbig[i][j];
                if(zug == 0)
                {
                    System.out.printf(WHITE + " %c ", spielfeld[i][j]);
                    System.out.print(BLACK + "|");
                }
                else
                {
                    if (farbe != 0)
                    {
                        switch(farbe)
                        {
                            case 1:
                                System.out.printf(GREEN + " %c ", spielfeld[i][j]);
                                System.out.print(BLACK + "|"); break;
                            case 2:
                                System.out.printf(RED + " %c ", spielfeld[i][j]);
                                System.out.print(BLACK + "|"); break;
                            case 3:
                                System.out.printf(YELLOW + " %c ", spielfeld[i][j]);
                                System.out.print(BLACK + "|"); break;
                            case 4:
                                System.out.printf(BLUE + " %c ", spielfeld[i][j]);
                                System.out.print(BLACK + "|"); break;
                            case 5:
                                System.out.printf(PURPLE + " %c ", spielfeld[i][j]);
                                System.out.print(BLACK + "|"); break;
                            case 6:
                                System.out.printf(CYAN + " %c ", spielfeld[i][j]);
                                System.out.print(BLACK + "|"); break;
                        }

                    }
                        else
                        {
                        System.out.printf(WHITE + " %c ", spielfeld[i][j]);
                        System.out.print(BLACK + "|");
                        }
                }



            }
            System.out.println("");
        }
        System.out.println("|---------------------------|" + color_RESET);

    }
    public static char[][] leeren()
    {
        char[][] spielfeld = new char[6][7];
        for(int i = 0; i<6; i++)
        {
            for(int j = 0; j<7; j++)
            {
                spielfeld[i][j] = 'O';
            }
        }
        return spielfeld;
    }
}
