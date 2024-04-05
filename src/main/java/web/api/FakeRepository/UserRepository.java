package web.api.FakeRepository;

import org.springframework.stereotype.Repository;
import web.api.model.usuario;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(usuario _usuario){
        if(_usuario.getId()==null) {
            System.out.println("SAVE - Recebendo o usuário na camada de repositorio");
        }
        else{
            System.out.println("UPDATE - Recebendo o usuário na camada de repositorio");
        }
        System.out.println(_usuario);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - RECEBENDO o id: %d para excluir um usuario", id));
        System.out.println(id);
    }
    public List<usuario> findAll(){
        System.out.println("LIST  - listando os usuários do sistema");
        List<usuario> usuarios = new ArrayList<>();
        usuarios.add(new usuario("Iran", "12234"));
        usuarios.add(new usuario("RQ", "8579"));
        return usuarios;
    }
    public usuario findById(Integer id){
        System.out.println(("Find/iD - Recebendo o username"));
        return new usuario("Iran", "12234");
    }
    public usuario findByUsername(String username){
        System.out.println(String.format("Find/username - Recebendo o username"));
        return new usuario("Iran", "12234");
    }
}
