package com.erpg.erpg.domain.dto.person;

import com.erpg.erpg.api.model.Profile;
import lombok.Data;

@Data
public class PersonDTO {

    private String personName;
    private String personEmail;
    private String personDocument;
    private String personInstitutionalId;
    private Profile personProfile;
}
