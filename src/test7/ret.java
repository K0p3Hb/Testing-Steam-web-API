package test7;


import java.util.List;

import de.inkvine.dota2stats.Dota2Stats;
import de.inkvine.dota2stats.domain.matchdetail.MatchDetail;
import de.inkvine.dota2stats.domain.matchdetail.MatchDetailPlayer;
import de.inkvine.dota2stats.domain.matchhistory.MatchHistory;
import de.inkvine.dota2stats.domain.playersearch.PlayerSearchResult;
import de.inkvine.dota2stats.exceptions.Dota2StatsAccessException;
import de.inkvine.dota2stats.impl.Dota2StatsImpl;


public class ret {
	     
	// Initialize without a proxy
	
	public static void main(String[] args) {
		Dota2Stats stats = new Dota2StatsImpl("D796311CB1B7596E851E183264FAB02A");
/*	try {
	    List<PlayerSearchResult> results = stats.searchByPlayerName("john doe");

	    // Look at the results!
	    for(PlayerSearchResult item : results)
	        System.out.println(item);   

	} catch (Dota2StatsAccessException e) {
	        // Do something if an error occured    
	}*/

	/*try {

	    MatchHistory history = stats.getMostRecentMatchHistory();
	    List<MatchOverview> overviews = history.getMatchOverviews();

	    // print all match overviews found
	    for (MatchOverview match : overviews)
	        System.out.println(match);

	} catch (Dota2StatsAccessException e1) {
	    // Do something if an error occurs
	}*/
	
	try {
		//new MatchHistoryFilter().forDateMaximum(1);
	    // Get the details for a given match id
	    MatchDetail detail = stats.getMatchDetails(1762832017L);
	   // System.out.println(detail);
	    // extract all player stats from this game
	    List<MatchDetailPlayer> playersStatsOfTheMatch = detail.getPlayers();

	    // Show 'em
	    for(MatchDetailPlayer player : playersStatsOfTheMatch) {
	    	
	    	System.out.println(player.toString());
	    	
	    	/*for(Item item : player.getItems())
	    		System.out.println(item.toString()); */   
	    	System.out.println("\n");
	    }
	    
	   /* System.out.println(detail.didRadianWin());
	    System.out.println(detail.getLeagueId());
	    System.out.println((float)detail.getDurationOfMatch()/60);
	    
	    GameMode mode = detail.getGameMode();
	    System.out.println(detail.getGameMode().getValue());*/
	    
	   /* MatchHistory history = stats.getMostRecentMatchHistory();
	    List<MatchOverview> overviews = history.getMatchOverviews();

	    // print all match overviews found
	    for (MatchOverview match : overviews)
	        System.out.println(match);*/

	} catch (Dota2StatsAccessException e1) {
		e1.printStackTrace();
	    // Do something if an error occurs
	}
	
	}
}
