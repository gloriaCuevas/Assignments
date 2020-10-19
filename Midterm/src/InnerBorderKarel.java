

import stanford.karel.*;
public class InnerBorderKarel extends SuperKarel {
   public void run() {
      moveUpRow();
      for(int i = 0; i < 4; i++) {
         handleBorder();
         nextPosition();
} }

      move();
      while (frontIsClear()) {

            putBeeper();
         }
move(); }
}

      turnLeft();
      move();
      turnRight();
}

      turnRight();
      move();
      turnRight();
      move();
      turnRight();
} }