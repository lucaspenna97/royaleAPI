package com.clashroyale.RoyaleConsulta.controller;

import com.clashroyale.RoyaleConsulta.service.RoyaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RoyaleController {

    @Autowired
    private RoyaleService royaleService;

    //Clans
    @GetMapping(value = "searchClans")
    @ResponseBody
    public String searchClans(@RequestParam(name = "name", required = false) String name,
                              @RequestParam(name = "locationId", required = false) String locationId,
                              @RequestParam(name = "minMembers", required = false) String minMembers,
                              @RequestParam(name = "maxMembers", required = false) String maxMembers,
                              @RequestParam(name = "minScore", required = false) String minScore,
                              @RequestParam(name = "limit", required = false) String limit,
                              @RequestParam(name = "after", required = false) String after,
                              @RequestParam(name = "before", required = false) String before){
        return royaleService.searchClans(name, locationId, minMembers, maxMembers, minScore, limit, after, before);
    }

    @GetMapping(value = "getClan")
    @ResponseBody
    public String getClan(@RequestParam(name = "clanTag") String clanTag){ return royaleService.getClan(clanTag); }

    @GetMapping(value = "clanMembers")
    @ResponseBody
    public String clanMembers(@RequestParam(name = "clanTag") String clanTag){ return royaleService.clanMembers(clanTag); }

    @GetMapping(value = "clanWarlog")
    @ResponseBody
    public String clanWarlog(@RequestParam(name = "clanTag") String clanTag){ return royaleService.clanWarlog(clanTag); }

    @GetMapping(value = "clanCurrentWar")
    @ResponseBody
    public String clanCurrentWar(@RequestParam(name = "clanTag") String clanTag){ return royaleService.clanCurrentWar(clanTag); }


    //Players
    @GetMapping(value = "getPlayer")
    @ResponseBody
    public String getPlayer(@RequestParam(name = "playerTag") String playerTag){ return royaleService.getPlayer(playerTag); }

    @GetMapping(value = "upcomingChests")
    @ResponseBody
    public String upcomingChests(@RequestParam(name = "playerTag") String playerTag){ return royaleService.upcomingChests(playerTag); }

    @GetMapping(value = "battleLog")
    @ResponseBody
    public String battleLog(@RequestParam(name = "playerTag") String playerTag){ return royaleService.battleLog(playerTag); }

    //Tournaments
    @GetMapping(value = "searchTournament")
    @ResponseBody
    public String searchTournament(){ return royaleService.searchTournaments(); }

    @GetMapping(value = "getTournament")
    @ResponseBody
    public String getTournament(@RequestParam(name = "tournamentId") String tournamentId){ return royaleService.getTournament(tournamentId); }

    //Locations
    @GetMapping(value = "listLocations")
    @ResponseBody
    public String listLocations(){ return royaleService.listLocations(); }

    @GetMapping(value = "getLocation")
    @ResponseBody
    public String getLocation(@RequestParam(name = "locationId") String locationId){ return royaleService.getLocation(locationId); }

    @GetMapping(value = "rankingClanLocation")
    @ResponseBody
    public String rankingClanLocation(@RequestParam(name = "locationId") String locationId){ return royaleService.rankingClanLocation(locationId); }

    @GetMapping(value = "rankingPlayerLocation")
    @ResponseBody
    public String rankingPlayerLocation(@RequestParam(name = "locationId") String locationId){ return royaleService.rankingPlayerLocation(locationId); }

    @GetMapping(value = "rankingWarLocation")
    @ResponseBody
    public String rankingWarLocation(@RequestParam(name = "locationId") String locationId){ return royaleService.rankingWarLocation(locationId); }

    @GetMapping(value = "rankingGlobalTournamentLocation")
    @ResponseBody
    public String rankingGlobalTournamentLocation(@RequestParam(name = "tournamentTag") String tournamentTag){ return royaleService.rankingGlobalTournamentLocation(tournamentTag); }

    @GetMapping(value = "getCards")
    @ResponseBody
    public String getCards(){ return royaleService.getCards(); }

    //Global Tournaments
    @GetMapping(value = "globalTournaments")
    @ResponseBody
    public String globalTournaments(){ return royaleService.globalTournaments(); }

}
