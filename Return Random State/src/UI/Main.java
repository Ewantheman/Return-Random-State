package UI;

import Status.Status;

public class Main {

    public static void main(String[] args) {
      Status test1 = new Status(true);
      test1.CreateRandomState();
        System.out.println(test1.CheckState());
    }

    }