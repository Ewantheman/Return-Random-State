package Status;

import java.util.Random;

public class Status {
    // a class that contains a state which is either true or false
    Boolean state;

    public Status(Boolean state) {
        this.state = state;
    }
    Random random;
    // Random is built in class by java that can return random things (in this case, random Boolean)
    public void CreateRandomState(){
        random = new Random();
        state = random.nextBoolean();
    }

    public boolean CheckState(){
        return state;
    }
}
