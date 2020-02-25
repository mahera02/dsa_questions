package org.mradhika.projects.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

public boolean canConstructBestApproach(String ransomNote, String magazine) {
        
        char[] ransom = ransomNote.toCharArray();
        char[] maga = magazine.toCharArray();
        int[] charMap = new int[128];
        
        for(char c : maga){
            charMap[c] ++;
        }
        for(char c : ransom){
            if(charMap[c] >0){
                charMap[c]--;
            }
            else
                return false;
        }
        return true;
        
    }

	public static boolean canConstruct(String ransomNote, String magazine) {

		char[] ransomNoteChar = ransomNote.toCharArray();
		char[] magazineChar = magazine.toCharArray();
		int countRansome = 0;
		int countMagazine = 0;
		Map<Character, Integer> mapRansome = new HashMap<>();
		Map<Character, Integer> mapMagazine = new HashMap<>();

		for (int i = 0; i < ransomNoteChar.length; i++) {
			if (mapRansome.containsKey(ransomNoteChar[i])) {
				countRansome = mapRansome.get(ransomNoteChar[i]);
				mapRansome.put(ransomNoteChar[i], countRansome + 1);
			} else {
				mapRansome.put(ransomNoteChar[i], 1);
			}
		}

		for (int i = 0; i < magazineChar.length; i++) {
			if (mapMagazine.containsKey(magazineChar[i])) {
				countMagazine = mapMagazine.get(magazineChar[i]);
				mapMagazine.put(magazineChar[i], countMagazine + 1);
			} else {
				mapMagazine.put(magazineChar[i], 1);
			}
		}
		boolean canConst = true;
		for (int i = 0; i < ransomNoteChar.length; i++) {
			if (!mapMagazine.containsKey(ransomNoteChar[i])) {
				return canConst = false;
			}

			else if (!(mapRansome.get(ransomNoteChar[i]) <= mapMagazine.get(ransomNoteChar[i]))) {
				canConst = false;
				break;
			}

		}

		return canConst;

	}

	//better approach - takes less time
	public static boolean canConstruct1(String ransomNote, String magazine) {

		char[] ransomNoteChar = ransomNote.toCharArray();
		char[] magazineChar = magazine.toCharArray();
		int[] charMapR = new int[256];
		int[] charMapM = new int[256];

		for (char c : ransomNoteChar) {
			charMapR[c]++;
		}
		for (char c : magazineChar) {
			charMapM[c]++;
		}
		boolean canConst = true;
		for (int i = 0; i < ransomNoteChar.length; i++) {
			if (!(charMapM[ransomNote.charAt(i)] >= charMapR[ransomNote.charAt(i)])) {
				return false;
			}
		}
		return canConst;

	}

	public static void main(String[] args) {
		boolean constrcut = RansomNote.canConstruct1("bhjdigif", "dbjdhdehgbcdjjgadeegdbegehjffie");
		System.out.println(constrcut);
	}

}
