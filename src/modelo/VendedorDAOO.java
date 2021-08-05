
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VendedorDAOO implements CRUD  {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public List listar() {
        List<Vendedor> lista = new ArrayList<>();
        String sql = "select * from vendedor";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Vendedor ven = new Vendedor();
                ven.setId(rs.getInt(1));
                ven.setDni(rs.getString(2));
                ven.setNom(rs.getString(3));
                ven.setTelefono(rs.getString(4));
                ven.setEstado(rs.getString(5));
                ven.setUser(rs.getString(6));
                lista.add(ven);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    @Override

    public int add(Object[] o) {
        int r = 0;
        String sql = "insert into vendedor(Dni,Nombres,Telefono,Estado,User)values(?,?,?,?,?)";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r = ps.executeUpdate();
        } catch (Exception e) {

        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql = "update vendedor set Dni=?,Nombres=?,Telefono=?,Estado=?,User=? where IdVendedor=?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r=ps.executeUpdate();
        } catch (Exception e) {

        }
        return r;
    }

    @Override
    public void eliminar(int id) {
      String sql="delete from vendedor where IdVendedor=?";
      try{
          con=cn.Conectar();
          ps=con.prepareStatement(sql);
          ps.setInt(1, id);
          ps.executeUpdate();
          
      }catch(Exception e){
          
      }
    }
}
