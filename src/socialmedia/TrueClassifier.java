/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialmedia;

import java.util.Map;
import java.util.Set;

/**
 *
 * @author Tyler Sorenson
 */
    public class TrueClassifier extends Experimenter{
                
        TrueClassifier(){}
        
        @Override
        Map<SocialMediaEntry, Boolean> classify(Set<SocialMediaEntry> testSet, 
                Map<SocialMediaEntry, Boolean> results) {            
            for (SocialMediaEntry entry : testSet) {
                results.put(entry, true);
            }
            return results;
        }
    }


