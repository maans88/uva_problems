import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.awt.List;
import java.io.*;
import java.lang.reflect.Array;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner myScanner = new Scanner(new File ("input"));
		int numOfCandidates;
		int choiceRank = 2;
		int numberOfParticipants;
		numOfCandidates = myScanner.nextInt();
		
		
		ArrayList<String> candidateList = new ArrayList<String>();
		ArrayList<Integer> votes = new ArrayList<Integer>();
		ArrayList<Integer> rankedVotes = new ArrayList<Integer>();
		ArrayList<Integer> percentageVotes = new ArrayList<Integer>();
		
		//Collecting and printing candidates names
		int tempNumOfCandidates = numOfCandidates;
		while (tempNumOfCandidates >= 0){
			String currName = myScanner.nextLine();
			if (!currName.equals("")){
				candidateList.add(currName);
			}
			tempNumOfCandidates --;
		}
		
		while (myScanner.hasNext()){
			votes.add(myScanner.nextInt());
		}
		numberOfParticipants = votes.size()/numOfCandidates;
		//up to here we have scanned the names, votes. and we know how many people voted
		//and how many candidates. 
		
		
		System.out.println(candidateList);
		System.out.println(votes);
		System.out.println(numberOfParticipants);
		
		System.out.println("-------------------------------------------------------");
		
		rankedVotes = fetchVotes(votes, choiceRank);
		System.out.println(rankedVotes);
		percentageVotes = calculatPercentag(rankedVotes, numOfCandidates, numberOfParticipants);
		System.out.println(percentageVotes);
		elimnationProcess(rankedVotes);
		/**
		int myPercentageArray[] = calculatPercentag(, numOfCandidates);
		
		for (int i = 0; i < myPercentageArray.length; i++){
			System.out.println(myPercentageArray[i]);
		}
		*/
		
		
		
		
	}
	
	public static ArrayList fetchVotes (ArrayList<Integer> votes, int choice){
		/*
		 * This method returns the votes according to their rank. 
		 * */
		ArrayList<Integer> currentVotes = new ArrayList<Integer>();
		for (int i = choice; i < votes.size(); i = i+3){
			currentVotes.add(votes.get(i));
		}
		return currentVotes;
	}
	
	public static ArrayList<Integer> calculatPercentag (ArrayList<Integer> currentVotes, int numberOfCandidates, int numOfParticipants){
		ArrayList<Integer> percentageList = new ArrayList<Integer>(Collections.nCopies(numberOfCandidates, 0));
		for (int i : currentVotes){
			percentageList.set(i-1, percentageList.get(i-1)+1);
		}
		return percentageList;
	}
	
	public static ArrayList<Integer> elimnationProcess(ArrayList<Integer> currentVotes){
		ArrayList<Integer> votes = new ArrayList<Integer>();
		boolean doWeHaveHighest = false;
		
		
		for (int i : currentVotes){
			System.out.println(i);
		}
		return votes;
	}
	
	
}
