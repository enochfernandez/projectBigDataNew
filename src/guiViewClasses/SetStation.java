package guiViewClasses;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
 
@ManagedBean(name="setStation", eager=true)
public class SetStation {
         
    private String[] selectedCities;   
    private List<String> cities;
    public String favCoffee1;
	public String favCoffee2;
	public String favCoffee3;

	public String favCoffee1b;
	public String favCoffee2b;
	public String favCoffee3b;
	
	public String favCoffee1c;
	public String favCoffee2c;
	public String favCoffee3c;

	
	
    
    @PostConstruct
    public void init() {
        cities = new ArrayList<String>();
        cities.add("FR-7005-ABBEVILLE");
        cities.add("FR-7015-LILLE-LESQUIN");
        cities.add("FR-7027-CAEN-CARPIQUET");
        cities.add("FR-7110-BREST-GUIPAVAS");
        cities.add("FR-7130-RENNES-SAINT");
        cities.add("FR-7145-TRAPPES");
        cities.add("FR-7149-ORLY");
        cities.add("FR-7156-PARIS-MONTSOURIS");
        cities.add("FR-7168-TROYES-BARBEREY");
        cities.add("FR-7180-NANCY-ESSEY");
        cities.add("FR-7190-STRASBOURG-ENTZHEIM");
        cities.add("FR-7222-NANTES-BOUGUENAIS");
        cities.add("FR-7255-BOURGES");
        cities.add("FR-7299-BALE-MULHOUSE");
        cities.add("FR-7434-LIMOGES-BELLEGARDE");
        cities.add("FR-7497-BOURG");
        cities.add("FR-7510-BORDEAUX");
        cities.add("FR-7588-ST-AUBAN-SUR-DURANCE");
        cities.add("FR-7621-TARBES-OSSUN");
        cities.add("FR-7630-TOULOUSE");
        cities.add("FR-7643-MONTPELLIER");
        cities.add("FR-7645-NIMES-COURBESSAC");
        cities.add("FR-7650-MARIGNANE");
        cities.add("FR-7690-NICE");
        cities.add("FR-7747-PERPIGNAN");
        cities.add("NO-1025-TROMSO/LANGNES");
        cities.add("NO-1271-TRONDHEIM/VERNES");
        cities.add("NO-1384-OSLO/GARDERMOEN");
        cities.add("NO-1415-STAVANGER/SOLA");
        cities.add("NO-1452-KRISTIANSAND/KJEVIK");
        cities.add("NO-1492-OSLO-BLINDERN");
        cities.add("SE-2432-OREBRO");
        cities.add("SE-2611-HELSINGBORG");
        cities.add("UKIE-3769-CHARLWOOD");
        cities.add("DK-6030-FLYVESTATION");
        cities.add("DK-6070-AARHUS");
        cities.add("DK-6120-ODENSE");
        cities.add("DK-6180-KOEBENHAVNS");
        cities.add("NL-6240-AMSTERDAM");
        cities.add("NL-6260-DE");
        cities.add("NL-6280-GRONINGEN");
        cities.add("NL-6344-ROTTERDAM");
        cities.add("NL-6350-GILZE");
        cities.add("NL-6370-EINDHOVEN");
        cities.add("NL-6380-MAASTRICHT");
        cities.add("FR-7002-BOULOGNE");
        cities.add("FR-7028-CAP-DE-LA");
        cities.add("FR-7240-TOURS");
        cities.add("FR-7260-NEVERS-MARZY");
        cities.add("FR-7280-DIJON-LONGVIC");
        cities.add("FR-7460-CLERMONT-FERRAND");
        cities.add("FR-7481-LYON-ST");
        cities.add("FR-7579-ORANGE");
        cities.add("FR-7675-LE");
        cities.add("ESPT-8160-ZARAGOZA/AEROPUERTO");
        cities.add("ESPT-8391-SEVILLA/SAN");
        cities.add("DE-10281-TROLLENHAGEN");
        cities.add("DE-10471-LEIPZIG-HOLZHAUSEN");
        cities.add("DE-10516-KOBLENZ");
        cities.add("AT-11010-LINZ/HOERSCHING-FLUGHAFEN");
        cities.add("AT-11036-WIEN/SCHWECHAT-FLUGHAFEN");
        cities.add("AT-11120-INNSBRUCK-FLUGHAFEN");
        cities.add("AT-11150-SALZBURG-FLUGHAFEN");
        cities.add("AT-11231-KLAGENFURT-FLUGHAFEN");
        cities.add("AT-11240-GRAZ-THALERHOF-FLUGHAFEN");
        cities.add("SEE-12822-GYOR");
        cities.add("SEE-13168-NOVI");
        cities.add("SEE-13272-BEOGRAD/SURCIN");
        cities.add("SEE-13376-KRALJEVO");
        cities.add("SEE-13388-NIS");
        cities.add("SEE-13463-PODGORICA-GRAD");
        cities.add("SEE-13586-SKOPJE");
        cities.add("SEE-14014-LJUBLJANA/BRNIK");
        cities.add("SEE-14023-CELJE");
        cities.add("SEE-14026-MARIBOR/SLIVNICA");
        cities.add("SEE-14121-NOVO");
        cities.add("SEE-14241-ZAGREB/PLESO");
        cities.add("SEE-14280-OSIJEK-CEPIN");
        cities.add("SEE-14444-SPLIT/RESNIK");
        cities.add("SEE-14542-BANJA");
        cities.add("SEE-15614-SOFIA");
        cities.add("SEE-15655-BURGAS");
        cities.add("IT-16059-TORINO");
        cities.add("IT-16066-MILANO");
        cities.add("IT-16105-VENEZIA");
        cities.add("IT-16120-GENOVA/SESTRI");
        cities.add("IT-16170-FIRENZE");
        cities.add("IT-16242-ROMA/FIUMICINO");
        cities.add("IT-16270-BARI/PALESE");
        cities.add("IT-16289-NAPOLI/CAPODICHINO");
        cities.add("IT-16405-PALERMO");
        cities.add("IT-16459-CATANIA");
        cities.add("PL-12560-KATOWICE");
        cities.add("PL-12146--");
        cities.add("IT-16140-BOLOGNA/BORGO");
        cities.add("ESPT-8025-BILBAO/AEROPUERTO");
        cities.add("ESPT-8140-VALLADOLID/VILLANUBLA");
        cities.add("ESPT-8429-MURCIA/ALCANTARILLA");
        cities.add("SEE-14557-TUZLA");
        cities.add("DE-10381-BERLIN-DAHLEM");
        cities.add("LU-6590-LUXEMBOURG/LUXEMBOURG");
        cities.add("ESPT-8535-LISBOA/GEOF");
        cities.add("DE-10126-WITTMUNDHAVEN");
        cities.add("DE-10156-LUEBECK-BLANKENSEE");
        cities.add("DE-10348-BRAUNSCHWEIG");
        cities.add("DE-10739-STUTTGART/SCHNARRENBERG");
        cities.add("DE-10756-FEUCHTWANGEN-HEILBRONN");
        cities.add("DE-10860-INGOLSTADT");
        cities.add("SEE-14317-RIJEKA/OMISALJ");
        cities.add("DE-10129-BREMERHAVEN");
        cities.add("DE-10577-CHEMNITZ");
        cities.add("SEE-13615-TIRANA");
        cities.add("UKIE-3091-DYCE");
        cities.add("UKIE-3134-GLASGOW");
        cities.add("UKIE-3166-EDINBURGH");
        cities.add("UKIE-3266-LINTON-ON-OUSE");
        cities.add("UKIE-3535-COLESHILL");
        cities.add("UKIE-3628-FILTON");
        cities.add("UKIE-3772-HEATHROW");
        cities.add("UKIE-3853-YEOVILTON");
        cities.add("BE-6407-OOSTENDE");
        cities.add("BE-6450-ANTWERPEN/DEURNE");
        cities.add("ESPT-8221-MADRID/BARAJAS");
        cities.add("ESPT-8306-PALMA");
        cities.add("ESPT-8548-COIMBRA/CERNACHE");
        cities.add("ESPT-8554-FARO/AEROPORTO");
        cities.add("CZSK-11603-LIBEREC");
        cities.add("CZSK-11782-OSTRAVA/MOSNOV");
        cities.add("CZSK-11816-BRATISLAVA-LETISKO");
        cities.add("SE-2464-STOCKHOLM/BROMMA");
        cities.add("SE-2513-GOTEBORG");
        cities.add("SE-2550-JONKOPING/AXAMO");
        cities.add("SE-2562-LINKOPING/MALMSLATT");
        cities.add("SE-2635-MALMO");
        cities.add("UKIE-3238-ALBEMARLE");
        cities.add("UKIE-3313-RHYL");
        cities.add("UKIE-3321-HAWARDEN");
        cities.add("UKIE-3354-NOTTINGHAM");
        cities.add("UKIE-3590-WATTISHAM");
        cities.add("UKIE-3658-BENSON");
        cities.add("UKIE-3770-LONDON");
        cities.add("UKIE-3917-ALDERGROVE");
        cities.add("UKIE-3955-CORK");
        cities.add("UKIE-3962-SHANNON");
        cities.add("UKIE-3969-DUBLIN");
        cities.add("BE-6451-BRUSSELS");
        cities.add("BE-6478-BIERSET");
        cities.add("CH-6631-BERN");
        cities.add("CH-6670-ZUERICH");
        cities.add("CH-6700-GENEVE-COINTRIN");
        cities.add("ESPT-8181-BARCELONA/AEROPUERTO");
        cities.add("ESPT-8284-VALENCIA/AEROPUERTO");
        cities.add("ESPT-8360-ALICANTE/EL");
        cities.add("ESPT-8410-CORDOBA/AEROPUERTO");
        cities.add("ESPT-8482-MALAGA/AEROPUERTO");
        cities.add("DE-10044-LEUCHTTURM");
        cities.add("DE-10147-HAMBURG-FUHLSBUETTEL");
        cities.add("DE-10224-BREMEN");
        cities.add("DE-10338-HANNOVER");
        cities.add("DE-10379-POTSDAM");
        cities.add("DE-10400-DUESSELDORF");
        cities.add("DE-10488-DRESDEN-KLOTZSCHE");
        cities.add("DE-10496-COTTBUS");
        cities.add("DE-10548-MEININGEN");
        cities.add("DE-10554-ERFURT-WEIMAR");
        cities.add("DE-10609-TRIER-PETRISBERG");
        cities.add("DE-10637-FRANKFURT/MAIN");
        cities.add("DE-10655-WUERZBURG");
        cities.add("DE-10776-REGENSBURG");
        cities.add("DE-10852-AUGSBURG");
        cities.add("DE-10870-MUENCHEN-FLUGHAFEN");
        cities.add("CZSK-11450-PLZEN-MIKULKA");
        cities.add("CZSK-11518-PRAHA/RUZYNE");
        cities.add("CZSK-11546-C.");
        cities.add("CZSK-11652-PARDUBICE");
        cities.add("CZSK-11723-BRNO/TURANY");
        cities.add("CZSK-11968-KOSICE");
        cities.add("PL-12205-SZCZECIN");
        cities.add("PL-12330-POZNAN");
        cities.add("PL-12375-WARSZAWA-OKECIE");
        cities.add("PL-12424-WROCLAW");
        cities.add("PL-12465-LODZ");
        cities.add("PL-12495-LUBLIN");
        cities.add("PL-12566-KRAKOW-BALICE");
        cities.add("SEE-12772-MISKOLC");
        cities.add("SEE-12843-BUDAPEST/PESTSZENTLORINC");
        cities.add("SEE-12882-DEBRECEN");
        cities.add("SEE-12942-PECS/POGANY");
        cities.add("SEE-12982-SZEGED");
        cities.add("SEE-15090-IASI");
        cities.add("SEE-15120-CLUJ-NAPOCA");
        cities.add("SEE-15310-GALATI");
        cities.add("SEE-15420-BUCURESTI");
        cities.add("SEE-15450-CRAIOVA");
        cities.add("SEE-15480-CONSTANTA");
        cities.add("IT-16261-AMENDOLA");
        cities.add("SEE-14654-SARAJEVO-BJELAVE");
        cities.add("DE-10130-ELPERSBUETTEL");
        cities.add("UKIE-3351-ROSTHERNE");
        cities.add("SE-2458-UPPSALA");
        cities.add("ESPT-8545-PORTO/PEDRAS");

    }
 
