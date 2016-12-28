package guiViewClasses;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
 
@ManagedBean
@ViewScoped
public class DropdownView implements Serializable {
     
    private Map<String,Map<String,String>> data = new HashMap<String, Map<String,String>>();
    private String country; 
    private String city;  
    private Map<String,String> countries;
    private Map<String,String> cities;
     
    @PostConstruct
    public void init() {
        countries  = new HashMap<String, String>();
        countries.put("Belgium", "Belgium");
        countries.put("Germany", "Germany");
        countries.put("France", "France");
        countries.put("Netherlands", "Netherlands");
         
        Map<String,String> map = new HashMap<String, String>();
       
        
        map.put("Amercoeur_1_R_GT", "Amercoeur_1_R_GT");
        map.put("Amercoeur_1_R_ST", "Amercoeur_1_R_ST");
        map.put("Belwind_Phase_1", "Belwind_Phase_1");
        map.put("COO_1_T", "COO_1_T");
        map.put("COO_2_T", "COO_2_T");
        map.put("COO_3_T", "COO_3_T");
        map.put("COO_4_T", "COO_4_T");
        map.put("COO_5_T", "COO_5_T");
        map.put("COO_6_T", "COO_6_T");
        map.put("DOEL_1", "DOEL_1");
        map.put("DOEL_2", "DOEL_2");
        map.put("DOEL_3", "DOEL_3");
        map.put("DOEL_4", "DOEL_4");
        map.put("DROGENBOS_GT1", "DROGENBOS_GT1");
        map.put("DROGENBOS_GT2", "DROGENBOS_GT2");
        map.put("DROGENBOS_ST", "DROGENBOS_ST");
        map.put("ESCH-SUR-ALZETTE_STEG", "ESCH-SUR-ALZETTE_STEG");
        map.put("HERDERSBRUG_GT1", "HERDERSBRUG_GT1");
        map.put("HERDERSBRUG_GT2", "HERDERSBRUG_GT2");
        map.put("HERDERSBRUG_ST", "HERDERSBRUG_ST");
        map.put("INESCO_WKK", "INESCO_WKK");
        map.put("LANGERLO_1", "LANGERLO_1");
        map.put("LANGERLO_2", "LANGERLO_2");
        map.put("Marcinelle_Energie_(Carsid)", "Marcinelle_Energie_(Carsid)");
        map.put("Northwind", "Northwind");
        map.put("PLATE_TAILLE_T", "PLATE_TAILLE_T");
        map.put("RINGVAART_STEG", "RINGVAART_STEG");
        map.put("RODENHUIZE_4", "RODENHUIZE_4");
        map.put("SAINT-GHISLAIN_STEG", "SAINT-GHISLAIN_STEG");
        map.put("Scheldelaan_Exxonmobil", "Scheldelaan_Exxonmobil");
        map.put("T-power_Beringen", "T-power_Beringen");
        map.put("TIHANGE_1N", "TIHANGE_1N");
        map.put("TIHANGE_1S", "TIHANGE_1S");
        map.put("TIHANGE_2", "TIHANGE_2");
        map.put("TIHANGE_3", "TIHANGE_3");
        map.put("Thorntonbank_-_C-Power_-_Area_NE", "Thorntonbank_-_C-Power_-_Area_NE");
        map.put("Thorntonbank_-_C-Power_-_Area_SW", "Thorntonbank_-_C-Power_-_Area_SW");
        map.put("Zandvliet_Power", "Zandvliet_Power");
        map.put("Zelzate_2_Knippegroen", "Zelzate_2_Knippegroen");

        
        
        data.put("Belgium", map);
         
        
        map = new HashMap<String, String>();
        map.put("BERGKAMEN_A", "BERGKAMEN_A");
        map.put("BEXBACH_A_GESAMT", "BEXBACH_A_GESAMT");
        map.put("Block_1", "Block_1");
        map.put("Block_2", "Block_2");
        map.put("Block_3", "Block_3");
        map.put("Block_AGuD", "Block_AGuD");
        map.put("Block_B", "Block_B");
        map.put("Block_E", "Block_E");
        map.put("Block_F", "Block_F");
        map.put("Block_GT1", "Block_GT1");
        map.put("Block_GT2", "Block_GT2");
        map.put("Block_GT_11", "Block_GT_11");
        map.put("Block_GT_12", "Block_GT_12");
        map.put("Brokdorf", "Brokdorf");
        map.put("Buschhaus", "Buschhaus");
        map.put("DEFARGE____1_____", "DEFARGE____1_____");
        map.put("DESBR____CHP____", "DESBR____CHP____");
        map.put("DEWHV______1______", "DEWHV______1______");
        map.put("DEZOLLI____1_____", "DEZOLLI____1_____");
        map.put("ELVERLINGSEN_E4", "ELVERLINGSEN_E4");
        map.put("Emsland_A", "Emsland_A");
        map.put("Emsland_B", "Emsland_B");
        map.put("Emsland_C", "Emsland_C");
        map.put("Emsland_D", "Emsland_D");
        map.put("Ensdorf_1", "Ensdorf_1");
        map.put("Ensdorf_3", "Ensdorf_3");
        map.put("Fabrik_Frechen/Wachtberg", "Fabrik_Frechen/Wachtberg");
        map.put("Franken_I_Block_1", "Franken_I_Block_1");
        map.put("Franken_I_Block_2_+_GT", "Franken_I_Block_2_+_GT");
        map.put("Frimmersdorf_P", "Frimmersdorf_P");
        map.put("Frimmersdorf_Q", "Frimmersdorf_Q");
        map.put("GK-WEST_1", "GK-WEST_1");
        map.put("GK-WEST_2", "GK-WEST_2");
        map.put("GTHKW_Nossener_Bruecke", "GTHKW_Nossener_Bruecke");
        map.put("Gersteinwerk_F", "Gersteinwerk_F");
        map.put("Gersteinwerk_G", "Gersteinwerk_G");
        map.put("Gersteinwerk_I", "Gersteinwerk_I");
        map.put("Gersteinwerk_K1", "Gersteinwerk_K1");
        map.put("Gersteinwerk_K2", "Gersteinwerk_K2");
        map.put("Goldenberg_GoWerk", "Goldenberg_GoWerk");
        map.put("Grafenrheinfeld", "Grafenrheinfeld");
        map.put("Grohnde", "Grohnde");
        map.put("GuD-Anlage-HKW-Merkenich", "GuD-Anlage-HKW-Merkenich");
        map.put("GuD-Block", "GuD-Block");
        map.put("GuD_Dormagen", "GuD_Dormagen");
        map.put("Gundremmingen_B", "Gundremmingen_B");
        map.put("Gundremmingen_C", "Gundremmingen_C");
        map.put("HAGEN-KABEL-H45", "HAGEN-KABEL-H45");
        map.put("HAMBORN-4", "HAMBORN-4");
        map.put("HAMBORN-5", "HAMBORN-5");
        map.put("HERDECKE_H6", "HERDECKE_H6");
        map.put("HERNE_3", "HERNE_3");
        map.put("HERNE_4", "HERNE_4");
        map.put("HKW_Altbach/Deizisau_Block_1", "HKW_Altbach/Deizisau_Block_1");
        map.put("HKW_Altbach/Deizisau_Block_2", "HKW_Altbach/Deizisau_Block_2");
        map.put("HKW_Heilbronn_Block_5", "HKW_Heilbronn_Block_5");
        map.put("HKW_Heilbronn_Block_6", "HKW_Heilbronn_Block_6");
        map.put("HKW_Heilbronn_Block_7", "HKW_Heilbronn_Block_7");
        map.put("HKW_IIIB", "HKW_IIIB");
        map.put("HKW_Klingenberg_1-3", "HKW_Klingenberg_1-3");
        map.put("HKW_Lichterfelde_Block_1", "HKW_Lichterfelde_Block_1");
        map.put("HKW_Lichterfelde_Block_3", "HKW_Lichterfelde_Block_3");
        map.put("HKW_Mitte_GUD", "HKW_Mitte_GUD");
        map.put("HKW_Nord_GuD_Nord", "HKW_Nord_GuD_Nord");
        map.put("HKW_Reuter_Block_C", "HKW_Reuter_Block_C");
        map.put("HKW_Reuter_West_Block_D", "HKW_Reuter_West_Block_D");
        map.put("HKW_Reuter_West_Block_E", "HKW_Reuter_West_Block_E");
        map.put("HKW_Tiefstack_Block_2", "HKW_Tiefstack_Block_2");
        map.put("HKW_Tiefstack_GuD", "HKW_Tiefstack_GuD");
        map.put("HKW_Wedel_Block_1", "HKW_Wedel_Block_1");
        map.put("HKW_Wedel_Block_2", "HKW_Wedel_Block_2");
        map.put("HKW_West_Block_1", "HKW_West_Block_1");
        map.put("HKW_West_Block_2", "HKW_West_Block_2");
        map.put("Heizkraftwerk_Linden_(GKL)_GuD", "Heizkraftwerk_Linden_(GKL)_GuD");
        map.put("Heyden", "Heyden");
        map.put("Huckingen_A", "Huckingen_A");
        map.put("Huckingen_B", "Huckingen_B");
        map.put("Huntorf_GT", "Huntorf_GT");
        map.put("IKS_Schwedt_SE1_Block_1", "IKS_Schwedt_SE1_Block_1");
        map.put("IKS_Schwedt_SE2_Block_2", "IKS_Schwedt_SE2_Block_2");
        map.put("Ibbenburen_B", "Ibbenburen_B");
        map.put("Ingolstadt_3", "Ingolstadt_3");
        map.put("Ingolstadt_4", "Ingolstadt_4");
        map.put("Irsching_3", "Irsching_3");
        map.put("Irsching_4", "Irsching_4");
        map.put("Irsching_5", "Irsching_5");
        map.put("Isar_2", "Isar_2");
        map.put("KKW_Neckarwestheim_2", "KKW_Neckarwestheim_2");
        map.put("KKW_Philippsburg_2", "KKW_Philippsburg_2");
        map.put("KMW_KW2", "KMW_KW2");
        map.put("KMW_KW3", "KMW_KW3");
        map.put("KW_Boxberg_Block_N", "KW_Boxberg_Block_N");
        map.put("KW_Boxberg_Block_P", "KW_Boxberg_Block_P");
        map.put("KW_Boxberg_Block_Q", "KW_Boxberg_Block_Q");
        map.put("KW_Boxberg_Block_R", "KW_Boxberg_Block_R");
        map.put("KW_Hafen_Block_5", "KW_Hafen_Block_5");
        map.put("KW_Hafen_Block_6", "KW_Hafen_Block_6");
        map.put("KW_Hamm-Uentrop_Block_10", "KW_Hamm-Uentrop_Block_10");
        map.put("KW_Hamm-Uentrop_Block_20", "KW_Hamm-Uentrop_Block_20");
        map.put("KW_Hastedt_Block_14", "KW_Hastedt_Block_14");
        map.put("KW_Hastedt_Block_15", "KW_Hastedt_Block_15");
        map.put("KW_Janschwalde_Block_A", "KW_Janschwalde_Block_A");
        map.put("KW_Janschwalde_Block_B", "KW_Janschwalde_Block_B");
        map.put("KW_Janschwalde_Block_C", "KW_Janschwalde_Block_C");
        map.put("KW_Janschwalde_Block_D", "KW_Janschwalde_Block_D");
        map.put("KW_Janschwalde_Block_E", "KW_Janschwalde_Block_E");
        map.put("KW_Janschwalde_Block_F", "KW_Janschwalde_Block_F");
        map.put("KW_Laufenburg", "KW_Laufenburg");
        map.put("KW_Lippendorf_Block_R", "KW_Lippendorf_Block_R");
        map.put("KW_Lippendorf_Block_S", "KW_Lippendorf_Block_S");
        map.put("KW_Lunen_Block_1", "KW_Lunen_Block_1");
        map.put("KW_Mittelsbueren_Block_4", "KW_Mittelsbueren_Block_4");
        map.put("KW_Moorburg_Block_A", "KW_Moorburg_Block_A");
        map.put("KW_Moorburg_Block_B", "KW_Moorburg_Block_B");
        map.put("KW_Rheinfelden_DE", "KW_Rheinfelden_DE");
        map.put("KW_Schwarze_Pumpe_Block_A", "KW_Schwarze_Pumpe_Block_A");
        map.put("KW_Schwarze_Pumpe_Block_B", "KW_Schwarze_Pumpe_Block_B");
        map.put("Kiel", "Kiel");
        map.put("Knapsack_1", "Knapsack_1");
        map.put("Knapsack_2", "Knapsack_2");
        map.put("Koepchenwerk", "Koepchenwerk");
        map.put("Kopswerk_2_M1", "Kopswerk_2_M1");
        map.put("Kopswerk_2_M2", "Kopswerk_2_M2");
        map.put("Kopswerk_2_M3", "Kopswerk_2_M3");
        map.put("Kraftwerk_Rostock", "Kraftwerk_Rostock");
        map.put("Kraftwerk_Sackingen", "Kraftwerk_Sackingen");
        map.put("Kraftwerk_Voerde_Block_A", "Kraftwerk_Voerde_Block_A");
        map.put("Kraftwerk_Voerde_Block_B", "Kraftwerk_Voerde_Block_B");
        map.put("Kraftwerk_Wahlheim_GT_D", "Kraftwerk_Wahlheim_GT_D");
        map.put("Kraftwerk_Wehr", "Kraftwerk_Wehr");
        map.put("Kraftwerk_Witznau", "Kraftwerk_Witznau");
        map.put("LUENEN_6", "LUENEN_6");
        map.put("LUENEN_7", "LUENEN_7");
        map.put("Maschine_1", "Maschine_1");
        map.put("Maschine_2", "Maschine_2");
        map.put("NIEHL-3", "NIEHL-3");
        map.put("NIEHL-II-DT", "NIEHL-II-DT");
        map.put("NIEHL-II-GT", "NIEHL-II-GT");
        map.put("Neurath_A", "Neurath_A");
        map.put("Neurath_B", "Neurath_B");
        map.put("Neurath_C", "Neurath_C");
        map.put("Neurath_D", "Neurath_D");
        map.put("Neurath_E", "Neurath_E");
        map.put("Neurath_F", "Neurath_F");
        map.put("Neurath_G", "Neurath_G");
        map.put("Niederaussem_C", "Niederaussem_C");
        map.put("Niederaussem_D", "Niederaussem_D");
        map.put("Niederaussem_E", "Niederaussem_E");
        map.put("Niederaussem_F", "Niederaussem_F");
        map.put("Niederaussem_G", "Niederaussem_G");
        map.put("Niederaussem_H", "Niederaussem_H");
        map.put("Niederaussem_K_(BoA_1)", "Niederaussem_K_(BoA_1)");
        map.put("Nord_2_T20", "Nord_2_T20");
        map.put("PSW_Erzhausen_Block_1", "PSW_Erzhausen_Block_1");
        map.put("PSW_Goldisthal_PSS_A", "PSW_Goldisthal_PSS_A");
        map.put("PSW_Goldisthal_PSS_B", "PSW_Goldisthal_PSS_B");
        map.put("PSW_Goldisthal_PSS_C", "PSW_Goldisthal_PSS_C");
        map.put("PSW_Goldisthal_PSS_D", "PSW_Goldisthal_PSS_D");
        map.put("PSW_Markersbach_PSS_A", "PSW_Markersbach_PSS_A");
        map.put("PSW_Markersbach_PSS_B", "PSW_Markersbach_PSS_B");
        map.put("PSW_Markersbach_PSS_C", "PSW_Markersbach_PSS_C");
        map.put("PSW_Markersbach_PSS_D", "PSW_Markersbach_PSS_D");
        map.put("PSW_Markersbach_PSS_E", "PSW_Markersbach_PSS_E");
        map.put("PSW_Markersbach_PSS_F", "PSW_Markersbach_PSS_F");
        map.put("RDK_4", "RDK_4");
        map.put("RDK_7", "RDK_7");
        map.put("RDK_8", "RDK_8");
        map.put("RUHRORT-4", "RUHRORT-4");
        map.put("Rheinkraftwerk_Iffezheim", "Rheinkraftwerk_Iffezheim");
        map.put("Rodund_2", "Rodund_2");
        map.put("Sackingen", "Sackingen");
        map.put("Schkopau_A", "Schkopau_A");
        map.put("Schkopau_B", "Schkopau_B");
        map.put("Scholven_B", "Scholven_B");
        map.put("Scholven_C", "Scholven_C");
        map.put("Staudinger_4", "Staudinger_4");
        map.put("Staudinger_5", "Staudinger_5");
        map.put("Stuttgart-Munster_DT", "Stuttgart-Munster_DT");
        map.put("Sued_GuD1_GT2", "Sued_GuD1_GT2");
        map.put("Sued_GuD1_GT3", "Sued_GuD1_GT3");
        map.put("Sued_GuD2_DT60", "Sued_GuD2_DT60");
        map.put("Sued_GuD2_GT61", "Sued_GuD2_GT61");
        map.put("Sued_GuD2_GT62", "Sued_GuD2_GT62");
        map.put("VOELKLINGEN_HKV", "VOELKLINGEN_HKV");
        map.put("VOELKLINGEN_MKV", "VOELKLINGEN_MKV");
        map.put("Veltheim_3", "Veltheim_3");
        map.put("Vianden_1", "Vianden_1");
        map.put("Vianden_10", "Vianden_10");
        map.put("Vianden_11", "Vianden_11");
        map.put("Vianden_2", "Vianden_2");
        map.put("Vianden_3", "Vianden_3");
        map.put("Vianden_4", "Vianden_4");
        map.put("Vianden_5", "Vianden_5");
        map.put("Vianden_6", "Vianden_6");
        map.put("Vianden_7", "Vianden_7");
        map.put("Vianden_8", "Vianden_8");
        map.put("Vianden_9", "Vianden_9");
        map.put("WALSUM_10", "WALSUM_10");
        map.put("WALSUM_9", "WALSUM_9");
        map.put("WEIHER_C", "WEIHER_C");
        map.put("Waldeck_II_M5", "Waldeck_II_M5");
        map.put("Waldeck_II_M6", "Waldeck_II_M6");
        map.put("Wehr", "Wehr");
        map.put("Weisweiler_E", "Weisweiler_E");
        map.put("Weisweiler_F", "Weisweiler_F");
        map.put("Weisweiler_G", "Weisweiler_G");
        map.put("Weisweiler_H", "Weisweiler_H");
        map.put("Weisweiler_VGT_-_BI__G", "Weisweiler_VGT_-_BI__G");
        map.put("Weisweiler_VGT_-_BI__H", "Weisweiler_VGT_-_BI__H");
        map.put("Westfalen_C", "Westfalen_C");
        map.put("Westfalen_E", "Westfalen_E");
        map.put("Wilhelmshaven", "Wilhelmshaven");
        map.put("Witznau", "Witznau");

        data.put("Germany", map);
        
        
        map = new HashMap<String, String>();
        map.put("Amer_8", "Amer_8");
        map.put("Amer_9", "Amer_9");
        map.put("Borssele_12", "Borssele_12");
        map.put("Borssele_30", "Borssele_30");
        map.put("Centrale_Gelderland_(CG13)", "Centrale_Gelderland_(CG13)");
        map.put("Centrale_Merwedekanaal", "Centrale_Merwedekanaal");
        map.put("Claus_A", "Claus_A");
        map.put("Claus_C", "Claus_C");
        map.put("Diemen_33", "Diemen_33");
        map.put("Diemen_34", "Diemen_34");
        map.put("EDH", "EDH");
        map.put("ELSTA", "ELSTA");
        map.put("Eemscentrale_(EC3)", "Eemscentrale_(EC3)");
        map.put("Eemscentrale_(EC4)", "Eemscentrale_(EC4)");
        map.put("Eemscentrale_(EC5)", "Eemscentrale_(EC5)");
        map.put("Eemscentrale_(EC6)", "Eemscentrale_(EC6)");
        map.put("Eemscentrale_(EC7)", "Eemscentrale_(EC7)");
        map.put("Eemshaven_10", "Eemshaven_10");
        map.put("Eemshaven_20", "Eemshaven_20");
        map.put("Eemshaven_30", "Eemshaven_30");
        map.put("Eemshaven_A", "Eemshaven_A");
        map.put("Eemshaven_B", "Eemshaven_B");
        map.put("Enecogen", "Enecogen");
        map.put("GDFSUEZ_NL_EC-22", "GDFSUEZ_NL_EC-22");
        map.put("Hemweg_8", "Hemweg_8");
        map.put("Hemweg_9", "Hemweg_9");
        map.put("IJmond", "IJmond");
        map.put("Lage_Weide_6", "Lage_Weide_6");
        map.put("MK11_50kV", "MK11_50kV");
        map.put("MVL380_Centrale_Rotterdam_1", "MVL380_Centrale_Rotterdam_1");
        map.put("Maasvlakte_1", "Maasvlakte_1");
        map.put("Maasvlakte_2", "Maasvlakte_2");
        map.put("Maasvlakte_3", "Maasvlakte_3");
        map.put("Maxima_Centrale_(FL4)", "Maxima_Centrale_(FL4)");
        map.put("Maxima_Centrale_(FL5)", "Maxima_Centrale_(FL5)");
        map.put("Moerdijk_1", "Moerdijk_1");
        map.put("Moerdijk_2", "Moerdijk_2");
        map.put("Offshore_Windpark_Egmond_aan_Zee", "Offshore_Windpark_Egmond_aan_Zee");
        map.put("Prinses_Alexia_Windpark", "Prinses_Alexia_Windpark");
        map.put("Rijnmond_II", "Rijnmond_II");
        map.put("RoCa_3", "RoCa_3");
        map.put("Sloecentrale_unit_10", "Sloecentrale_unit_10");
        map.put("Sloecentrale_unit_20", "Sloecentrale_unit_20");
        map.put("Swentibold_1", "Swentibold_1");
        map.put("Velsen_24", "Velsen_24");
        map.put("Velsen_25", "Velsen_25");
        map.put("Westereems_2_Tennet", "Westereems_2_Tennet");

        data.put("Netherlands", map);
         
        map = new HashMap<String, String>();
        
        map.put("AIGLE_6", "AIGLE_6");
        map.put("AMFARD14", "AMFARD14");
        map.put("AMFARD15", "AMFARD15");
        map.put("ARAMON_1", "ARAMON_1");
        map.put("ARAMON_2", "ARAMON_2");
        map.put("ARRIGHI_1", "ARRIGHI_1");
        map.put("ARRIGHI_2", "ARRIGHI_2");
        map.put("BATHIE_4", "BATHIE_4");
        map.put("BATHIE_5", "BATHIE_5");
        map.put("BATHIE_6", "BATHIE_6");
        map.put("BELLEVILLE_1", "BELLEVILLE_1");
        map.put("BELLEVILLE_2", "BELLEVILLE_2");
        map.put("BLAYAIS_1", "BLAYAIS_1");
        map.put("BLAYAIS_2", "BLAYAIS_2");
        map.put("BLAYAIS_3", "BLAYAIS_3");
        map.put("BLAYAIS_4", "BLAYAIS_4");
        map.put("BLENOD_5", "BLENOD_5");
        map.put("BORT_1", "BORT_1");
        map.put("BORT_2", "BORT_2");
        map.put("BOUCHAIN_1", "BOUCHAIN_1");
        map.put("BOUCHAIN_7", "BOUCHAIN_7");
        map.put("BRENNILIS_1", "BRENNILIS_1");
        map.put("BRENNILIS_2", "BRENNILIS_2");
        map.put("BRENNILIS_3", "BRENNILIS_3");
        map.put("BROMMAT_7", "BROMMAT_7");
        map.put("BUGEY_2", "BUGEY_2");
        map.put("BUGEY_3", "BUGEY_3");
        map.put("BUGEY_4", "BUGEY_4");
        map.put("BUGEY_5", "BUGEY_5");
        map.put("CATTENOM_1", "CATTENOM_1");
        map.put("CATTENOM_2", "CATTENOM_2");
        map.put("CATTENOM_3", "CATTENOM_3");
        map.put("CATTENOM_4", "CATTENOM_4");
        map.put("CHASTANG_2", "CHASTANG_2");
        map.put("CHASTANG_3", "CHASTANG_3");
        map.put("CHEYLAS_1", "CHEYLAS_1");
        map.put("CHEYLAS_2", "CHEYLAS_2");
        map.put("CHINON_1", "CHINON_1");
        map.put("CHINON_2", "CHINON_2");
        map.put("CHINON_3", "CHINON_3");
        map.put("CHINON_4", "CHINON_4");
        map.put("CHOOZ_1", "CHOOZ_1");
        map.put("CHOOZ_2", "CHOOZ_2");
        map.put("CIVAUX_1", "CIVAUX_1");
        map.put("CIVAUX_2", "CIVAUX_2");
        map.put("COMBE_D'AVRIEUX_1", "COMBE_D'AVRIEUX_1");
        map.put("COMBIGOLFE_CCG", "COMBIGOLFE_CCG");
        map.put("CORDEMAIS_2", "CORDEMAIS_2");
        map.put("CORDEMAIS_3", "CORDEMAIS_3");
        map.put("CORDEMAIS_4", "CORDEMAIS_4");
        map.put("CORDEMAIS_5", "CORDEMAIS_5");
        map.put("CRUAS_1", "CRUAS_1");
        map.put("CRUAS_2", "CRUAS_2");
        map.put("CRUAS_3", "CRUAS_3");
        map.put("CRUAS_4", "CRUAS_4");
        map.put("CYCOFOS_PL1", "CYCOFOS_PL1");
        map.put("CYCOFOS_PL2", "CYCOFOS_PL2");
        map.put("Croix-de-Metz", "Croix-de-Metz");
        map.put("DAMPIERRE_1", "DAMPIERRE_1");
        map.put("DAMPIERRE_2", "DAMPIERRE_2");
        map.put("DAMPIERRE_3", "DAMPIERRE_3");
        map.put("DAMPIERRE_4", "DAMPIERRE_4");
        map.put("DIRINON_1", "DIRINON_1");
        map.put("DIRINON_2", "DIRINON_2");
        map.put("DK6-TG1", "DK6-TG1");
        map.put("DK6-TG2", "DK6-TG2");
        map.put("DK6-TV1", "DK6-TV1");
        map.put("DK6-TV2", "DK6-TV2");
        map.put("EMILE_HUCHET_4", "EMILE_HUCHET_4");
        map.put("EMILE_HUCHET_5", "EMILE_HUCHET_5");
        map.put("EMILE_HUCHET_6", "EMILE_HUCHET_6");
        map.put("EMILE_HUCHET_7", "EMILE_HUCHET_7");
        map.put("EMILE_HUCHET_8", "EMILE_HUCHET_8");
        map.put("FESSENHEIM_1", "FESSENHEIM_1");
        map.put("FESSENHEIM_2", "FESSENHEIM_2");
        map.put("FLAMANVILLE_1", "FLAMANVILLE_1");
        map.put("FLAMANVILLE_2", "FLAMANVILLE_2");
        map.put("FR-GA-MORANT1", "FR-GA-MORANT1");
        map.put("GENNEVILLIERS_1", "GENNEVILLIERS_1");
        map.put("GOLFECH_1", "GOLFECH_1");
        map.put("GOLFECH_2", "GOLFECH_2");
        map.put("GRAND_MAISON_1", "GRAND_MAISON_1");
        map.put("GRAND_MAISON_10", "GRAND_MAISON_10");
        map.put("GRAND_MAISON_11", "GRAND_MAISON_11");
        map.put("GRAND_MAISON_12", "GRAND_MAISON_12");
        map.put("GRAND_MAISON_2", "GRAND_MAISON_2");
        map.put("GRAND_MAISON_3", "GRAND_MAISON_3");
        map.put("GRAND_MAISON_4", "GRAND_MAISON_4");
        map.put("GRAND_MAISON_5", "GRAND_MAISON_5");
        map.put("GRAND_MAISON_6", "GRAND_MAISON_6");
        map.put("GRAND_MAISON_7", "GRAND_MAISON_7");
        map.put("GRAND_MAISON_8", "GRAND_MAISON_8");
        map.put("GRAND_MAISON_9", "GRAND_MAISON_9");
        map.put("GRAVELINES_1", "GRAVELINES_1");
        map.put("GRAVELINES_2", "GRAVELINES_2");
        map.put("GRAVELINES_3", "GRAVELINES_3");
        map.put("GRAVELINES_4", "GRAVELINES_4");
        map.put("GRAVELINES_5", "GRAVELINES_5");
        map.put("GRAVELINES_6", "GRAVELINES_6");
        map.put("HAVRE_4", "HAVRE_4");
        map.put("LUCY_3", "LUCY_3");
        map.put("MARTIGUES_PONTEAU_5", "MARTIGUES_PONTEAU_5");
        map.put("MARTIGUES_PONTEAU_6", "MARTIGUES_PONTEAU_6");
        map.put("MAXE_1", "MAXE_1");
        map.put("MAXE_2", "MAXE_2");
        map.put("MONTEREAU_5", "MONTEREAU_5");
        map.put("MONTEREAU_6", "MONTEREAU_6");
        map.put("MONTEZIC_1", "MONTEZIC_1");
        map.put("MONTEZIC_2", "MONTEZIC_2");
        map.put("MONTEZIC_3", "MONTEZIC_3");
        map.put("MONTEZIC_4", "MONTEZIC_4");
        map.put("NOGENT_1", "NOGENT_1");
        map.put("NOGENT_2", "NOGENT_2");
        map.put("PALUEL_1", "PALUEL_1");
        map.put("PALUEL_2", "PALUEL_2");
        map.put("PALUEL_3", "PALUEL_3");
        map.put("PALUEL_4", "PALUEL_4");
        map.put("PENLY_1", "PENLY_1");
        map.put("PENLY_2", "PENLY_2");
        map.put("PORCHEVILLE_1", "PORCHEVILLE_1");
        map.put("PORCHEVILLE_2", "PORCHEVILLE_2");
        map.put("PORCHEVILLE_3", "PORCHEVILLE_3");
        map.put("PORCHEVILLE_4", "PORCHEVILLE_4");
        map.put("POUGET_4", "POUGET_4");
        map.put("PROVENCE_5", "PROVENCE_5");
        map.put("Pont-sur-Sambre", "Pont-sur-Sambre");
        map.put("REVIN_1", "REVIN_1");
        map.put("REVIN_2", "REVIN_2");
        map.put("REVIN_3", "REVIN_3");
        map.put("REVIN_4", "REVIN_4");
        map.put("SAINT-PIERRE", "SAINT-PIERRE");
        map.put("SISTERON_1", "SISTERON_1");
        map.put("SISTERON_2", "SISTERON_2");
        map.put("SPEM_CCG", "SPEM_CCG");
        map.put("ST_ALBAN_1", "ST_ALBAN_1");
        map.put("ST_ALBAN_2", "ST_ALBAN_2");
        map.put("ST_LAURENT_1", "ST_LAURENT_1");
        map.put("ST_LAURENT_2", "ST_LAURENT_2");
        map.put("SUPER_BISSORTE_1", "SUPER_BISSORTE_1");
        map.put("SUPER_BISSORTE_2", "SUPER_BISSORTE_2");
        map.put("SUPER_BISSORTE_3", "SUPER_BISSORTE_3");
        map.put("SUPER_BISSORTE_4", "SUPER_BISSORTE_4");
        map.put("SUPER_BISSORTE_5", "SUPER_BISSORTE_5");
        map.put("TRICASTIN_1", "TRICASTIN_1");
        map.put("TRICASTIN_2", "TRICASTIN_2");
        map.put("TRICASTIN_3", "TRICASTIN_3");
        map.put("TRICASTIN_4", "TRICASTIN_4");
        map.put("VAIRES_1", "VAIRES_1");
        map.put("VAIRES_2", "VAIRES_2");
        map.put("VAIRES_3", "VAIRES_3");
        map.put("VILLARODIN_1", "VILLARODIN_1");
        map.put("VILLARODIN_2", "VILLARODIN_2");
        map.put("VITRY_3", "VITRY_3");
        map.put("VITRY_4", "VITRY_4");        
        data.put("France", map);
    }
 
    public Map<String, Map<String, String>> getData() {
        return data;
    }
 
    public String getCountry() {
        return country;
    }
 
    public void setCountry(String country) {
        this.country = country;
    }
 
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
 
    public Map<String, String> getCountries() {
        return countries;
    }
 
    public Map<String, String> getCities() {
        return cities;
    }
 
    public void onCountryChange() {
        if(country !=null && !country.equals(""))
            cities = data.get(country);
        else
            cities = new HashMap<String, String>();
    }
     
    public void displayLocation() {
        FacesMessage msg;
        if(city != null && country != null)
            msg = new FacesMessage("Selected", city + " of " + country);
        else
            msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Invalid", "City is not selected."); 
             
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }
}