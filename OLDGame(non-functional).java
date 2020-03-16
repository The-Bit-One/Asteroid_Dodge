//Asteroid Dodge

// setting up player x and y
float x, y; 

void setup() {
  background(0, 0, 0);
  size(1000, 900);
  noLoop();
}

void draw() {
  // controls game states
  float screenOne = 1;

  // controls shift from endgame to menu start
  float nextGamestate = 0;
  // start menu
  while (screenOne == 1) {
    fill(0, 255, 0);
    // button to see credits
    ellipse(700, 450, 100, 100);
    // button for starting gameplay
    ellipse(300, 450, 100, 100);
    textSize(25);
    textSize(85);
    text("Asteroid Dodge", 180, 200);
    textSize(25);
    fill(0, 0, 0);
    text("play", 275, 455);
    text("credits", 660, 455);
    fill(0, 0, 0);
    //button for moving to gameplay start
    if ((dist(mouseX, mouseY, 500, 450)<30) && (mousePressed == true)); 
    {
      screenOne = 2;
    }
    // button for moving to credits screen
    if ((dist(mouseX, mouseY, 700, 450)<30) && (mousePressed == true));   
    {
      screenOne = 0;
    }
  }
  // credits screen with back button
  if (screenOne == 0) {
    fill(0, 255, 0);
    ellipse(50, 50, 70, 70);
    fill(0, 0, 0);
    text("back", 22, 57);
    if ((dist(mouseX, mouseY, 50, 50)<20) && (mousePressed == true));   
    {
      screenOne = 1;
    }
    fill(255, 255, 255);
    text(" Game Design - Riley Herchert \n Start Screen GUI design - Riley Herchert \n Thank you to Atari's asteroids for inspiration", 300, 600 );
  }
  
  //gameplay strt screen
  if (screenOne == 2) {
    // x for player
    x = 0 ;
    // y for player
    y = 50;

    // stops the player score counter from looping.
    float ScoreRedoPrevention = 0;
    // ellipse radius is cr
    int CR = 50;
    // game end, triggered when you hit a meteor
    float GameOver = 0;

    //player score counter
    float playerScore = 0;

    // x’s for meteors
    float A=  900;
    float B=  1200;
    float C=  800;
    float D=  600;
    float E=  850;
    float F = 700;
    float G = 900;
    float H= 1000;
    float I= 1400;
    float J = 1100;
    float K = 800;
    float L = 700;

    // Y’s for meteors
    float AA = 500;
    float BB = 600;
    float CC = 930;
    float DD = 700;
    float EE = 100;
    float FF = 500;
    float GG = 600;
    float HH = 650;
    float II = 800;
    float JJ =  80;
    float KK = 400;
    float LL = 700;


    //score variable should go up by 60ts per second
    while (GameOver == 0) {
      playerScore = playerScore + 1;
    }
    while (screenOne == 2) {
      // 5 second timer from end screen to start menu
      nextGamestate = nextGamestate+1;
    }
    //controls shift from end screen to start menu
    if (nextGamestate >= 300) {
      screenOne = 1;
      nextGamestate = 0;
    }
    while (GameOver == 1) {
      playerScore = playerScore - 0;
      textSize(300);
      text("Game \n Over", 500, 450);
      A = A-0;
      B = B-0;
      C = C-0;
      D = D-0;
      if (ScoreRedoPrevention == 0) {
        print(playerScore);
      }
      ScoreRedoPrevention = 1;
    }

    //code to move meteors across screen and reset them when they hit the left edge
    // random creates a random x value so meteors don't reset to same position

    A= A- 4.5;
    if (A < 0) {
      A= 1000;
      for (int i = 50; i < 1000; i++) {
        AA  = random(50, 1000);
      }
    }
    B =B - 4.5;
    if (B < 0) {
      B = 1000;
      for (int i = 0; i < 1000; i++) {
        BB  = random(50, 1000);
      }
    }
    C=C- 4.5;
    if (C< 0) {
      C = 1000;
      for (int i = 0; i < 1000; i++) {
        CC  = random(50, 1000);
      }
    }
    D= D - 4.5;
    if (D <0) {
      D = 1000;
      for (int i = 0; i < 1000; i++) {
        DD  = random(50, 1000);
      }
    }
    E=E - 4.5;
    if (E <0) {
      E = 1000;
      for (int i = 0; i < 1000; i++) {
        EE  = random(50, 1000);
      }
    }
    F = F- 4.5;
    if (F <0) {
      F = 1000;
      for (int i = 0; i < 1000; i++) {
        FF  = random(50, 1000);
      }
    }
    G = G - 4.5;
    if (G  <0) {
      G = 100;
      for (int i = 0; i < 1000; i++) {
        GG  = random( 50, 1000);
      }
    }
    H =H - 4.5;
    if (H <0) {
      H = 1000;
      for (int i = 0; i < 1000; i++) {
        HH  = random(50, 1000);
      }
    }
    I = I - 4.5;
    if (I  <0) {
      I = 1000;
      for (int i = 0; i < 1000; i++) {

        I= random(50, 1000);
      }
    }
    J = J - 4.5;
    if (J <0) {
      J = 1000;
      for (int i = 0; i < 1000; i++) {
        JJ  = random(50, 1000);
      }
    }
    K =K- 4.5;

    if (K < 0) {
      K = 1000;
      for (int i = 0; i < 1000; i++) {
        KK  = random(50, 1000);
      }
    }
    L = L - 4.5;

    if (L < 0) {
      L= 100;
      for (int i = 0; i < 100; i++) {
        LL  = random(50, 1000);
      }
    }

    //color setup
    stroke (255, 0, 0);
    fill(255, 0, 0);
    // player
    ellipse(x, y, 50, 50);
    //color setup
    fill(150, 75, 0);
    stroke (0);

    //meteors
    ellipse(A, AA, CR, CR);
    ellipse(B, BB, CR, CR);
    ellipse(C, CC, CR, CR);
    ellipse(D, DD, CR, CR);
    ellipse(E, EE, CR, CR);
    ellipse(F, FF, CR, CR);
    ellipse(G, GG, CR, CR);
    ellipse(H, HH, CR, CR);
    ellipse(I, II, CR, CR);
    ellipse(J, JJ, CR, CR);
    ellipse(K, KK, CR, CR);
    ellipse(L, LL, CR, CR);

    // meteor crash detector finds distance between spaceship and meteor if less than ten game
    // over

    if (dist(X, Y, A, AA)<CR-10) {
      print ("gameOver");
      GameOver = 1;
    }

    if (dist(X, Y, B, BB)<CR-10) {
      print ("gameOver");
      GameOver = 1;
    }

    if (dist (X, Y, C, CC)<CR-10) {
      print ("gameOver");
      GameOver = 1;
    }

    if (dist (X, Y, D, DD)<CR-10) {
      print ("gameOver");
      GameOver = 1;
    }

    if (dist(X, Y, E, EE)<CR-10) {
      print ("gameOver");
      GameOver = 1;
    }

    if (dist (X, Y, F, FF)<CR-10) {
      print ("gameOver");
      GameOver = 1;
    }

    if (dist (X, Y, G, GG)<CR-10) {
      print ("gameOver");
      GameOver = 1;
    }

    if (dist(X, Y, H, HH)<CR-10) {
      print ("gameOver");
      GameOver = 1;
    }

    if (dist(X, Y, I, II )<CR-10) {
      print ("gameOver");
      GameOver = 1;
    }

    if (dist (X, Y, J, JJ )<CR-10) {
      print ("gameOver");
      GameOver = 1;
    }

    if (dist(X, Y, K, KK)<CR-10) {
      print ("gameOver");
      GameOver = 1;
    }

    if (dist(X, Y, L, LL)<CR-10) {
      print ("gameOver");
      GameOver = 1;
    }
  }
}
//player movement using arrow keys

void keyPressed() {
  if (key == CODED) {
    if (keyCode == UP) {
      y=y-17 ;
      if (y < 0) {
        y=0;
      }
    } else if (keyCode == DOWN) {
      y=y+17;
      if (y > 900) {
        y=900;
      }
    } else if (keyCode == RIGHT) {
      x=x+17 ;
      if (x > 1000) {
        x=1000;
      }
    } else if (keyCode == LEFT) {
      x=x-17;
      if (x < 0) {
        x=0;
      }
    }
  }
}


void mousePressed() {
  loop();
}
void mouseReleased() {
  loop();
}