  //Generated by Map
  	private static Map<String,Object> coffee2Value;
  	static{
  		coffee2Value = new LinkedHashMap<String,Object>();
  		coffee2Value.put("Set Selection","Set Selection");
  		coffee2Value.put("Clear;fog","Clear;fog");
  		coffee2Value.put("Cloudy","Cloudy");
  		coffee2Value.put("mist","mist");
  		coffee2Value.put("Clear;mist","Clear;mist");
  		coffee2Value.put("Clear","Clear");
  		coffee2Value.put("Overcast","Overcast");
  		coffee2Value.put("rime","rime");
  		coffee2Value.put("Overcast;rime","Overcast;rime");
  		coffee2Value.put("Overcast;snow","Overcast;snow");
  		coffee2Value.put("rain","rain");
  		coffee2Value.put("Overcast;fog","Overcast;fog");
  		coffee2Value.put("Overcast;rain_showers","Overcast;rain_showers");
  		coffee2Value.put("fog","fog");
  		coffee2Value.put("Overcast;mist","Overcast;mist");
  		coffee2Value.put("Overcast;smoke","Overcast;smoke");
  		coffee2Value.put("Few_clouds;mist","Few_clouds;mist");
  		coffee2Value.put("Scattered_clouds","Scattered_clouds");
  		coffee2Value.put("Cloudy;fog","Cloudy;fog");
  		coffee2Value.put("Cloudy;mist","Cloudy;mist");
  		coffee2Value.put("Few_clouds","Few_clouds");
  		coffee2Value.put("Overcast;rain","Overcast;rain");
  		coffee2Value.put("Cloudy;rime","Cloudy;rime");
  		coffee2Value.put("Scattered_clouds;mist","Scattered_clouds;mist");
  		coffee2Value.put("Clear;shallow_fog","Clear;shallow_fog");
  		coffee2Value.put("Overcast;drizzle","Overcast;drizzle");
  		coffee2Value.put("Scattered_clouds;precipitation","Scattered_clouds;precipitation");
  		coffee2Value.put("drizzle","drizzle");
  		coffee2Value.put("haze_or_smoke","haze_or_smoke");
  		coffee2Value.put("Cloudy;snow","Cloudy;snow");
  		coffee2Value.put("Scattered_clouds;fog","Scattered_clouds;fog");
  		coffee2Value.put("rain_showers","rain_showers");
  		coffee2Value.put("Few_clouds;rain","Few_clouds;rain");
  		coffee2Value.put("precipitation","precipitation");
  		coffee2Value.put("Cloudy;rain","Cloudy;rain");
  		coffee2Value.put("Clear;haze_or_smoke","Clear;haze_or_smoke");
  		coffee2Value.put("Overcast;rain_and_snow","Overcast;rain_and_snow");
  		coffee2Value.put("Overcast;snow_grains","Overcast;snow_grains");
  		coffee2Value.put("Overcast;freezing_rain","Overcast;freezing_rain");
  		coffee2Value.put("Few_clouds;haze","Few_clouds;haze");
  		coffee2Value.put("Overcast;distant_precipitation","Overcast;distant_precipitation");
  		coffee2Value.put("Scattered_clouds;rime","Scattered_clouds;rime");
  		coffee2Value.put("Few_clouds;drizzle","Few_clouds;drizzle");
  		coffee2Value.put("Scattered_clouds;rain","Scattered_clouds;rain");
  		coffee2Value.put("Cloudy;freezing_rain","Cloudy;freezing_rain");
  		coffee2Value.put("Cloudy;rain_showers","Cloudy;rain_showers");
  		coffee2Value.put("Cloudy;precipitation","Cloudy;precipitation");
  		coffee2Value.put("Few_clouds;rain_showers","Few_clouds;rain_showers");
  		coffee2Value.put("Overcast;precipitation","Overcast;precipitation");
  		coffee2Value.put("showers","showers");
  		coffee2Value.put("Cloudy;drizzle","Cloudy;drizzle");
  		coffee2Value.put("Cloudy;freezing_rain/drizzle","Cloudy;freezing_rain/drizzle");
  		coffee2Value.put("Scattered_clouds;shallow_fog","Scattered_clouds;shallow_fog");
  		coffee2Value.put("Cloudy;shallow_fog","Cloudy;shallow_fog");
  		coffee2Value.put("Overcast;freezing_rain/drizzle","Overcast;freezing_rain/drizzle");
  		coffee2Value.put("Cloudy;haze","Cloudy;haze");
  		coffee2Value.put("Cloudy;snow_showers","Cloudy;snow_showers");
  		coffee2Value.put("snow","snow");
  		coffee2Value.put("Cloudy;distant_precipitation","Cloudy;distant_precipitation");
  		coffee2Value.put("Scattered_clouds;precipitation_within_sight","Scattered_clouds;precipitation_within_sight");
  		coffee2Value.put("Scattered_clouds;rain_showers","Scattered_clouds;rain_showers");
  		coffee2Value.put("Scattered_clouds;distant_precipitation","Scattered_clouds;distant_precipitation");
  		coffee2Value.put("ice_grains","ice_grains");
  		coffee2Value.put("Overcast;nearby_precipitation","Overcast;nearby_precipitation");
  		coffee2Value.put("Few_clouds;fog","Few_clouds;fog");
  		coffee2Value.put("Cloudy;hail_showers","Cloudy;hail_showers");
  		coffee2Value.put("Overcast;ice_pellets","Overcast;ice_pellets");
  		coffee2Value.put("Few_clouds;precipitation","Few_clouds;precipitation");
  		coffee2Value.put("Few_clouds;shallow_fog","Few_clouds;shallow_fog");
  		coffee2Value.put("Scattered_clouds;hail_showers","Scattered_clouds;hail_showers");
  		coffee2Value.put("Scattered_clouds;snow","Scattered_clouds;snow");
  		coffee2Value.put("Cloudy;rain_and_snow_showers","Cloudy;rain_and_snow_showers");
  		coffee2Value.put("Clear;rime","Clear;rime");
  		coffee2Value.put("Cloudy;showers","Cloudy;showers");
  		coffee2Value.put("Overcast;rain_and_snow_showers","Overcast;rain_and_snow_showers");
  		coffee2Value.put("Cloudy;precipitation_within_sight","Cloudy;precipitation_within_sight");
  		coffee2Value.put("Clear;haze","Clear;haze");
  		coffee2Value.put("Overcast;precipitation_within_sight","Overcast;precipitation_within_sight");
  		coffee2Value.put("Cloudy;snow_grains","Cloudy;snow_grains");
  		coffee2Value.put("Clear;snow","Clear;snow");
  		coffee2Value.put("Cloudy;rain_and_snow","Cloudy;rain_and_snow");
  		coffee2Value.put("Cloudy;ice_grains","Cloudy;ice_grains");
  		coffee2Value.put("Overcast;ice_grains","Overcast;ice_grains");
  		coffee2Value.put("Overcast;snow_crystals","Overcast;snow_crystals");
  		coffee2Value.put("Overcast;snow_showers","Overcast;snow_showers");
  		coffee2Value.put("Scattered_clouds;drizzle","Scattered_clouds;drizzle");
  		coffee2Value.put("snow_showers","snow_showers");
  		coffee2Value.put("Few_clouds;continuous_shallow_fog","Few_clouds;continuous_shallow_fog");
  		coffee2Value.put("Clear;rain","Clear;rain");
  		coffee2Value.put("Few_clouds;snow_showers","Few_clouds;snow_showers");
  		coffee2Value.put("Few_clouds;showers","Few_clouds;showers");
  		coffee2Value.put("Scattered_clouds;snow_showers","Scattered_clouds;snow_showers");
  		coffee2Value.put("snow_grains","snow_grains");
  		coffee2Value.put("Few_clouds;hail_showers","Few_clouds;hail_showers");
  		coffee2Value.put("Cloudy;nearby_precipitation","Cloudy;nearby_precipitation");
  		coffee2Value.put("Cloudy;thunderstorm_no_precipitation","Cloudy;thunderstorm_no_precipitation");
  		coffee2Value.put("Cloudy;snow_crystals","Cloudy;snow_crystals");
  		coffee2Value.put("Few_clouds;rime","Few_clouds;rime");
  		coffee2Value.put("Cloudy;ice_pellet_showers","Cloudy;ice_pellet_showers");
  		coffee2Value.put("Clear;smoke","Clear;smoke");
  		coffee2Value.put("Clear;continuous_shallow_fog","Clear;continuous_shallow_fog");
  		coffee2Value.put("Scattered_clouds;continuous_shallow_fog","Scattered_clouds;continuous_shallow_fog");
  		coffee2Value.put("Few_clouds;drifting_snow","Few_clouds;drifting_snow");
  		coffee2Value.put("Cloudy;drifting_snow","Cloudy;drifting_snow");
  		coffee2Value.put("Overcast;showers","Overcast;showers");
  		coffee2Value.put("Clear;rain_showers","Clear;rain_showers");
  		coffee2Value.put("Overcast;drifting_snow","Overcast;drifting_snow");
  		coffee2Value.put("Scattered_clouds;drifting_snow","Scattered_clouds;drifting_snow");
  		coffee2Value.put("Overcast;haze","Overcast;haze");
  		coffee2Value.put("Clear;drizzle","Clear;drizzle");
  		coffee2Value.put("Scattered_clouds;showers","Scattered_clouds;showers");
  		coffee2Value.put("Cloudy;ice_pellets","Cloudy;ice_pellets");
  		coffee2Value.put("Overcast;thunderstorm","Overcast;thunderstorm");
  		coffee2Value.put("Cloudy;rain;previous_thunderstorm","Cloudy;rain;previous_thunderstorm");
  		coffee2Value.put("Overcast;thunderstorm_no_precipitation","Overcast;thunderstorm_no_precipitation");
  		coffee2Value.put("Cloudy;thunderstorm","Cloudy;thunderstorm");
  		coffee2Value.put("Overcast;hail_showers","Overcast;hail_showers");
  		coffee2Value.put("Overcast;shallow_fog","Overcast;shallow_fog");
  		coffee2Value.put("Cloudy;continuous_shallow_fog","Cloudy;continuous_shallow_fog");
  		coffee2Value.put("Overcast;haze_or_smoke","Overcast;haze_or_smoke");
  		coffee2Value.put("Clear;snow_showers","Clear;snow_showers");
  		coffee2Value.put("Clear;precipitation","Clear;precipitation");
  		coffee2Value.put("Few_clouds;snow","Few_clouds;snow");
  		coffee2Value.put("Cloudy;thunderstorms","Cloudy;thunderstorms");
  		coffee2Value.put("Overcast;thunderstorm;hail","Overcast;thunderstorm;hail");
  		coffee2Value.put("Overcast;ice_pellet_showers","Overcast;ice_pellet_showers");
  		coffee2Value.put("Overcast;rain;previous_thunderstorm","Overcast;rain;previous_thunderstorm");
  		coffee2Value.put("freezing_rain/drizzle","freezing_rain/drizzle");
  		coffee2Value.put("Scattered_clouds;thunderstorms","Scattered_clouds;thunderstorms");
  		coffee2Value.put("Overcast;ice_crystals","Overcast;ice_crystals");
  		coffee2Value.put("Cloudy;snow_or_rain/snow_mix;previous_thunderstorm","Cloudy;snow_or_rain/snow_mix;previous_thunderstorm");
  		coffee2Value.put("Few_clouds;thunderstorms","Few_clouds;thunderstorms");
  		coffee2Value.put("Cloudy;lightning","Cloudy;lightning");
  		coffee2Value.put("Few_clouds;precipitation_within_sight","Few_clouds;precipitation_within_sight");
  		coffee2Value.put("Cloudy;thunderstorm;hail","Cloudy;thunderstorm;hail");
  		coffee2Value.put("Overcast;thunderstorms","Overcast;thunderstorms");
  		coffee2Value.put("Scattered_clouds;freezing_rain/drizzle","Scattered_clouds;freezing_rain/drizzle");
  		coffee2Value.put("Cloudy;haze_or_smoke","Cloudy;haze_or_smoke");
  		coffee2Value.put("Scattered_clouds;lightning","Scattered_clouds;lightning");
  		coffee2Value.put("Few_clouds;lightning","Few_clouds;lightning");
  		coffee2Value.put("Scattered_clouds;haze","Scattered_clouds;haze");
  		coffee2Value.put("rain_and_snow","rain_and_snow");
  		coffee2Value.put("Few_clouds;freezing_rain/drizzle","Few_clouds;freezing_rain/drizzle");
  		coffee2Value.put("Scattered_clouds;freezing_rain","Scattered_clouds;freezing_rain");
  		coffee2Value.put("Few_clouds;rain_and_snow","Few_clouds;rain_and_snow");
  		coffee2Value.put("Overcast;continuous_shallow_fog","Overcast;continuous_shallow_fog");
  		coffee2Value.put("Clear;showers","Clear;showers");
  		coffee2Value.put("Few_clouds;distant_precipitation","Few_clouds;distant_precipitation");
  		coffee2Value.put("Scattered_clouds;rain_and_snow","Scattered_clouds;rain_and_snow");
  		coffee2Value.put("Scattered_clouds;rain_and_snow_showers","Scattered_clouds;rain_and_snow_showers");
  		coffee2Value.put("Cloudy;squalls","Cloudy;squalls");
  		coffee2Value.put("Cloudy;dust","Cloudy;dust");
  		coffee2Value.put("Overcast;squalls","Overcast;squalls");
  		coffee2Value.put("Scattered_clouds;ice_pellet_showers","Scattered_clouds;ice_pellet_showers");
  		coffee2Value.put("Cloudy;smoke","Cloudy;smoke");
  		coffee2Value.put("Clear;freezing_rain/drizzle","Clear;freezing_rain/drizzle");
  		coffee2Value.put("Scattered_clouds;thunderstorm","Scattered_clouds;thunderstorm");
  		coffee2Value.put("Scattered_clouds;snow_crystals","Scattered_clouds;snow_crystals");
  		coffee2Value.put("Scattered_clouds;ice_crystals","Scattered_clouds;ice_crystals");
  		coffee2Value.put("Scattered_clouds;haze_or_smoke","Scattered_clouds;haze_or_smoke");
  		coffee2Value.put("Clear;drifting_snow","Clear;drifting_snow");
  		coffee2Value.put("Clear;thunderstorm","Clear;thunderstorm");
  		coffee2Value.put("Few_clouds;haze_or_smoke","Few_clouds;haze_or_smoke");
  		coffee2Value.put("Overcast;dust_storm","Overcast;dust_storm");
  		coffee2Value.put("Few_clouds;snow_grains","Few_clouds;snow_grains");
  		coffee2Value.put("Overcast;dust","Overcast;dust");
  		coffee2Value.put("Overcast;lightning","Overcast;lightning");
  		coffee2Value.put("continuous_shallow_fog","continuous_shallow_fog");
  		coffee2Value.put("Scattered_clouds;nearby_precipitation","Scattered_clouds;nearby_precipitation");
  		coffee2Value.put("Few_clouds;dust","Few_clouds;dust");
  		coffee2Value.put("Scattered_clouds;dust","Scattered_clouds;dust");
  		coffee2Value.put("Overcast;funnel_clouds","Overcast;funnel_clouds");
  		coffee2Value.put("Few_clouds;nearby_precipitation","Few_clouds;nearby_precipitation");
  		coffee2Value.put("Cloudy;dust_storm","Cloudy;dust_storm");
  		coffee2Value.put("Scattered_clouds;dust_storm","Scattered_clouds;dust_storm");
  		coffee2Value.put("Clear;funnel_clouds","Clear;funnel_clouds");
  		coffee2Value.put("Few_clouds;funnel_clouds","Few_clouds;funnel_clouds");
  		coffee2Value.put("Cloudy;funnel_clouds","Cloudy;funnel_clouds");
  		coffee2Value.put("Scattered_clouds;thunderstorm_no_precipitation","Scattered_clouds;thunderstorm_no_precipitation");
  		coffee2Value.put("Few_clouds;smoke","Few_clouds;smoke");
  		coffee2Value.put("Few_clouds;ice_grains","Few_clouds;ice_grains");
  		coffee2Value.put("Cloudy;whirls","Cloudy;whirls");
  		coffee2Value.put("Cloudy;heavy_thunderstorm","Cloudy;heavy_thunderstorm");
  		coffee2Value.put("thunderstorm;hail","thunderstorm;hail");
  		coffee2Value.put("Scattered_clouds;whirls","Scattered_clouds;whirls");
  		coffee2Value.put("Overcast;hail","Overcast;hail");
  		coffee2Value.put("Cloudy;hail","Cloudy;hail");
  		coffee2Value.put("Few_clouds;thunderstorm","Few_clouds;thunderstorm");
  		coffee2Value.put("Scattered_clouds;smoke","Scattered_clouds;smoke");
  		coffee2Value.put("Overcast;heavy_thunderstorm","Overcast;heavy_thunderstorm");
  		coffee2Value.put("Few_clouds;thunderstorm_no_precipitation","Few_clouds;thunderstorm_no_precipitation");
  		coffee2Value.put("Clear;lightning","Clear;lightning");
  		coffee2Value.put("Scattered_clouds;heavy_thunderstorm","Scattered_clouds;heavy_thunderstorm");
  		coffee2Value.put("Scattered_clouds;rain;previous_thunderstorm","Scattered_clouds;rain;previous_thunderstorm");
  		coffee2Value.put("Clear;rain_and_snow","Clear;rain_and_snow");
  		coffee2Value.put("dust_storm","dust_storm");
  		coffee2Value.put("Overcast;heavy_thunderstorm;hail","Overcast;heavy_thunderstorm;hail");
  		coffee2Value.put("Cloudy;duststorm","Cloudy;duststorm");
  		coffee2Value.put("Few_clouds;rain;previous_thunderstorm","Few_clouds;rain;previous_thunderstorm");
  		coffee2Value.put("Clear;dust_storm","Clear;dust_storm");
  		coffee2Value.put("thunderstorm_no_precipitation","thunderstorm_no_precipitation");
  		coffee2Value.put("haze","haze");
  		coffee2Value.put("Few_clouds;whirls","Few_clouds;whirls");
  		coffee2Value.put("Cloudy;heavy_thunderstorm;hail","Cloudy;heavy_thunderstorm;hail");
  		coffee2Value.put("Scattered_clouds;hail","Scattered_clouds;hail");
  		coffee2Value.put("shallow_fog","shallow_fog");
  		coffee2Value.put("Few_clouds;dust_storm","Few_clouds;dust_storm");
  		coffee2Value.put("Scattered_clouds;snow_grains","Scattered_clouds;snow_grains");
  		coffee2Value.put("smoke","smoke");

  		
  		//label, value
  			}

