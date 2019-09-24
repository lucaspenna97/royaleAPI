package com.clashroyale.RoyaleConsulta;

public interface Constantes {

    String TOKEN = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiIsImtpZCI6IjI4YTMxOGY3LTAwMDAtYTFlYi03ZmExLTJjNzQzM2M2Y2NhNSJ9.eyJpc3MiOiJzdXBlcmNlbGwiLCJhdWQiOiJzdXBlcmNlbGw6Z2FtZWFwaSIsImp0aSI6IjNkNDQ0MDAwLWVkMTgtNGY0MS1iMWEzLTc5MWYwNTBkZjUyNCIsImlhdCI6MTU2OTMyNzY2Nywic3ViIjoiZGV2ZWxvcGVyL2FlMjgyYTZiLWM5NDQtZDYzNi03YzljLWE2ZDYxOThmMTE0OCIsInNjb3BlcyI6WyJyb3lhbGUiXSwibGltaXRzIjpbeyJ0aWVyIjoiZGV2ZWxvcGVyL3NpbHZlciIsInR5cGUiOiJ0aHJvdHRsaW5nIn0seyJjaWRycyI6WyIxMzguOTQuMTE1LjEzMCJdLCJ0eXBlIjoiY2xpZW50In1dfQ.mzwdDq7_jtB6qGj_VzdgbYsowuZSie6gvDYYqI5-lIqkkiAPsdAsK7Q9AQ8gKgN7YsfJF9ZnyzjA13rkvL656g";
    String BASE_URL = "https://api.clashroyale.com/v1";

    //Clans
    static String searchClans (String name, String locationId, String minMembers, String maxMembers, String minScore, String limit, String after, String before) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/clans?");

        int contador = 0;

        if (name != null && !name.isEmpty()) contador++;

        if (locationId != null && !locationId.isEmpty()) contador++;

        if (minMembers != null && !minMembers.isEmpty()) contador++;

        if (maxMembers != null && !maxMembers.isEmpty()) contador++;

        if (minScore != null && !minScore.isEmpty()) contador++;

        if (limit != null && !limit.isEmpty()) contador++;

        if (after != null && !after.isEmpty()) contador++;

        if (before != null && !before.isEmpty()) contador++;

        contador = contador - 1;

        if (name != null && !name.isEmpty()) stringBuilder.append("name=").append(name);
        if (contador > 0) { stringBuilder.append("&"); contador--; }

        if (locationId != null && !locationId.isEmpty()) stringBuilder.append("locationId=").append(locationId);
        if (contador > 0) { stringBuilder.append("&"); contador--; }

        if (minMembers != null && !minMembers.isEmpty()) stringBuilder.append("minMembers=").append(minMembers);
        if (contador > 0) { stringBuilder.append("&"); contador--; }

        if (maxMembers != null && !maxMembers.isEmpty()) stringBuilder.append("maxMembers=").append(maxMembers);
        if (contador > 0) { stringBuilder.append("&"); contador--; }

        if (minScore != null && !minScore.isEmpty()) stringBuilder.append("minScore=").append(minScore);
        if (contador > 0) { stringBuilder.append("&"); contador--; }

        if (limit != null && !limit.isEmpty()) stringBuilder.append("limit=").append(limit);
        if (contador > 0) { stringBuilder.append("&"); contador--; }

        if (after != null && !after.isEmpty()) stringBuilder.append("after=").append(after);
        if (contador > 0) { stringBuilder.append("&"); contador--; }

        if (before != null && !before.isEmpty()) stringBuilder.append("before=").append(before);
        if (contador > 0) { stringBuilder.append("&"); contador--; }

        return stringBuilder.toString();
    }

    static String getClan (String clanTag) { return "/clans/%23" + clanTag.toUpperCase() ; }
    static String clanMembers (String clanTag) { return "/clans/%23" + clanTag.toUpperCase() + "/members" ; }
    static String clanWarlog (String clanTag) { return "/clans/%23" + clanTag.toUpperCase() + "/warlog"; }
    static String clanCurrentWar (String clanTag) { return "/clans/%23" + clanTag.toUpperCase() + "/currentwar"; }

    //Players
    static String getPlayer (String playerTag) { return "/players/%23" + playerTag.toUpperCase() ; }
    static String upcomingChests (String playerTag) { return "/players/%23" + playerTag.toUpperCase() + "/upcomingchests" ; }
    static String battleLog (String playerTag) { return "/players/%23" + playerTag.toUpperCase() + "/battlelog"; }

    //Tournaments
    static String searchTournament () { return "/tournaments"; }
    static String getTournament (String tournamentTag) { return "/tournaments/%23" + tournamentTag.toUpperCase() ; }

    //Locations
    static String listLocations () { return "/locations"; }
    static String getLocation (String locationId) { return "/locations/%23" + locationId.toUpperCase(); }
    static String rankingClanLocation (String locationId) { return "/locations/%23" + locationId.toUpperCase() + "/rankings/clans"; }
    static String rankingPlayerLocation (String locationId) { return "/locations/%23" + locationId.toUpperCase() + "/rankings/players"; }
    static String rankingWarLocation (String locationId) { return "/locations/%23" + locationId.toUpperCase() + "/ranking/clanwars"; }
    static String rankingGlobalTournamentLocation (String tournamentTag) { return "/locations/global/rankings/tournaments/%23" + tournamentTag.toUpperCase(); }
    static String cards () { return "/cards"; }

    //Global Tournaments
    static String globalTournaments () { return "/globaltournaments"; }













}
