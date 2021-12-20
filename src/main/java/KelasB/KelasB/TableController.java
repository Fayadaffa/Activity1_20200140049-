/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KelasB.KelasB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ASUS
 */
@Controller
public class TableController {
    
    @RequestMapping("/DataKTP")
    public String getTable(Model Tabel){
        
        ArrayList<List<String>> data = new ArrayList<>();
        
        data.add(Arrays.asList("ID","No.KTP","Nama","Alamat"));
        data.add(Arrays.asList("202001","0621101","Fayyadh","Samarinda")); 
        data.add(Arrays.asList("202002","0620112","Irsyad","Padang"));
        data.add(Arrays.asList("202003","0620123","Andre","Mesir"));
        data.add(Arrays.asList("202004","0620442","Acep","Madrid"));
        data.add(Arrays.asList("202005","0620122","Ario","Bandung"));
        data.add(Arrays.asList("202006","0620278","Nabil","Munich"));
        data.add(Arrays.asList("202007","0620887","Alam","Berlin"));
        data.add(Arrays.asList("202008","0620879","Bintang","Jakarta"));
        data.add(Arrays.asList("202009","0620119","Rian","Malang"));
        data.add(Arrays.asList("202010","0620991","Abimanyu","Tokyo"));
        data.add(Arrays.asList("202011","0621000","Airel","Osaka"));
        data.add(Arrays.asList("202012","0622156","Udin","Semarang"));
        data.add(Arrays.asList("202013","0620755","Asep","Bogor"));
        data.add(Arrays.asList("202014","0620106","Eki","New york"));
        data.add(Arrays.asList("202015","0620335","Eko","Yogyakarta"));
        data.add(Arrays.asList("202016","0620655","Rifqi","Banten"));
        data.add(Arrays.asList("202017","0620086","Rifqo","Solo"));
        data.add(Arrays.asList("202018","0620254","Fayyadh","Samarinda"));
        data.add(Arrays.asList("202019","0620766","Satria","Yogyakarta"));
        data.add(Arrays.asList("202020","0620568","Dede","Denpasar"));
        
        Tabel.addAttribute("tabel",data);
        
        return "tableviewer";
    }
}
