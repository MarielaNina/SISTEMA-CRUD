package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductosDAO implements CRUD {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    Productos pro=new Productos();
    int r=0;
    
    public int actualizarStock(int cant,int idp){
        String sql="update producto set Stock=? where IdProducto=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, cant);
            ps.setInt(2, idp);
            ps.executeUpdate();
            
        }catch (Exception e){
            
        }
        return r;  
    }
    
    public Productos listarID(int id){
        Productos p=new Productos();
        String sql="select * from producto where IdProducto=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            while(rs.next()){
                p.setId(rs.getInt(1));
                p.setNom(rs.getString(2));
                p.setPrecio(rs.getString(3));
                p.setStock(rs.getString(4));
                p.setEstado(rs.getString(5));
                
            }
        }catch (Exception e){
            
        }
        return p;
    }
        
    
    @Override
    public List listar() {
        List<Productos> lista = new ArrayList<>();
        String sql = "select * from producto";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Productos pro = new Productos();
                pro.setId(rs.getInt(1));
                pro.setNom(rs.getString(2));
                pro.setPrecio(rs.getString(3));
                pro.setStock(rs.getString(4));
                pro.setEstado(rs.getString(5));
                lista.add(pro);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "insert into producto(Nombres,Precio,Stock,Estado)values(?,?,?,?)";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r = ps.executeUpdate();
        } catch (Exception e) {

        }
        return r;
    }
    
    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "update producto set Nombres=?,Precio=?,Stock=?,Estado=? where IdProducto=?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    
    @Override
    public void eliminar(int id) {
        String sql = "delete from producto where IdProducto=?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (Exception e) {
        }
    }


}
