/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.codec.digest.DigestUtils;
import ventanas.VentanaRegistros;


/**
 *
 * @author Juan Ricardo
 */
public class FabricaAdmins {
     private Admin admin1;
     private Admin admin2;
     
     public FabricaAdmins()
    {
        admin1 = new Admin(2160039, "juanR", "JUAN", "RICARDO", "ALBARRACIN", "BARBOSA", "CABECERA");
        admin2 = new Admin(2130535, "angelF", "ANGEL", "FABIAN", "GOMEZ", "ESTUPINAN", "COMUNEROS");
        
        int cedula = admin1.getCcAdmin();
        String usr = admin1.getUsuario();
        String pNombre = admin1.getPrimerNombre();
        String sNombre = admin1.getSegundoNombre();
        String pApellido = admin1.getPrimerApellido();
        String sApellido = admin1.getSegundoApellido();
        String cargo = admin1.getCargo();
        
        int cedula2 = admin2.getCcAdmin();
        String usr2 = admin2.getUsuario();
        String pNombre2 = admin2.getPrimerNombre();
        String sNombre2 = admin2.getSegundoNombre();
        String pApellido2 = admin2.getPrimerApellido();
        String sApellido2 = admin2.getSegundoApellido();
        String cargo2 = admin2.getCargo();
        
        //Contraseñas sin encriptar
        String passA="1234";
        String passB="5678";
        
        //Contraseñas encriptadas con MD5
        String passAMD5=DigestUtils.md5Hex(passA); 
        String passBMD5=DigestUtils.md5Hex(passB);
        
        Conectar conexion = new Conectar();
        Connection reg = conexion.getConnection();
        String sql= "SELECT count(*) FROM administrador";
        String data[]= new String[7];
        Statement t;

        try {
            t = reg.createStatement();
            ResultSet rs= t.executeQuery(sql);

            while(rs.next()){

                int b = Integer.parseInt(rs.getString(1));

                if(b==0)
                {
                    Statement st;
                    Statement st2;
                    try {
                        String sq = "INSERT INTO administrador(cedulaAdmin, usuario, contrasena, primerNombre, segundoNombre, primerApellido, segundoApellido, cargo)VALUES('"+cedula+"', '"+usr+"', '"+passAMD5+"', '"+pNombre+"', '"+sNombre+"', '"+pApellido+"', '"+sApellido+"', '"+cargo+"')";
                        String sq2 = "INSERT INTO administrador(cedulaAdmin, usuario, contrasena, primerNombre, segundoNombre, primerApellido, segundoApellido, cargo)VALUES('"+cedula2+"', '"+usr2+"', '"+passBMD5+"', '"+pNombre2+"', '"+sNombre2+"', '"+pApellido2+"', '"+sApellido2+"', '"+cargo2+"')";
                        st = reg.createStatement();
                        st.executeUpdate(sq);
                        st2 = reg.createStatement();
                        st2.executeUpdate(sq2);

                    } catch (SQLException ex) {
                    Logger.getLogger(VentanaRegistros.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }

        }catch (SQLException ex) {
                    Logger.getLogger(VentanaRegistros.class.getName()).log(Level.SEVERE, null, ex);
                    }
        conexion.desconectar(); 
    }

    private boolean getMd5Digest(String passBMD5) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
