package cubes;
import java.util.Random;

public class Game {

    private int numofpeople;
    private int cubes;

    public Game(int numofpeople, int cubes)
    {
        this.numofpeople = numofpeople;
        this.cubes = cubes;
    }


    private int[] createpeople(){
        int[] people = new int[numofpeople];
        for (int x = 0; x<numofpeople;x++){
            people[x] = 0;
        }
        return people;
    }

    private int[] roll(int[] people)
    {
        int[] results = new int[people.length];
        for(int x = 0; x< results.length;x++)
        {
            int sum = 0;
            for(int y = 1; y<=this.cubes; y++)
            {
                Random ran = new Random();
                int z = ran.nextInt(6) + 1;
                sum += z;
            }
            results[x] = sum;
        }

        int winner = 0;
        for (int i = 0;i < results.length; i++){
            winner = results[i] > results[winner] ? i : winner;
        }
        people[winner]+=1;
        System.out.println("Round winner: player "+(winner+1)+", score: "+results[winner]);
        return people;
    }

    public void play()
    {
        int[] people = createpeople();
        while (true)
        {
            boolean stop = false;
            people = roll(people);
            for (int k = 0;k<people.length;k++){
                if (people[k]>=7){
                    System.out.println("Game winner: player "+(k+1));
                    stop = true;
                }
            }
            if (stop){
                break;
            }

        }
    }
}
