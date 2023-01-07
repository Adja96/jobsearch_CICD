package sn.isi.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.isi.entities.AppIAEntity;

public interface IAppIARespository extends JpaRepository<AppIAEntity, Integer>  {
}