  	public Map<String,Object> getFavCoffee2Value() {
  		return coffee2Value;
  	}
    
	public String getFavCoffee1() {
		return favCoffee1;
	}

	public void setFavCoffee1(String favCoffee1) {
		this.favCoffee1 = favCoffee1;
	}

	public String getFavCoffee2() {
		return favCoffee2;
	}

	public void setFavCoffee2(String favCoffee2) {
		this.favCoffee2 = favCoffee2;
	}

	public String getFavCoffee3() {
		return favCoffee3;
	}

	public void setFavCoffee3(String favCoffee3) {
		this.favCoffee3 = favCoffee3;
	}    


	  //Generated by Map
	  	private static Map<String,Object> coffee2Valueb;
	  	static{
	  		coffee2Valueb = new LinkedHashMap<String,Object>();
	  		coffee2Valueb.put("Set Measurement","Set Measurement");
	  		coffee2Valueb.put("Humidity","Humidity");
	  		coffee2Valueb.put("Pressure","Pressure");
	  		coffee2Valueb.put("Temperature","Temperature");
	  		coffee2Valueb.put("WindDirection","WindDirection");
	  		coffee2Valueb.put("WindSpeed","WindSpeed");
	  		coffee2Valueb.put("CloudCover","CloudCover");
	  		coffee2Valueb.put("LowCloudCover","LowCloudCover");
	  		coffee2Valueb.put("Precipitation","Precipitation");
	  		coffee2Valueb.put("MediumCloudCover","MediumCloudCover");
	  		coffee2Valueb.put("MaxTemperature","MaxTemperature");
	  		coffee2Valueb.put("MinTemperature","MinTemperature");
	  		coffee2Valueb.put("HighCloudCover","HighCloudCover");
	  	}
	  	public Map<String,Object> getFavCoffee2Valueb() {
	  		return coffee2Valueb;
	  	}
	    
