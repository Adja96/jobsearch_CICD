package sn.isi.mapping;

import org.mapstruct.Mapper;
import sn.isi.dto.AppIEF;
import sn.isi.entities.AppIEFEntity;

@Mapper
public interface AppIEFMapper {
    AppIEF toAppIef(AppIEFEntity appIEFEntity);
    AppIEFEntity fromAppIef(AppIEF appIEF);
}