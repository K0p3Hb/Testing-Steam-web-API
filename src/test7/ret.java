package test7;

import java.sql.Date;
import java.sql.Timestamp;

import java.util.List;

import de.inkvine.dota2stats.Dota2Stats;
import de.inkvine.dota2stats.domain.MatchOverview;
import de.inkvine.dota2stats.domain.filter.MatchHistoryFilter;
import de.inkvine.dota2stats.domain.matchdetail.MatchDetail;
import de.inkvine.dota2stats.domain.matchdetail.MatchDetailPlayer;
import de.inkvine.dota2stats.domain.matchhistory.MatchHistory;
import de.inkvine.dota2stats.domain.playersearch.PlayerSearchResult;
import de.inkvine.dota2stats.exceptions.Dota2StatsAccessException;
import de.inkvine.dota2stats.impl.Dota2StatsImpl;

public class ret {

<<<<<<< HEAD
	// Initialize without a proxy

	public static void main(String[] args) {
		Dota2Stats stats = new Dota2StatsImpl("D796311CB1B7596E851E183264FAB02A");
=======
  // Initialize without a proxy

  public static void main(String[] args) {
    Dota2Stats stats = new Dota2StatsImpl("D796311CB1B7596E851E183264FAB02A");
>>>>>>> origin/master
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
<<<<<<< HEAD
	
	try {
		//new MatchHistoryFilter().forDateMaximum(1);
	    // Get the details for a given match id
	    //MatchDetail detail = stats.getMatchDetails(1762832017L);
	   
	    // System.out.println(detail);
	    // extract all player stats from this game
	    //List<MatchDetailPlayer> playersStatsOfTheMatch = detail.getPlayers();

	    // Show 'em
	    //for(MatchDetailPlayer player : playersStatsOfTheMatch) {
	    	
	    //	System.out.println(player.toString());
	    	
	    	/*for(Item item : player.getItems())
	    		System.out.println(item.toString()); */   
	    //	System.out.println("\n");
	    //}
	    
=======

    try {
      //new MatchHistoryFilter().forDateMaximum(1);
      // Get the details for a given match id
      //MatchDetail detail = stats.getMatchDetails(1762832017L);

      // System.out.println(detail);
      // extract all player stats from this game
      //List<MatchDetailPlayer> playersStatsOfTheMatch = detail.getPlayers();

      // Show 'em
      //for(MatchDetailPlayer player : playersStatsOfTheMatch) {

      //	System.out.println(player.toString());

	    	/*for(Item item : player.getItems())
	    		System.out.println(item.toString()); */
      //	System.out.println("\n");
      //}

>>>>>>> origin/master
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
		
		long datemin,datemax,i;
		datemax = java.lang.System.currentTimeMillis()-86400000;
		datemin = java.lang.System.currentTimeMillis()-86400000;
		
		Date e = new Date(29, 11, 2016);
		Timestamp e1 = new Timestamp(2016, 11, 26, 0, 0, 0, 0), e2 = new Timestamp(2016, 11, 30, 0, 0, 0, 0);
		
		
		//MatchHistory history = stats.getMatchHistory(new MatchHistoryFilter().forStartingMatchId(2813144685L).forMaximumNumberOfResults(5));
		//MatchHistory history = stats.getMatchHistory(new MatchHistoryFilter().forAccountId(3299287L).forStartingMatchId(2813144685L).forMaximumNumberOfResults(1));
		MatchHistory history = stats.getMatchHistory(new MatchHistoryFilter().forDateMinimum(e1.getTime()).forMaximumNumberOfResults(1));
		int in = 0;
		long m = 0;//history.getMatchOverviews().get(0).getMatchId();
		List<MatchOverview> overviews = history.getMatchOverviews();
		
		while ( true){
			m =history.getMatchOverviews().get(history.getMatchOverviews().size()-1).getMatchId();
			history = stats.getMatchHistory(new MatchHistoryFilter().forStartingMatchId(m).forDateMaximum(e2.getTime()));
			if(history.getMatchOverviews().size()<2)
				break;
			overviews.addAll(history.getMatchOverviews());
			in=0;
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
			
		}
		//List<MatchOverview> overviews = history.getMatchOverviews();
	    System.out.println(history.getTotalNumberOfResults());
	    //overviews.addAll(overviews);
	    i=0;
	    // print all match overviews found
	    for (MatchOverview match : overviews){
	        i++;
	        //System.out.println(match.toString());
	        }
	    System.out.println(i);
	    
	    
	    //history = stats.getMatchHistory(new MatchHistoryFilter().forMaximumNumberOfResults(400));
	    //System.out.println(history.getTotalNumberOfResults());
	    /*overviews = history.getMatchOverviews();
	    i=0;
	    // print all match overviews found
	    for (MatchOverview match : overviews)
	        i++;
	    System.out.println(i);*/

      long datemin,datemax,i;
      datemax = java.lang.System.currentTimeMillis()-86400000;
      datemin = java.lang.System.currentTimeMillis()-86400000;

      Date e = new Date(29, 11, 2016);
      Timestamp e1 = new Timestamp(2016, 11, 26, 0, 0, 0, 0), e2 = new Timestamp(2016, 11, 30, 0, 0, 0, 0);


      //MatchHistory history = stats.getMatchHistory(new MatchHistoryFilter().forStartingMatchId(2813144685L).forMaximumNumberOfResults(5));
      //MatchHistory history = stats.getMatchHistory(new MatchHistoryFilter().forAccountId(3299287L).forStartingMatchId(2813144685L).forMaximumNumberOfResults(1));
      MatchHistory history = stats.getMatchHistory(new MatchHistoryFilter().forDateMinimum(e1.getTime()).forMaximumNumberOfResults(1));
      int in = 0;
      long m = 0;//history.getMatchOverviews().get(0).getMatchId();
      List<MatchOverview> overviews = history.getMatchOverviews();

      while ( true){
        m =history.getMatchOverviews().get(history.getMatchOverviews().size()-1).getMatchId();
        history = stats.getMatchHistory(new MatchHistoryFilter().forStartingMatchId(m).forDateMaximum(e2.getTime()));
        if(history.getMatchOverviews().size()<2)
          break;
        overviews.addAll(history.getMatchOverviews());
        in=0;
        try {
          Thread.sleep(10000);
        } catch (InterruptedException e3) {
          // TODO Auto-generated catch block
          e3.printStackTrace();
        }

      }
      //List<MatchOverview> overviews = history.getMatchOverviews();
      System.out.println(history.getTotalNumberOfResults());
      //overviews.addAll(overviews);
      i=0;
      // print all match overviews found
      for (MatchOverview match : overviews){
        i++;
        //System.out.println(match.toString());
      }
      System.out.println(i);


      //history = stats.getMatchHistory(new MatchHistoryFilter().forMaximumNumberOfResults(400));
      //System.out.println(history.getTotalNumberOfResults());
	    /*overviews = history.getMatchOverviews();
	    i=0;
	    // print all match overviews found
	    for (MatchOverview match : overviews)
	        i++;
	    System.out.println(i);*/

    } catch (Dota2StatsAccessException e1) {
      e1.printStackTrace();
      // Do something if an error occurs
    }

  }
}

