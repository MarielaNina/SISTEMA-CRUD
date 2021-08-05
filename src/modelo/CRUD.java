package modelo;

import java.util.List;

public interface CRUD {
//metodos de formularios de mantenimiento
    public List listar();

    public int add(Object[] o);

    public int actualizar(Object[] o);

    public void eliminar(int id);

}
