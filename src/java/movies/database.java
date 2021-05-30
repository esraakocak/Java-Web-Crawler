package movies;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class database {
    
    private Connection connection;
    private Statement statement;
    
    public void connection_open() {

        try {
            if (connection == null) {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/filmler?zeroDateTimeBehavior=convertToNull", "root", "");
                statement = connection.createStatement();
                System.out.println("Bağlantı Sağlandı");
            } else {
                System.out.println("Bağlantı Zaten Açık");
            }
        } catch (Exception e) {
            System.out.println("Open Connection Error" + e.toString());
        }
    }
    
    public void conneciton_close() {
        
        try {
            if (statement != null) {
                statement.close();
                statement = null;
            }
            if (connection != null) {
                connection.close();
                connection = null;
                
            }
            
        } catch (Exception e) {

        }
    }
    
    public static void main(String[] args) throws SQLException {
        database a = new database();
        System.out.println(a.animasyon_en_iyi_film());
        //   a.connection_open();
        // a.kategori("comedy");
        //   a.kategori("family");
        // a.kategori("action");
        // a.kategori("adventure");
        // a.kategori("science fiction");
        // a.kategori("animation");
        // a.kategori("drama");
        // a.kategori("thriller");
        //  a.kategori("crime");
        //  Scanner k=new Scanner(System.in);
        // String oyuncular_adi =k.next();
        //   a.oyuncu("Colin Jost");
        //  a.en_iyi_film();
        //a.animasyon_en_iyi_film();
        // a.random_film();
   //     a.details(5);
        
    }
    
    public void insert_veri(String film_adi, String film_tür, String puan, String film_image, String film_konu, String oyuncular_adi, String orginal_adi, String film_fragman) {
        
        try {
            
            connection_open();
            String selectquery = "INSERT INTO `film`(`film_adi`, `film_tür`, `puan`, `film_img`, `film_konu`, `oyuncular_adi`, `orginal_adi`, `film_fragman`) "
                    + "VALUES (' " + film_adi + "','" + film_tür + "','" + puan + "','" + film_image + "','" + film_konu + "','" + oyuncular_adi + "','" + orginal_adi + "','" + film_fragman + "')";
 
            PreparedStatement gir = connection.prepareStatement(selectquery);
            gir.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        conneciton_close();
    }
    
    public  List<film> kategori(String kategori_adi) {
             List<film> filmlist = new ArrayList<>();
        try {
            
            connection_open();
            String selectquery = "SELECT * FROM `film` WHERE `film_tür` LIKE '%" + kategori_adi.trim() + "%' ";
            ResultSet rs = statement.executeQuery(selectquery);
            
            while (rs.next()) {
                 film film = new film();
                 int film_id = rs.getInt("film_id");
                
                String film_adi = rs.getString("film_adi");
                String tur = rs.getString("film_tür");
                String puan = rs.getString("puan");
                String img = rs.getString("film_img");
                film.setFilm_adi(film_adi);
                film.setFilm_id(film_id);
                film.setFilm_tur(tur);
                film.setPuan(puan);
                film.setFilm_img(img);
                filmlist.add(film);             
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        conneciton_close();
             return filmlist;
    }
    
 
    
    public List<film> film_öner(String kategori) {
        List<film> filmlist = new ArrayList<>();
        
        try {
            
            connection_open();
            String selectquery = "SELECT * FROM `film` WHERE `film_tür`  LIKE '%" + kategori.trim() + "%'";
            System.out.println(selectquery);
            ResultSet rs = statement.executeQuery(selectquery);
            
            while (rs.next()) {
                film film = new film();
                int film_id = rs.getInt("film_id");
                String film_adi = rs.getString("film_adi");
                String tur = rs.getString("film_tür");
                String puan = rs.getString("puan");
                String img = rs.getString("film_img");
                film.setFilm_adi(film_adi);
                film.setFilm_id(film_id);
                film.setFilm_tur(tur);
                film.setPuan(puan);
                film.setFilm_img(img);
                filmlist.add(film);
                System.out.println(film);
            }

      
        } catch (Exception e) {
            e.printStackTrace();
        }
        conneciton_close();
        return filmlist;
    }
    
    public List<film> en_iyi_film() {
        List<film> filmlist = new ArrayList<>();
        try {
            
            connection_open();
            String selectquery = "SELECT * FROM `film`  ORDER BY `puan` DESC LIMIT 0,10";
            
            ResultSet rs = statement.executeQuery(selectquery);
            
            while (rs.next()) {
                film film =new film();
                int film_id = rs.getInt("film_id");
                String film_adi = rs.getString("film_adi");
                String tur = rs.getString("film_tür");
                String puan = rs.getString("puan");
                String img = rs.getString("film_img");
                film.setFilm_adi(film_adi);
                film.setFilm_id(film_id);
                film.setFilm_tur(tur);
                film.setPuan(puan);
                film.setFilm_img(img);
                filmlist.add(film);
                
               
           
            }
            //  PreparedStatement gir = connection.prepareStatement(selectquery);
            //    gir.executeUpdate();  
        } catch (Exception e) {
            e.printStackTrace();
        }
        conneciton_close();
         return filmlist;
    }
    
    public List<film>animasyon_en_iyi_film() {
           List<film> filmlist1= new ArrayList<>();
        
        try {
            
            connection_open();
        
        String selectquery = "SELECT * FROM `film` WHERE `film_tür` LIKE '%animation%' ORDER BY `puan` DESC LIMIT 0,18";
            
            ResultSet rs = statement.executeQuery(selectquery);
            
            while (rs.next()) {
                
                 film film =new film();
                int film_id = rs.getInt("film_id");
                String film_adi = rs.getString("film_adi");
                String tur = rs.getString("film_tür");
                String puan = rs.getString("puan");
                String img = rs.getString("film_img");
                film.setFilm_adi(film_adi);
                film.setFilm_id(film_id);
                film.setFilm_tur(tur);
                film.setPuan(puan);
                film.setFilm_img(img);
                filmlist1.add(film);
            }

            //  PreparedStatement gir = connection.prepareStatement(selectquery);
            //    gir.executeUpdate();  
        } catch (Exception e) {
            e.printStackTrace();
        }
        conneciton_close();
          return filmlist1;
    }
    
    public List<film> random_film() { 
          List<film> filmlist2= new ArrayList<>();
        try {
            
            
            connection_open();
            String selectquery = "SELECT * FROM `film`  ORDER BY RAND() DESC LIMIT 0,10";
            
            ResultSet rs = statement.executeQuery(selectquery);
            
            while (rs.next()) {
                 film film =new film();
                  int film_id = rs.getInt("film_id");
                
                String film_adi = rs.getString("film_adi");
                String tur = rs.getString("film_tür");
                String puan = rs.getString("puan");
                String img = rs.getString("film_img");
                
                film.setFilm_adi(film_adi);
                film.setFilm_id(film_id);
                film.setFilm_tur(tur);
                film.setPuan(puan);
                film.setFilm_img(img);
                filmlist2.add(film);
                
            }

     
        } catch (Exception e) {
            e.printStackTrace();
        }
        conneciton_close();
             return filmlist2;
        
    }
    
    public film details(int id) { // details.jsp içerik 
        film film = new film();
        try {
            
            connection_open();
            String selectquery = "select * from      `film` where   film_id=" + id;
            
            ResultSet rs = statement.executeQuery(selectquery);
            
            while (rs.next()) {
                int film_id = rs.getInt("film_id");
                String film_adi = rs.getString("film_adi");
                String tur = rs.getString("film_tür");
                String puan = rs.getString("puan");
                String img = rs.getString("film_img");
                String fragman = rs.getString("film_fragman");
                String konu = rs.getString("film_konu");
                String Oyuncu = rs.getString("oyuncular_adi");
                film.setOyuncular_adi(Oyuncu);
                film.setFilm_adi(film_adi);
                film.setFilm_id(film_id);
                film.setFilm_tur(tur);
                film.setPuan(puan);
                film.setFilm_img(img);
                film.setFilm_fragman(fragman);
                film.setFilm_konu(konu);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        conneciton_close();
        return film;
    }
    
}
