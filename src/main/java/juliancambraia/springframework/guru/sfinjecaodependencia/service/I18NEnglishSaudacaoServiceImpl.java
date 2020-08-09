package juliancambraia.springframework.guru.sfinjecaodependencia.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile("EN")
@Service("i18nService")
public class I18NEnglishSaudacaoServiceImpl implements SaudacaoService {
    @Override
    public String saudar() {
        return "i18n - EN";
    }
}
