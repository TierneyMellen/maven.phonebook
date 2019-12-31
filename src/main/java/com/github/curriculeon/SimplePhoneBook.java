package com.github.curriculeon;

import java.util.*;

/**
 * Created by leon on 12/16/2019.
 */
public class SimplePhoneBook {

    private Map<String, String> simplePhoneBook = new HashMap<>();

    public void add(String name, String phoneNumberToAdd) {

        this.simplePhoneBook.put(name, phoneNumberToAdd);

    }
    public void remove(String name) {

        this.simplePhoneBook.remove(name);

    }

    public Boolean hasEntry(String phoneNumber) {

        return this.simplePhoneBook.containsValue(phoneNumber);

    }

    public String get(String name) { //lookup function

        return this.simplePhoneBook.get(name);

    }

    public String reverseLookup(String phoneNumber) {
        Map<String, String> tempMap = new HashMap<>();
        Set<String> nameSet = this.simplePhoneBook.keySet();
        Set <String> valueSet = (Set) this.simplePhoneBook.values();

        return null;

    }

    public List<String> getAllContactNames() {
        Set<String> nameSet = this.simplePhoneBook.keySet();
        List<String> nameList = new ArrayList();
        nameList.addAll(nameSet);
        //Collections.sort(nameList);
        return nameList;

    }
}
