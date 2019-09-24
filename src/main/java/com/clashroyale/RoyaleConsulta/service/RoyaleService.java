package com.clashroyale.RoyaleConsulta.service;

import com.clashroyale.RoyaleConsulta.Constantes;
import org.springframework.stereotype.Service;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.http.HttpHeaders;

@Service
public class RoyaleService {

    //Clans
    public String searchClans (String name, String locationId, String minMembers, String maxMembers, String minScore, String limit, String after, String before) {
        try {
            URL url = new URL(Constantes.BASE_URL + Constantes.searchClans(name, locationId, minMembers, maxMembers, minScore, limit, after, before));

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Authorization", "Bearer " + Constantes.TOKEN );

            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(httpURLConnection.getInputStream())));
                return bufferedReader.readLine();
            } else {
                return validateHttpResponseError(responseCode);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao consultar Clash Royale API";
        }
    }

    public String getClan (String clanTag) {
        try {
            URL url = new URL(Constantes.BASE_URL + Constantes.getClan(clanTag));

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Authorization", "Bearer " + Constantes.TOKEN );

            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(httpURLConnection.getInputStream())));
                return bufferedReader.readLine();
            } else {
                return validateHttpResponseError(responseCode);
            }

        } catch (Exception e){
            e.printStackTrace();
            return "Erro ao consultar Clash Royale API";
        }
    }

    public String clanMembers (String clanTag) {
        try {
            URL url = new URL(Constantes.BASE_URL + Constantes.clanMembers(clanTag));

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Authorization", "Bearer " + Constantes.TOKEN );

            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(httpURLConnection.getInputStream())));
                return bufferedReader.readLine();
            } else {
                return validateHttpResponseError(responseCode);
            }

        } catch (Exception e){
            e.printStackTrace();
            return "Erro ao consultar Clash Royale API";
        }
    }

    public String clanWarlog (String clanTag) {
        try {
            URL url = new URL(Constantes.BASE_URL + Constantes.clanWarlog(clanTag));

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Authorization", "Bearer " + Constantes.TOKEN );

            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(httpURLConnection.getInputStream())));
                return bufferedReader.readLine();
            } else {
                return validateHttpResponseError(responseCode);
            }

        } catch (Exception e){
            e.printStackTrace();
            return "Erro ao consultar Clash Royale API";
        }
    }

    public String clanCurrentWar (String clanTag) {
        try {
            URL url = new URL(Constantes.BASE_URL + Constantes.clanCurrentWar(clanTag));

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Authorization", "Bearer " + Constantes.TOKEN );

            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(httpURLConnection.getInputStream())));
                return bufferedReader.readLine();
            } else {
                return validateHttpResponseError(responseCode);
            }

        } catch (Exception e){
            e.printStackTrace();
            return "Erro ao consultar Clash Royale API";
        }
    }

    //Players
    public String getPlayer (String playerTag) {
        try {
            URL url = new URL(Constantes.BASE_URL + Constantes.getPlayer(playerTag));

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Authorization", "Bearer " + Constantes.TOKEN );

            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(httpURLConnection.getInputStream())));
                return bufferedReader.readLine();
            } else {
                return validateHttpResponseError(responseCode);
            }

        } catch (Exception e){
            e.printStackTrace();
            return "Erro ao consultar Clash Royale API";
        }
    }

    public String upcomingChests (String playerTag) {
        try {
            URL url = new URL(Constantes.BASE_URL + Constantes.upcomingChests(playerTag));

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Authorization", "Bearer " + Constantes.TOKEN );

            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(httpURLConnection.getInputStream())));
                return bufferedReader.readLine();
            } else {
                return validateHttpResponseError(responseCode);
            }

        } catch (Exception e){
            e.printStackTrace();
            return "Erro ao consultar Clash Royale API";
        }
    }

    public String battleLog (String playerTag) {
        try {
            URL url = new URL(Constantes.BASE_URL + Constantes.battleLog(playerTag));

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Authorization", "Bearer " + Constantes.TOKEN );

            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(httpURLConnection.getInputStream())));
                return bufferedReader.readLine();
            } else {
                return validateHttpResponseError(responseCode);
            }

        } catch (Exception e){
            e.printStackTrace();
            return "Erro ao consultar Clash Royale API";
        }
    }

    //Tournaments
    public String searchTournaments () {
        try {
            URL url = new URL(Constantes.BASE_URL + Constantes.searchTournament());

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Authorization", "Bearer " + Constantes.TOKEN );

            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(httpURLConnection.getInputStream())));
                return bufferedReader.readLine();
            } else {
                return validateHttpResponseError(responseCode);
            }

        } catch (Exception e){
            e.printStackTrace();
            return "Erro ao consultar Clash Royale API";
        }
    }

    public String getTournament (String tournamentTag) {
        try {
            URL url = new URL(Constantes.BASE_URL + Constantes.getTournament(tournamentTag));

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Authorization", "Bearer " + Constantes.TOKEN );

            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(httpURLConnection.getInputStream())));
                return bufferedReader.readLine();
            } else {
                return validateHttpResponseError(responseCode);
            }

        } catch (Exception e){
            e.printStackTrace();
            return "Erro ao consultar Clash Royale API";
        }
    }

    //Locations
    public String listLocations () {
        try {
            URL url = new URL(Constantes.BASE_URL + Constantes.listLocations());

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Authorization", "Bearer " + Constantes.TOKEN );

            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(httpURLConnection.getInputStream())));
                return bufferedReader.readLine();
            } else {
                return validateHttpResponseError(responseCode);
            }

        } catch (Exception e){
            e.printStackTrace();
            return "Erro ao consultar Clash Royale API";
        }
    }

    public String getLocation (String locationId) {
        try {
            URL url = new URL(Constantes.BASE_URL + Constantes.getLocation(locationId));

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Authorization", "Bearer " + Constantes.TOKEN );

            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(httpURLConnection.getInputStream())));
                return bufferedReader.readLine();
            } else {
                return validateHttpResponseError(responseCode);
            }

        } catch (Exception e){
            e.printStackTrace();
            return "Erro ao consultar Clash Royale API";
        }
    }

    public String rankingClanLocation (String locationId) {
        try {
            URL url = new URL(Constantes.BASE_URL + Constantes.rankingClanLocation(locationId));

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Authorization", "Bearer " + Constantes.TOKEN );

            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(httpURLConnection.getInputStream())));
                return bufferedReader.readLine();
            } else {
                return validateHttpResponseError(responseCode);
            }

        } catch (Exception e){
            e.printStackTrace();
            return "Erro ao consultar Clash Royale API";
        }
    }

    public String rankingPlayerLocation (String locationId) {
        try {
            URL url = new URL(Constantes.BASE_URL + Constantes.rankingPlayerLocation(locationId));

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Authorization", "Bearer " + Constantes.TOKEN );

            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(httpURLConnection.getInputStream())));
                return bufferedReader.readLine();
            } else {
                return validateHttpResponseError(responseCode);
            }

        } catch (Exception e){
            e.printStackTrace();
            return "Erro ao consultar Clash Royale API";
        }
    }

    public String rankingWarLocation (String locationId) {
        try {
            URL url = new URL(Constantes.BASE_URL + Constantes.rankingWarLocation(locationId));

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Authorization", "Bearer " + Constantes.TOKEN );

            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(httpURLConnection.getInputStream())));
                return bufferedReader.readLine();
            } else {
                return validateHttpResponseError(responseCode);
            }

        } catch (Exception e){
            e.printStackTrace();
            return "Erro ao consultar Clash Royale API";
        }
    }

    public String rankingGlobalTournamentLocation (String tournamentTag) {
        try {
            URL url = new URL(Constantes.BASE_URL + Constantes.rankingGlobalTournamentLocation(tournamentTag));

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Authorization", "Bearer " + Constantes.TOKEN );

            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(httpURLConnection.getInputStream())));
                return bufferedReader.readLine();
            } else {
                return validateHttpResponseError(responseCode);
            }

        } catch (Exception e){
            e.printStackTrace();
            return "Erro ao consultar Clash Royale API";
        }
    }

    public String getCards () {
        try {
            URL url = new URL(Constantes.BASE_URL + Constantes.cards());

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Authorization", "Bearer " + Constantes.TOKEN );

            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(httpURLConnection.getInputStream())));
                return bufferedReader.readLine();
            } else {
                return validateHttpResponseError(responseCode);
            }

        } catch (Exception e){
            e.printStackTrace();
            return "Erro ao consultar Clash Royale API";
        }
    }

    //Global Tournaments
    public String globalTournaments () {
        try {
            URL url = new URL(Constantes.BASE_URL + Constantes.globalTournaments());

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Authorization", "Bearer " + Constantes.TOKEN );

            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(httpURLConnection.getInputStream())));
                return bufferedReader.readLine();
            } else {
                return validateHttpResponseError(responseCode);
            }

        } catch (Exception e){
            e.printStackTrace();
            return "Erro ao consultar Clash Royale API";
        }
    }


    private static String validateHttpResponseError (int responseCode) {

        try {

            if (responseCode == 400) return "O cliente forneceu parâmetros incorretos a solicitação.";
            if (responseCode == 403) return "Acesso negado. Por credenciais incorretas/faltantes ou o token da API não garante acesso ao recurso solicitado.";
            if (responseCode == 404) return "Recurso não encontrado.";
            if (responseCode == 429) return "A solicitação foi regulada, porque a quantidade de solicitações estava acima do limite definido para o token da API usado.";
            if (responseCode == 500) return "Um erro desconhecido aconteceu quando processavamos a solicitação.";
            if (responseCode == 503) return "Serviço temporariamento indisponível por causa de manutenção.";

        } catch (Exception e) {
            System.err.println("Erro ao validar código http.");
            e.getMessage();
        }

        return "Ops.. :( Algo deu errado, por favor tente novamente.";
    }





}
