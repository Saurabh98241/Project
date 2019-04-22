/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author shiva
 */
public class handValidator {
    public boolean validateDealerHand(int hand)
    {
        if(hand>=16)
        {
            return true;
        }
        return false;
    }
    
}
