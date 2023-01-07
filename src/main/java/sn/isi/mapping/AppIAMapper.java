package sn.isi.mapping;
import org.mapstruct.Mapper;
import sn.isi.dto.AppIA;
import sn.isi.entities.AppIAEntity;


@Mapper
public interface AppIAMapper {
    AppIA toAppIA(AppIAEntity appIAEntity);

    AppIAEntity fromAppIa(AppIA appIA);
}
