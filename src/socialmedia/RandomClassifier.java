/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialmedia;

import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Tyler Sorenson
 */
public class RandomClassifier extends Experimenter{
    
    RandomClassifier(){}
    
    @Override
    Map<SocialMediaEntry, Boolean> classify(Set<SocialMediaEntry> testSet, 
                Map<SocialMediaEntry, Boolean> results) {   
        Random random = new Random();
        for (SocialMediaEntry entry : testSet) {
            results.put(entry, random.nextBoolean());
        }
        return results;
    }
    
}
