/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventasdao.controladores;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import ventasdao.dominio.Conexion;
import ventasdao.objetos.Categoria;
import ventasdao.objetos.Producto;

/**
 *
 * @author hchanampe
 */
public class ProductoControlador implements ICrud<Producto>{

   private Connection connection;

    private Statement statementmt;

    private PreparedStatement ps;

    private ResultSet resultSet;

    private String query;
    
    private CategoriaControlador categoriaControlador;
    
    private ResultSet rs;
    
    private String sql;


    @Override
    public boolean crear(Producto entidad) throws SQLException, Exception {
        
        connection = Conexion.obtenerConexion ();
        String sql = "INSERT INTO productos (nombre,descripcion,precio,fecha_creacion, categoria_id) VALUES (?,?,?,?,?)";
        

        try {
            
            java.sql.Date fecha;
            long millis=System.currentTimeMillis();  
            fecha =new java.sql.Date(millis);  

            
            
            ps = connection.prepareStatement(sql);
            ps.setString(1, entidad.getNombre());
            ps.setString(2, entidad.getDescripcion());
            ps.setFloat(3, entidad.getPrecio());
            ps.setDate(4, fecha);
            ps.setInt(5, entidad.getCategoria().getId());
            ps.executeUpdate();
            connection.close();
            

        } catch (SQLException ex) {
            Logger.getLogger(CategoriaControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean eliminar(Producto entidad) throws ClassNotFoundException {
       
        try {
            connection = Conexion.obtenerConexion ();
            this.query = "DELETE FROM productos WHERE id=?";

            ps = connection.prepareStatement(this.query);
            ps.setInt(1, entidad.getId());

            ps.execute();
            connection.close();
            return true;
        } catch (SQLException ex) {
            //notifyListeners(ex.getMessage());
            Logger.getLogger(CategoriaControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Producto extraer(int id) throws SQLException, ClassNotFoundException {
        
            Producto producto = new Producto();
        
            try{
                connection = Conexion.obtenerConexion();
                sql = "SELECT * FROM productos WHERE id = ?";
                ps = connection.prepareStatement(sql);

                ps.setInt(1, id);

                this.rs = ps.executeQuery();

                this.rs.next();
                
                producto = new Producto();
                System.out.println("resulset -> " + rs.getFloat("precio") );
                        
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setId(rs.getInt("id"));
                producto.setPrecio (rs.getFloat("precio"));
                producto.setFechaCreacion(rs.getDate("fecha_creacion"));
                producto.setCategoriaId(rs.getInt("categoria_id"));
                
                connection.close();
            }catch(SQLException ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }

            
            return producto;
        
    }

    @Override
    public boolean modificar(Producto entidad) throws SQLException, ClassNotFoundException {
        
       connection = Conexion.obtenerConexion ();
       this.query = "UPDATE productos SET nombre=?, descripcion=?, categoria_id = ?, precio = ? WHERE id=?";
        
       ps = connection.prepareStatement(this.query);
       ps.setString(1,entidad.getNombre() );
       ps.setString(2,entidad.getDescripcion() );
       ps.setInt(3,entidad.getCategoriaId() );
       ps.setDouble(4, entidad.getPrecio() );
       
       
       ps.setInt(5, entidad.getId());
       
       ps.executeUpdate();
       connection.close();
       return true;
    }

    @Override
    public ArrayList <Producto> listar() throws Exception {
         connection = Conexion.obtenerConexion ();
        try{
            
            this.statementmt = connection.createStatement();
            this.query = "SELECT * FROM productos";
            this.resultSet   = statementmt.executeQuery(query);
            connection.close();
            
            ArrayList<Producto> productos = new ArrayList();
            
            while(resultSet.next()){
                
                Producto producto = new Producto();
                
                producto.setNombre(resultSet.getString("nombre"));
                producto.setDescripcion(resultSet.getString("descripcion"));
                producto.setId(resultSet.getInt("id"));
                producto.setPrecio (resultSet.getFloat("precio"));
                producto.setFechaCreacion(resultSet.getDate("fecha_creacion"));
                producto.setCategoriaId(resultSet.getInt("categoria_id"));
                


                System.out.println("precio -> " + producto.getPrecio() );

                productos.add(producto);
                
            }
            //System.out.println(cont);
            return productos;
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }
    
 private Categoria getCategoria(Integer id) throws Exception{
     this.categoriaControlador = new CategoriaControlador();
     
     Categoria categoria = categoriaControlador.extraer(id);
     
     return categoria;
 }   
    
}
