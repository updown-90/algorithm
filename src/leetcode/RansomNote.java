package leetcode;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public static void main(String[] args) {
        String ransomNote = "a", magazine = "b";

        Map<Character, Integer> ransomNoteMap = new HashMap<>();
        Map<Character, Integer> magazineMap = new HashMap<>();

        for (char c : ransomNote.toCharArray()) {
            ransomNoteMap.put(c, ransomNoteMap.getOrDefault(c, 0) + 1);
        }

        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }

        boolean returnValue = true;
        for (Character character : ransomNoteMap.keySet()) {
            if (magazineMap.getOrDefault(character, 0) < ransomNoteMap.getOrDefault(character, 0)) {
                returnValue = false;
            }
        }

        System.out.println(returnValue);


    }
}
