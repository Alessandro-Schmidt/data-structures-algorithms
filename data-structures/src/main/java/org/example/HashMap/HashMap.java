package org.example.HashMap;

/*
* Hash maps are data structures that serve as efficient key-value stores.
* They are capable of assigning and retrieving data in the fastest way possible.
* This is because the underlying data structure that hash maps use is an array.
A value is stored at an array index determined by plugging the key into a hash function.
* Because we always know exactly where to find values in a hash map,
* we have constant access to any of the values it contains.
*
*
* */

public class HashMap {
    /*
    * The hash map class we will be completing is stored in the HashMap.java file.
    * Hash maps are based on arrays, so whenever we create a new hash map instance,
    * we’ll create a String array filled with null values that can be replaced with key-value pairs.
    * */

    public String[] hashMap;

    public HashMap(int size) {
        this.hashMap = new String[size];
    }

    /*
    * Inside of the for loop convert each character in key to an integer using the Java .codePointAt()
    * method of Character class.
    * This method accepts two parameters. A sequence of characters and the index to the character values to be
    *  converted and returns the Unicode point at the given index.

This method only works on strings and converts a character at a specific index into an integer between 0 and 65535. This integer represents the equivalent Unicode value of that character.
    * */
    public int hash(String key) {
        int hashCode = 0;
        for (int i = 0; i < key.length(); i++) {
            hashCode = hashCode + Character.codePointAt(key, i);
        }
        hashCode = hashCode % this.hashMap.length;
        return hashCode;
    }

    public void assign(String key, String value) {
        int arrayIndex = this.hash(key);
        this.hashMap[arrayIndex] = value;
    }

    public String retrieve(String key) {
        int arrayIndex = this.hash(key);
        return this.hashMap[arrayIndex];
    }

    public static void main(String[] args) {
        HashMap myHashMap = new HashMap(3);
        System.out.println(myHashMap.hash("New York"));
        System.out.println(myHashMap.hash("Nova Dehli"));
        myHashMap.assign("111", "Rostock");
        myHashMap.assign("113", "Nova Dehli");
    }
}
