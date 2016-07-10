package guavadreamelectronicsmedia.firstandroidapp;

import java.util.Random;

/**
 * Created by Marty on 7/4/2016.
 */
public class FactBook {

    // Fields (member variables) - Properties about the object
    // the mFacts array
    private String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "Treehouse is not actually in a tree.",
            "Reptilians are aliens from the Draco star system that are enslaving Humans throughout the galaxies.",
            "We are Human-Alien-Hybrids put on planet Earth as an ongoing experiment.",
            "GOD-SOURCE is pure love and is not human and is not male nor female.",
            "David Icke and Jordan Maxell are right!",
            "Our birth right is love, food, fresh water, shelter, well-being and prosperity."};

    // Methods - Actions the object can take
    public String getFact() {
        String fact = "";
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;
    }





}  // end of class scope