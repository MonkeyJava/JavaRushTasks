package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException, CorruptedDataException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        BufferedReader br = new BufferedReader(new FileReader(fileName1));
        BufferedReader br2 = new BufferedReader(new FileReader(fileName2));
        String str;
        while ((str = br.readLine()) != null){
            allLines.add(str);
        }
        String str2;
        while ((str2 = br2.readLine()) != null){
            forRemoveLines.add(str2);
        }
        Solution sol = new Solution();
        sol.joinData();
        reader.close();
        br.close();
        br2.close();
    }
//Если список allLines содержит все строки из forRemoveLines,
// то удалить из списка allLines все строки, которые есть в forRemoveLines
    public void joinData () throws CorruptedDataException {
            if (allLines.containsAll(forRemoveLines)) allLines.removeAll(forRemoveLines);
            else { allLines.clear();
        throw new CorruptedDataException();}
    }
}
//Метод joinData должен удалить в списке allLines все строки из списка forRemoveLines,
// если в allLines содержаться все строки из списка forRemoveLines.
//Убедись, что метод joinData() удаляет в списке allLines все строки из списка forRemoveLines.