package com.example.funfacts;

import java.util.Random;

class FactBook {
    private String[] facts = {
            "TURTLE",
            "LAWYERUP",
            "TOOLSUP",
            "nuttertools",
            "aezakmi",
            "uzumymw",
            "aiypwzqp",
            "PANZER"
    };
    //Fields or member variables - Properties about the object
    //Methods - Actions  the objects can take

    String getFact() {

        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts[randomNumber];
    }
}
