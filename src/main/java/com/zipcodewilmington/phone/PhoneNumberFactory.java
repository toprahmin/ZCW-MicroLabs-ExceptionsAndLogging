package com.zipcodewilmington.phone;

import com.zipcodewilmington.exceptions.InvalidPhoneNumberFormatException;
import com.zipcodewilmington.tools.RandomNumberFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by leon on 5/1/17.
 */
public final class PhoneNumberFactory {
    private static final Logger logger = LoggerFactory.getLogger(PhoneNumberFactory.class);

    private PhoneNumberFactory() {
        /** This constructor is private
         *  This class is uninstantiable */
    }

    /**
     * @param phoneNumberCount - number of PhoneNumber objects to instantiate
     * @return array of randomly generated PhoneNumber objects
     */ //TODO - Implement logic
    public static PhoneNumber[] createRandomPhoneNumberArray(int phoneNumberCount) {
        PhoneNumber[] newPhoneNumber = new PhoneNumber[phoneNumberCount];
        for(int i = 0; i < phoneNumberCount; i++){
            newPhoneNumber[i] = createRandomPhoneNumber();
        }
        return newPhoneNumber;
    }

    /**
     * @return an instance of PhoneNumber with randomly generated phone number value
     */ //TODO - Implement logic

    public int[] phoneLineMin(){
        if
    }

    private static PhoneNumber createRandomPhoneNumber() {

        int areaCode = RandomNumberFactory.createInteger(100,999);
        int centralOfficeCode = RandomNumberFactory.createInteger(100,999);
        int phoneLineCode = RandomNumberFactory.createInteger(1000,9999);
        return createPhoneNumberSafely(areaCode, centralOfficeCode, phoneLineCode);
    }


    /**
     * @param areaCode          - 3 digit code
     * @param centralOfficeCode - 3 digit code
     * @param phoneLineCode     - 4 digit code
     * @return a new phone number object
     */ //TODO - if input is valid, return respective PhoneNumber object, else return null
    public static PhoneNumber createPhoneNumberSafely(int areaCode, int centralOfficeCode, int phoneLineCode) {
        try{
           String newNumber = ("(" + areaCode +")" + "-" + centralOfficeCode + "-" + phoneLineCode);
            return createPhoneNumber(newNumber);
        }
        catch (InvalidPhoneNumberFormatException ipnfe){
            logger.info("(" + areaCode + ")" + "-" + centralOfficeCode + "-" + phoneLineCode + " " + "is not a valid phone number");

            return null;
        }

    }

    /**
     * @param phoneNumberString - some String corresponding to a phone number whose format is `(###)-###-####`
     * @return a new phone number object
     * @throws InvalidPhoneNumberFormatException - thrown if phoneNumberString does not match acceptable format
     */ // TODO - Add throws statement to method signature
    public static PhoneNumber createPhoneNumber(String phoneNumberString) throws InvalidPhoneNumberFormatException{
        logger.info("Attempting to create a new PhoneNumber object with a value of " + phoneNumberString);
        PhoneNumber newNumber = new PhoneNumber(phoneNumberString);
        return newNumber;
    }
}