		public String getFavCoffee1b() {
			return favCoffee1b;
		}

		public void setFavCoffee1b(String favCoffee1) {
			this.favCoffee1b = favCoffee1;
		}

		public String getFavCoffee2b() {
			return favCoffee2b;
		}

		public void setFavCoffee2b(String favCoffee2) {
			this.favCoffee2b = favCoffee2;
		}

		public String getFavCoffee3b() {
			return favCoffee3b;
		}

		public void setFavCoffee3b(String favCoffee3) {
			this.favCoffee3b = favCoffee3;
		}    

		//Generated by Map
	  	private static Map<String,Object> coffee2Valuec;
	  	static{
	  		coffee2Valuec = new LinkedHashMap<String,Object>();
	  		coffee2Valuec.put("Set Measurement","Set Measurement");
	  		coffee2Valuec.put("Humidity","Humidity");
	  		coffee2Valuec.put("Pressure","Pressure");
	  		coffee2Valuec.put("Temperature","Temperature");
	  		coffee2Valuec.put("WindDirection","WindDirection");
	  		coffee2Valuec.put("WindSpeed","WindSpeed");
	  		coffee2Valuec.put("CloudCover","CloudCover");
	  		coffee2Valuec.put("LowCloudCover","LowCloudCover");
	  		coffee2Valuec.put("Precipitation","Precipitation");
	  		coffee2Valuec.put("MediumCloudCover","MediumCloudCover");
	  		coffee2Valuec.put("MaxTemperature","MaxTemperature");
	  		coffee2Valuec.put("MinTemperature","MinTemperature");
	  		coffee2Valuec.put("HighCloudCover","HighCloudCover");
	  	}
	  	public Map<String,Object> getFavCoffee2Valuec() {
	  		return coffee2Valuec;
	  	}
	    
		public String getFavCoffee1c() {
			return favCoffee1c;
		}

		public void setFavCoffee1c(String favCoffee1) {
			this.favCoffee1c = favCoffee1;
		}

		public String getFavCoffee2c() {
			return favCoffee2c;
		}

		public void setFavCoffee2c(String favCoffee2) {
			this.favCoffee2c = favCoffee2;
		}

		public String getFavCoffee3c() {
			return favCoffee3c;
		}

		public void setFavCoffee3c(String favCoffee3) {
			this.favCoffee3c = favCoffee3;
		}    

	
	//*******************************************************************************************
	public String[] getSelectedCities() {
        return selectedCities;
    }
 
    public void setSelectedCities(String[] selectedCities) {
        this.selectedCities = selectedCities;
    }
 
    public List<String> getCities() {
        return cities;
    }
}